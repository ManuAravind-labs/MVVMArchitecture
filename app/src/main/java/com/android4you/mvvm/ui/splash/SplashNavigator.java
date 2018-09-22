package com.android4you.mvvm.ui.splash;

import com.android4you.mvvm.data.model.MakeReponse;

import java.util.List;

/**
 * Created by manu on 8/29/2018.
 */

public interface SplashNavigator {

    void openLoginActivity();

    void openMainActivity();

    void handleError(Throwable throwable);

    void updateBlog(List<MakeReponse> blogList);
}