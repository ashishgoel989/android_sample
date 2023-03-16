package com.example.myapplication

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
class UserModule {
    @Named("sql")
    @Provides
    fun provideSQLRepo(): UserRepo{
        return SQLRepo();
    }

    @Named("firebase")
    @Provides
    fun providefirebaseRepo(): UserRepo{
        return firebaseRepo();
    }
}