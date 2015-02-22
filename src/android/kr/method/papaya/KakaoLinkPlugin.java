package kr.method.papaya;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class KakaoLinkPlugin extends CordovaPlugin {
	private final String LINK = "link";
	

	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		//서비스 시작
		if (action.equals(LINK)) {
			final JSONObject options = args.getJSONObject(0);
			this.link(options);
		}
		
		return false;
	}
	
	/**
	 * 카카오 링크 열기
	 */
	private void link(JSONObject options){
		LOG.d("KakaoLinkPlugin", "link");
		
	}
}
