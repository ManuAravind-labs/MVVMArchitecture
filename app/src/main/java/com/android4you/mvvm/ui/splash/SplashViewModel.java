package com.android4you.mvvm.ui.splash;

import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.android4you.mvvm.data.DataManager;
import com.android4you.mvvm.data.model.MakeReponse;
import com.android4you.mvvm.ui.base.BaseViewModel;
import com.android4you.mvvm.utils.rx.SchedulerProvider;


import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.schedulers.Timed;


/**
 * Created by manu on 8/29/2018.
 */

public class SplashViewModel extends BaseViewModel<SplashNavigator> {
    private final MutableLiveData<List<MakeReponse>> blogListLiveData;
    public SplashViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        blogListLiveData = new MutableLiveData<>();
        startSeeding();
    }

    public void startSeeding() {
Log.e("Strta", "start");
        setIsLoading(true);
        getCompositeDisposable().add(getDataManager()
                .fetchmakeupProduct()
                .timeInterval()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<Timed<List<MakeReponse>>>() {
                    @Override
                    public void onComplete() {
                    }

                    @Override
                    public void onError(Throwable error) {
                        setIsLoading(false);
                        getNavigator().handleError(error);
                    }

                    @Override
                    public void onNext(Timed<List<MakeReponse>> productModels) {
                        setIsLoading(false);

                        for(int i = 0; i < productModels.value().size(); i++){
                            Log.e("TITLE == > ",productModels.value().get(i).getName() );
                        }
                    }
                }));
//        getCompositeDisposable().add(getDataManager()
//                .fetchmakeupProduct()
//                .subscribeOn(getSchedulerProvider().io())
//                .observeOn(getSchedulerProvider().ui())
//                .subscribe(blogResponse -> {
//                    if (blogResponse != null && blogResponse != null) {
//                        blogListLiveData.setValue(blogResponse);
//                        for(int i = 0; i < blogResponse.size(); i++){
//                            Log.e("TITLE == > ",blogResponse.get(i).getName() );
//                        }
//                    }
//                    Log.e("xcxc", "start");
//                    setIsLoading(false);
//                }, throwable -> {
//                    Log.e("xcxcccccc", "start");
//                    setIsLoading(false);
//                    getNavigator().handleError(throwable);
//                }));
    }

    private void decideNextActivity() {

            getNavigator().openMainActivity();

    }
}