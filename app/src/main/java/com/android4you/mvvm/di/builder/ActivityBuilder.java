package com.android4you.mvvm.di.builder;

import com.android4you.mvvm.ui.splash.SplashActivity;
import com.android4you.mvvm.ui.splash.SplashActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by manu on 8/29/2018.
 */

@Module
public abstract class ActivityBuilder {



    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity bindSplashActivity();
}