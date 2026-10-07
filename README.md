# e-Expert

Kotlin Multiplatform + Compose Multiplatform app targeting Android and iOS.

## Stack

- Kotlin 2.4.20
- Compose Multiplatform 1.12.1
- Android Gradle Plugin 9.3.1 (`com.android.kotlin.multiplatform.library` for the shared module)
- Gradle 9.5.0

## Modules

- `composeApp` — shared KMP library (Android + iOS targets): UI (`App.kt`), localized strings (uz/ru via Compose resources).
- `androidApp` — thin Android application module (launcher activity, manifest, app icon) that depends on `composeApp`.
- `iosApp` — Xcode project (generated with [XcodeGen](https://github.com/yonaskolb/XcodeGen) from `iosApp/project.yml`) that embeds the `composeApp` KMP framework.

AGP 9 no longer allows a single module to apply both `com.android.application` and `org.jetbrains.kotlin.multiplatform`, so the Android app is split from the shared KMP library per [Google's current guidance](https://developer.android.com/kotlin/multiplatform/plugin).

## Running

**Android**: `./gradlew :androidApp:installDebug` or open the project in Android Studio and run the `androidApp` configuration.

**iOS**: open `iosApp/iosApp.xcodeproj` in Xcode and run the `iosApp` scheme. The Xcode build phase invokes `./gradlew :composeApp:embedAndSignAppleFrameworkForXcode` automatically to build the shared framework.

If you edit `iosApp/project.yml`, regenerate the Xcode project with `xcodegen generate` (run from `iosApp/`).
