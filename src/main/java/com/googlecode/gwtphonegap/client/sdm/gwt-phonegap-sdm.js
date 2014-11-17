(function($wnd, $doc) {
  
  var StringHelper = {};
  
  StringHelper.startsWith = function(stringToSearch, startString, position) {
    position = position || 0;
    return stringToSearch.lastIndexOf(startString, position) === position;
  };
  
  function MetaTagParser() {
    this.__parsed = false;
    this.__metaProperties = null;
  }

  MetaTagParser.prototype.__getMetaTags = function() {
    return $doc.getElementsByTagName('meta');
  };

  MetaTagParser.prototype.__parse = function() {
    var metaProps = {};
    var metas = this.__getMetaTags();

    for (var i = 0, n = metas.length; i < n; ++i) {
      var meta = metas[i];
      var name = meta.getAttribute('name');
      var value = meta.getAttribute('value');

      if (!name || !value) {
        continue;
      }

      if (StringHelper.startsWith(name, "sdm_")) {
        metaProps[name] = value;
      }
    }
    return metaProps;
  };

  MetaTagParser.prototype.get = function() {
    if (!this.__parsed) {
      this.__metaProperties = this.__parse();
      this.__parsed = true;
    }
    return this.__metaProperties;
  };

  var main = function() {
    var metaTagParser = new MetaTagParser();
    var codeserver_host = metaTagParser.get()['sdm_host'];
    var codeserver_port = metaTagParser.get()['sdm_port'];
    var module_name = metaTagParser.get()['sdm_module'];
    
    if (!codeserver_host) {
      $wnd.alert("Cannot find meta tag for sdm_host.");
      return;
    }
    
    if (!codeserver_port) {
      $wnd.alert("Cannot find meta tag for sdm_port.");
      return;
    }
    
    if (!module_name) {
      $wnd.alert("Cannot find meta tag for sdm_module.");
      return;
    }

    var script_tag = $doc.createElement('script');
    
    var script_url = 'http://' + codeserver_host + ':'  + codeserver_port + '/' + 
        'recompile-requester' + '/' + module_name;
    script_tag.src = script_url;

    var errorCallback = function() {
      if (!$wnd.__gwt_sdm__recompiler || !$wnd.__gwt_sdm__recompiler.loaded) {
        $wnd.alert("Could not load application from super dev mode. " +
            "Make sure your super dev mode server is running and url is properly configured, host: "
            + codeserver_host + " port: " + codeserver_port + " module: " + module_name);
      }
    }
    script_tag.addEventListener("error", errorCallback, true);
    $doc.head.insertBefore(script_tag, $doc.head.firstElementChild);  
  };

  if(/loaded|complete/.test($doc.readyState)) {
    main();
  } else {
    $wnd.addEventListener('load', main, false);  
  }
})(window, document);
