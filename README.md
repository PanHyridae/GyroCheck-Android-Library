# Gyro Check
Gyro Check is a simple Android Library that will show your Gyroscope's X, Y, and Z stats in the 
bottom of your activity.
This can be used with apps and games (and soon on Android's VR platforms: Google Cardboard and Google Daydream) that use 
the Gyroscope, in order to make sure that it is working properly. When the phone is in movement and has a GyroScope that is
available, then the numbers will change between negative and positive integers, and will reset to 0 when the device is still. 
If the numbers are always at 0 and never change, then it your device does not have a gyroscope or it is defective. 
The minimum SDK that this can be used with is SDK 14.

##Use
Right now, you will need to download the .aar file from the releases tab and add compile project````(":library")```` to use this library. Soon, a jCenter link will
be available to make things easier. 

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
##Credits
This app uses code based off of code from <a href = "https://github.com/akexorcist/Android-Sensor-Gyroscope">Akexorcist</a> and 
their YouTube video. Also huge thanks to <a href="https://github.com/TheAndroidMaster">James Fenn</a> for helping out on this. 
##Example
![alt tag](https://github.com/MJonesDev/GyroCheck/blob/master/gyrogif.gif)
##License
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