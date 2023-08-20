Kotlin Chronometer App
A simple chronometer app built with Kotlin.

Features:
Start, pause and reset chronometer
Timer continues when app is in background
Clean UI with start, pause and reset buttons
Used Android Chronometer API
Usage
The main interface has a large centered chronometer text displaying hours, minutes, seconds.

Below are three buttons:
Start - Begins running the chronometer timer
Pause - Pauses the timer at current time
Reset - Stops timer and resets to 00:00
Tap Start to begin the timer. It will continue running when app is in background.

Code Overview:
Built using Kotlin and XML layouts.

MainActivity.kt :
Sets up binding to XML views
Implements click listeners for the buttons
Uses SystemClock and Chronometer base to manage timer timing
Toggles visibilities of Start and Pause buttons
activity_main.xml
Declares Chronometer, ImageButtons, constraint layout
Sets up layout with centered chronometer timer
Places start, pause and reset buttons below

AndroidManifest.xml:
Defines app theme, API level

Declares MainActivity
Building
This project requires minimum SDK 21.

Built with Android Studio using Jetpack ViewBinding.

Here are the screenshots of the application : 
![Screenshot_20230820_113306](https://github.com/armaganaysu/ChronometerApp/assets/94437537/82416f74-076f-49ff-bd4c-47702dd75086)
![Screenshot_20230820_113218](https://github.com/armaganaysu/ChronometerApp/assets/94437537/4a6696ce-1503-48f4-b176-078835732579)

