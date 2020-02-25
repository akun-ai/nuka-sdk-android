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
	implementation 'com.github.akun-ai:nuka-sdk-android:1.0.1'
}
```

3. Sync Gradle

4. Start ChatBotActivity

##### Kotlin
```
val intent = Intent(this, ChatBotActivity::class.java)
startActivity(intent)
```

##### Java
```
Intent intent = new Intent(this, ChatBotActivity.class);
startActivity(intent);
```