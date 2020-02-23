# nuka-sdk-android
## Nuka SDK Chatbot by Akun.ai

### How to release version: 

This repo is using https://jitpack.io/ to release new versions by creating a new git tag:

```
git tag x.x.x
git push --tags
```

Once the tag is created and pushed, new release will be available (can take a few minutes to refresh). 

### How to implement:

#### Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
	
#### Add the dependency

```
dependencies {
		implementation 'com.github.akun-ai:nuka-sdk-android:Tag'
}
```

#### Start ChatBotActivity

##### Kotlin
```
val intent = Intent(this, ChatBotActivity::class.java)
startActivity(intent)
```

#####Java
```
Intent intent = new Intent(this, ChatBotActivity.class);
startActivity(intent);
```