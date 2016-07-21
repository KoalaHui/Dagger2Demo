package com.daggerdemo.presenter;

import com.daggerdemo.ui.MvpView;

import javax.inject.Inject;

/**
 * @创建者 luhui
 * @创时间 2016-07-15 09:09
 * @描述 TODO
 */
public class Presenter {
    MvpView mMvpView;

    @Inject
    Presenter(MvpView mvpView){
        mMvpView = mvpView;
    }

}
