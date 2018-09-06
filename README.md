# MVVMArchitecture
Model view viewModel Deaign Pattern

App Build.gradle
 compile 'com.google.dagger:dagger:2.11-rc2'
    annotationProcessor 'com.google.dagger:dagger-compiler:2.11-rc2'
    annotationProcessor "com.google.dagger:dagger-android-processor:2.11-rc2"
    compile 'com.google.dagger:dagger-android-support:2.11-rc2'

    // reactive
    implementation "io.reactivex.rxjava2:rxjava:$rootProject.rxjava2Version"
    implementation "io.reactivex.rxjava2:rxandroid:$rootProject.rxandroidVersion"

    // view model & lifecycles
    implementation "android.arch.lifecycle:runtime:$rootProject.lifecycle"
    implementation "android.arch.lifecycle:extensions:$rootProject.lifecycle"
    annotationProcessor "android.arch.lifecycle:compiler:$rootProject.lifecycle"

    // database
    implementation "android.arch.persistence.room:rxjava2:$rootProject.roomDatabase"
    annotationProcessor "android.arch.persistence.room:compiler:$rootProject.roomDatabase"

    //Retrofit
    implementation "com.squareup.retrofit2:retrofit:$rootProject.retrofitVersion"
    implementation "com.squareup.retrofit2:converter-gson:$rootProject.retrofitVersion"

    //OkHttp
    implementation "com.squareup.okhttp3:logging-interceptor:$rootProject.okhttpVersion"
    implementation "com.squareup.okhttp3:okhttp:$rootProject.okhttpVersion"

    //Gson
    implementation "com.google.code.gson:gson:$rootProject.gsonVersion"

    //Fresco
    implementation "com.facebook.fresco:fresco:$rootProject.frescoVersion"

    // font
    implementation "uk.co.chrisjenx:calligraphy:$rootProject.calligraphyVersion"


    implementation 'com.jakewharton.retrofit:retrofit2-rxjava2-adapter:1.0.0'

    implementation 'com.android.support:multidex:1.0.2'

    implementation 'com.android.support:recyclerview-v7:27.1.1'
