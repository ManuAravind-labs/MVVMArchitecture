package com.android4you.mvvm.utils.rx;

import io.reactivex.Scheduler;

/**
 * Created by manu on 8/29/2018.
 */

public interface SchedulerProvider {

    Scheduler computation();

    Scheduler io();

    Scheduler ui();
}
