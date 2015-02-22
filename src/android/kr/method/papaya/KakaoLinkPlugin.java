package kr.method.papaya;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.kakao.KakaoLink;
import com.kakao.KakaoParameterException;
import com.kakao.KakaoTalkLinkMessageBuilder;

public class KakaoLinkPlugin extends CordovaPlugin {
	private final String LINK = "link";
	KakaoLink kakaoLink;

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
		String message;
		String image;
		String url;
		String label;
		int width;
		int height;
		try {
			kakaoLink = KakaoLink.getKakaoLink(cordova.getActivity().getApplicationContext());
			final KakaoTalkLinkMessageBuilder kakaoTalkLinkMessageBuilder = kakaoLink.createKakaoTalkLinkMessageBuilder();

			try{
				message = options.getString("label");
				kakaoTalkLinkMessageBuilder.addText(message);
			}catch(JSONException e){
				
			}
			
			try{
				image = options.getString("image");
				width = options.getInt("width");
				height = options.getInt("height");
				kakaoTalkLinkMessageBuilder.addImage(image, width, height);
			}catch(JSONException e){
				
			}
			
			try{
				url = options.getString("webButtonUrl");
			}catch(JSONException e){
				url = "";
			}
			
			try{
				label = options.getString("webButtonText");
			}catch(JSONException e){
				label = "앱으로 이동";
			}
			
			if(!url.equals("") && !label.equals("")){
				kakaoTalkLinkMessageBuilder.addWebButton(label,url);
			}else if(url.equals("") && !label.equals("")){
				kakaoTalkLinkMessageBuilder.addWebButton(label);
			}
			
			
		} catch (KakaoParameterException e) {
			e.printStackTrace();
		}
	}
}
