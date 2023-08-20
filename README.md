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
