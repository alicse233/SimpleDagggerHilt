package com.example.daggerhiltapp.di

import android.content.Context
import com.example.daggerhiltapp.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object MainActivityModule {

    @ActivityScoped
    @Provides
    @Named("name2")
    fun provideTestString2() = "This is string2.."

    @ActivityScoped
    @Provides
    @Named("name3")
    fun provideTestString3(
        @ApplicationContext context: Context
    ) = context.resources.getString(R.string.sp_string)

    @ActivityScoped
    @Provides
    @Named("name4")
    fun provideTestString(
        @ApplicationContext context: Context,
        @Named("name2") test2: String
    ): String {
        return "${context.resources.getString(R.string.sp_string)} - $test2"
    }

}