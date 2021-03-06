<h1 align="center">My Notes</h1>

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![Maintainability](https://api.codeclimate.com/v1/badges/7601cd5df8b081399523/maintainability)](https://codeclimate.com/github/KKApaya/NotePad/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/7601cd5df8b081399523/test_coverage)](https://codeclimate.com/github/KKApaya/NotePad/test_coverage)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/e8bc3263d6544ba9b40db335ab3b22ab)](https://www.codacy.com/manual/KKApaya/NotePad?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=KKApaya/NotePad&amp;utm_campaign=Badge_Grade)

<p align="center">  
My Notes is a small demo application based on modern Android application tech-stacks and MVVM architecture.<br>This project is for focusing especially on the new library Dagger-Hilt of implementing dependency injection.<br>
Integrating persisted data in the database via repository pattern.
</p>

## Tech stack & Open-source libraries
 - [Kotlin](https://kotlinlang.org/) based + [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous.
 - Dagger-Hilt (alpha) for dependency injection.
 - [Parceler](https://github.com/johncarl81/pareler) - Custom Library for Parceling in Android.
 - [Leak Canary](https://github.com/square/leakcanary) - A memory leak detection library for Android.
 - [Stetho](https://github.com/facebook/stetho) - A debug bridge for Android applications.
 - [Timber](https://github.com/JakeWharton/timber) - logging.
 - [Material-Components](https://github.com/material-components/material-components-android) - Material design components
 - Architecture
   - MVVM Architecture (View - DataBinding - ViewModel - Model)
   - Repository pattern
 - JetPack
   - LiveData - notify domain layer data to views.
   - Lifecycle - dispose of observing data when lifecycle state changes.
   - ViewModel - UI related data holder, lifecycle aware.
   - Room Persistence - construct a database using the abstract layer.

## Architecture
My Notes is based on MVVM architecture and a repository pattern.

![architecture](https://user-images.githubusercontent.com/24237865/77502018-f7d36000-6e9c-11ea-92b0-1097240c8689.png)


## Credits
 - https://dribbble.com/shots/11123324-Notes-App
 
 # License
 ```xml
 Designed and developed by 0Brain 2020
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 ```