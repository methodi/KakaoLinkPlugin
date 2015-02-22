# KakaoLinkPlugin


##<a name="automatic_installation"></a>Automatic Installation


### Cordova

The plugin can be installed via the Cordova command line interface:

1) Navigate to the root folder for your phonegap project. 2) Run the command.

```sh
cordova plugin add https://github.com/methodi/KakaoLinkPlugin.git
```

### Phonegap

The plugin can be installed using the Phonegap command line interface:

1) Navigate to the root folder for your phonegap project. 2) Run the command.

```sh
phonegap local plugin add https://github.com/methodi/KakaoLinkPlugin.git
```


##<a name="config_api_key"></a>Config API KEY

반드시 아래 경로의 string 값을 수정해주세요.

/platform/android/res/values/kakao_strings.xml

kakao_app_key : API 키값입니다.

kakao_scheme : "kakao"+API 키값입니다.

kakaolink_host : "kakaolink"가 기본값으로 수정하실 필요없습니다.

