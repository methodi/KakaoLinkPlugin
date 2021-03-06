
var KakaoLinkPlugin = function(){}

KakaoLinkPlugin.prototype.link = function(options) {
    successCallback = function() {};
	errorCallback = function() {};
    cordova.exec(successCallback, errorCallback, "KakaoLinkPlugin", "link", [options]);
};

if(!window.plugins) {
    window.plugins = {};
}
if(!window.plugins.kakaoLinkPlugin) {
    window.plugins.kakaoLinkPlugin = new KakaoLinkPlugin();
}

if(typeof module != 'undefined' && module.exports) {
	module.exports = KakaoLinkPlugin;
}
