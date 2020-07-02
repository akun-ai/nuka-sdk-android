# nuka-sdk-android
## Nuka SDK Chatbot by Akun.ai

### How to implement:

1. Add it in your root build.gradle at the end of repositories:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
	
2. Add the dependency (check latest version in https://github.com/akun-ai/nuka-sdk-android/releases)

```
dependencies {
	implementation 'com.github.akun-ai:nuka-sdk-android:1.0.4'
}
```

3. Sync Gradle

4. Start ChatBotActivity: Add end-point, username and password of Akun services

##### Kotlin
```
val bundle = Bundle()
bundle.putString("akunBaseURL", "https://mychatbot.akun.ai/")
bundle.putString("akunUsername", "akun_username")
bundle.putString("akunPassword", "akun_password")

val intent = Intent (this, ChatBotActivity::class.java)
intent.putExtras(bundle)

startActivity(intent)
```

##### Java
```
Intent intent = new Intent(this, ChatBotActivity.class);
intent.putExtra("akunBaseURL", "https://mychatbot.akun.ai/");
intent.putExtra("akunUsername", "akun_username");
intent.putExtra("akunPassword", "akun_password");

startActivity(intent);
```
