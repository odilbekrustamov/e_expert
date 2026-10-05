package uz.softonic.eexpert

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController
import uz.softonic.eexpert.di.initKoin

fun MainViewController(): UIViewController = ComposeUIViewController { App() }

fun doInitKoin() = initKoin()
