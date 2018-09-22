package com.android4you.mvvm.data.remote;

import com.android4you.mvvm.data.model.MakeReponse;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import retrofit2.Retrofit;

/**
 * Created by manu on 8/29/2018.
 */
@Singleton
public class AppApiHelper implements ApiHelper {

    private ApiService mApiService;

    @Inject
    public AppApiHelper(Retrofit ref) {
        mApiService = ref.create(ApiService.class);
    }

    @Override
    public Observable<List<MakeReponse>> fetchmakeupProduct() {
        return mApiService.fetchmakeupProduct().map(makeReponses -> makeReponses);
    }

//    @Override
//    public Observable<Contacts> fetchHiveContacts() {
//        return mApiService.fetchHiveContacts();
//    }

}
