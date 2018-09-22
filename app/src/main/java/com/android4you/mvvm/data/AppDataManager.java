package com.android4you.mvvm.data;

import android.content.Context;

import com.android4you.mvvm.data.model.MakeReponse;
import com.android4you.mvvm.data.remote.ApiHelper;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by manu on 8/29/2018.
 */

@Singleton
public class AppDataManager implements DataManager {

    private final ApiHelper mApiHelper;

    private final Context mContext;

    @Inject
    public AppDataManager(Context context, ApiHelper apiHelper) {
        mContext = context;
        mApiHelper = apiHelper;

    }

    @Override
    public Observable<List<MakeReponse>> fetchmakeupProduct() {
       // return mApiHelper.fetchmakeupProduct();
        return mApiHelper.fetchmakeupProduct();
    }


//    @Override
//    public Observable<Contacts> fetchHiveContacts() {
//        return mApiHelper.fetchHiveContacts();
//    }

}
