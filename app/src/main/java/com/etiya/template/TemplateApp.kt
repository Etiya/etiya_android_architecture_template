package com.etiya.template

import android.app.Application
import androidx.compose.runtime.Stable
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
@Stable
class TemplateApp : Application()