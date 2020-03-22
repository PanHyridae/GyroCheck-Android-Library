# Gyro Check for Android
Gyro Check is a simple Android Library that will show your Gyroscope's X, Y, and Z stats in the 
bottom of your activity.
This can be used with apps and games (and soon on Android's VR platforms: Google Cardboard and Google Daydream) that use 
the Gyroscope, in order to make sure that it is working properly. When the phone is in movement and has a GyroScope that is
available, then the numbers will change between negative and positive integers, and will reset to 0 when the device is still. 
If the numbers are always at 0 and never change, then your device does not have a gyroscope or it is defective. 
The minimum SDK that this can be used with is SDK 16. Note that this library will also have some Kotlin code written for it to make the experience of using it a little bit better. This will be added in version 1.0.8. 
<p align="center">
  <img src="https://github.com/pancodemakes/GyroCheck-Android-Library/blob/master/example.gif">
  </p>

## Gradle Dependency 
<b> NOTE: THIS IS BEING MIGRATED TO ANDROIDX AND WILL NOT WORK FOR THE TIME BEING DUE TO ERRORS. THERE IS NO ESTIMATED TIME 
OF COMPLETION DUE TO WORK AND SCHOOL, AS WELL AS ART/DESIGN WORK.</b>
	
The Gradle dependency is available in <a href="https://bintray.com/mjonesdev/Libraries/GyroCheck">jCenter</a>, which is the default Repository that Android Studio uses. 
So to get started, Just add the dependency into your Gradle file. 

```gradle
dependencies {
	// ... other dependencies here
    compile 'com.marlonjones.library:GyroCheck:1.0.5'
}
```

## Use
In order to use this, you must use the Gyroscope feature. You do this by adding this to your Android Manifest:

```` <uses-feature android:name="android.hardware.sensor.gyroscope" />````

After adding this, in your activity's OnCreate, call ````GyroCheck.addTo(this);````

Then, you're done! It will show in the corner of your app as a small clear box. You can also make this into a version 
specific call by adding an if statement with it.
````
if (BuildConfig.DEBUG) {
  GyroCheck.addTo(this);
}
````
## Credits
This library uses code based off of code from <a href = "https://github.com/akexorcist/Android-Sensor-Gyroscope">Akexorcist</a> and 
their YouTube video and their original project. I used this code with modifications as I felt that it could be used for testing games, apps, and ROMs. Also huge thanks to <a href="https://github.com/TheAndroidMaster">James Fenn</a> for helping out on this. 
## License (Apache 2.0)
````
   Copyright 2017 Marlon Jones

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

````
