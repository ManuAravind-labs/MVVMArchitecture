package com.android4you.mvvm.data.remote;

import com.android4you.mvvm.data.model.MakeReponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by manu on 8/29/2018.
 */

public interface ApiService {

    @GET("products.json")
    Observable<List<MakeReponse>> fetchmakeupProduct();
}