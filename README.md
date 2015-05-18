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

### Android
You must modify this strings.

/platform/android/res/values/kakao_strings.xml

kakao_app_key : This is an API key value.

kakao_scheme : This is string combines of "kakao" and API key value.

kakaolink_host : Default is "kakaolink". Do not change.

