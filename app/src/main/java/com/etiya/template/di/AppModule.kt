package com.etiya.template.di

import android.content.Context
import androidx.compose.runtime.Stable
import com.etiya.template.TemplateApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Stable
@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): TemplateApp {
        return app as TemplateApp
    }

}