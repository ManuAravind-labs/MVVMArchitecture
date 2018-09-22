package com.android4you.mvvm.data.remote;

import com.android4you.mvvm.data.model.MakeReponse;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by manu on 8/29/2018.
 */

public interface ApiHelper {

    Observable<List<MakeReponse>> fetchmakeupProduct();
}
