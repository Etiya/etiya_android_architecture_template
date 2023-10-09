# Etiya Modern Android Architecture Template

In this article, we will explore how to create a modern Android template using Python code and demonstrate how users can easily generate Android app templates through the command line interface (CLI).

## Clean Architecture with 3 Main Modules

- **Presentation Layer:** This layer is responsible for UI components, such as Screens and ViewModels. In our case, Jetpack Compose will be used for building the UI.

- **Domain Layer:** This layer contains the business logic and use cases of your application. It is agnostic to the Android framework and should be testable independently.

- **Data Layer:** This layer deals with data sources like databases, network calls, and repositories that provide data to the domain layer.

## Jetpack Compose

Jetpack Compose is a modern Android UI toolkit that simplifies the process of building UIs. It leverages a declarative syntax, making UI development more intuitive and efficient. With Jetpack Compose, UI components are created as composable functions, allowing for a more modular and reusable UI codebase.

You can integrate Jetpack Compose seamlessly with MVVM and Clean Architecture to create beautiful and responsive UIs that interact with the basic data through ViewModel.

## Version Catalog

Gradle version catalogs enable you to add and maintain dependencies and plugins in a scalable way. So instead of hardcoding dependency names and versions in individual build files, we define them in the catalog and use them in all of your modules.

## Tech Stack

- **Kotlin:** The futuristic programming language that can run on JVM! It's the officially supported programming language for Android Studio, and the community is moving rapidly from Java to Kotlin.

- **Android KTX:** Concise and idiomatic Kotlin library for Jetpack and Android platform APIs.

- **Lifecycle:** Designed to perform actions based on lifecycle changes of components like activities and fragments.

- **Kotlin Coroutines:** A concurrency design pattern that simplifies async code execution on Android.

- **Retrofit:** The REST Client for Java and Android by Square Inc. under Apache 2.0 license. It's a simple network library used for network transactions and capturing JSON responses from web services.

- **GSON:** The JSON Parser that understands Kotlin non-nullable and default parameters.

- **Hilt:** A dependency injection library for Android that reduces the boilerplate of manual dependency injection.

- **OkHttp3:** This library is used by some of the largest apps out there, and for good reason: it's fast, reliable, and easy to use.

- **Coil:** Tired of dealing with slow and clunky image loading libraries? Say goodbye to your troubles and hello to Coil! This sleek and powerful library makes loading images a breeze, with an intuitive API and impressive performance.

- **Room:** Need a database solution that just works? Room has got you covered! This powerful library makes it easy to store and retrieve data from a SQLite database, with an intuitive API and robust feature set. Whether you're building a simple to-do list app or a complex CRM system, Room has everything you need.

## Getting Started

1. Open a Terminal window.

2. Check if you have Homebrew installed. If you don't have it, you can install it by following the instructions at [Homebrew](https://brew.sh/).

3. Once Homebrew is installed, you can install Python 3 by running:

    ```
    brew install python
    ```

4. After Python 3 is installed, check its version:

    ```
    python3 --version
    ```

5. To install the requests library, use the following command:

    ```
    python3 -m pip install requests
    ```

6. Then, paste the following command at a terminal, replacing `PROJECT_NAME` and `APP_PACKAGE_NAME`, and execute it:

    ```
    python3 -c "$(curl -fsSL https://raw.githubusercontent.com/Etiya/etiya_android_architecture_template/main/create-android-kotlin-app.py)" PROJECT_NAME APP_PACKAGE_NAME
    ```

## Folder Structure

   ```
├── app
│   ├── build.gradle.kts
│   ├── proguard-rules.pro
│   └── src
│       ├── androidTest
│       │   └── java
│       │       └── com
│       │           └── etiya
│       │               └── template
│       │                   └── ExampleInstrumentedTest.kt
│       ├── main
│       │   ├── AndroidManifest.xml
│       │   ├── java
│       │   │   └── com
│       │   │       └── etiya
│       │   │           └── template             
│       │   │               ├── TemplateApp.kt
│       │   │               ├── data
│       │   │               │   ├── local
│       │   │               │   │   ├── dao
│       │   │               │   │   │   ├── AppDao.kt
│       │   │               │   │   │   └── BaseDao.kt
│       │   │               │   │   └── db
│       │   │               │   │       └── AppDatabase.kt
│       │   │               │   ├── model
│       │   │               │   │   ├── BaseEntity.kt
│       │   │               │   │   ├── request
│       │   │               │   │   │   └── BaseRequest.kt
│       │   │               │   │   └── response
│       │   │               │   │       └── BaseResponse.kt
│       │   │               │   ├── remote
│       │   │               │   │   ├── api
│       │   │               │   │   │   └── CoreAPI.kt
│       │   │               │   │   └── utils
│       │   │               │   │       ├── Constants.kt
│       │   │               │   │       └── Resource.kt
│       │   │               │   └── repository
│       │   │               │       └── BaseRepositoryImpl.kt
│       │   │               ├── di
│       │   │               │   ├── AppModule.kt
│       │   │               │   ├── DatabaseModule.kt
│       │   │               │   └── RemoteModule.kt
│       │   │               ├── domain
│       │   │               │   ├── repository
│       │   │               │   │   └── BaseRepository.kt
│       │   │               │   └── usecases
│       │   │               │       ├── BaseCase.kt
│       │   │               │       └── BaseUseCase.kt
│       │   │               ├── presentation
│       │   │               │   ├── main
│       │   │               │       └── MainActivity.kt
│       │   │               └── ui
│       │   │                   └── theme
│       │   │                       ├── Color.kt
│       │   │                       ├── Shape.kt
│       │   │                       ├── Theme.kt
│       │   │                       └── Type.kt
│       │   └── res
│       │       ├── values
│       │           ├── colors.xml
│       │           ├── strings.xml
│       │            └── themes.xml
│       │       
│       │           
│       │           
│       └── test
│           └── java
│               └── com
│                   └── etiya
│                       └── template
│                           └── ExampleUnitTest.kt
├── build.gradle.kts
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle.kts


