package com.android4you.mvvm.ui.splash;

import android.content.Context;
import android.content.Intent;

import com.android.databinding.library.baseAdapters.BR;
import com.android4you.mvvm.data.model.MakeReponse;
import com.android4you.mvvm.databinding.ActivitySplashBinding;
import com.android4you.mvvm.ui.base.BaseActivity;
import android.os.Bundle;
import android.util.Log;

import com.android4you.mvvm.R;

import java.util.List;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity<ActivitySplashBinding, SplashViewModel> implements SplashNavigator {

    @Inject
    SplashViewModel mSplashViewModel;

    public static Intent newIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public SplashViewModel getViewModel() {
        return mSplashViewModel;
    }

    @Override
    public void openLoginActivity() {
       // Intent intent = LoginActivity.newIntent(SplashActivity.this);
      //  startActivity(intent);
      //  finish();
    }

    @Override
    public void openMainActivity() {
    //    Intent intent = MainActivity.newIntent(SplashActivity.this);
    //    startActivity(intent);
    //    finish();
    }

    @Override
    public void handleError(Throwable throwable) {
Log.e("Error == > ", throwable.toString());
    }

    @Override
    public void updateBlog(List<MakeReponse> blogList) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSplashViewModel.setNavigator(this);
     //   mSplashViewModel.startSeeding();
    }
}