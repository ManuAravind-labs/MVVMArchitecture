package com.android4you.mvvm.di.components;

import android.app.Application;

import com.android4you.mvvm.MyApp;
import com.android4you.mvvm.di.builder.ActivityBuilder;
import com.android4you.mvvm.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by manu on 8/29/2018.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    void inject(MyApp app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
