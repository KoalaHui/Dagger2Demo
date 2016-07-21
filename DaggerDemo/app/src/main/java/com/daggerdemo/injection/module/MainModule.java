package com.daggerdemo.injection.module;

import com.daggerdemo.MainActivity;
import com.daggerdemo.ui.MvpView;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * @创建者 luhui
 * @创时间 2016-07-14 17:29
 * @描述 TODO
 */
@Module
public class MainModule {
    private static final String TAG = "MainModule";

    @Inject
    private MainActivity mMvpView;


    public MainModule(MainActivity mvpView){
        mMvpView = mvpView;
    }

    @Provides
    MvpView provideMainView(){
        return mMvpView;
    }


}
