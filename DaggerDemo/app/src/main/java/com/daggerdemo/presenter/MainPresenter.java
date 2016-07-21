package com.daggerdemo.presenter;

import com.daggerdemo.ui.MvpView;

import javax.inject.Inject;

/**
 * @创建者 luhui
 * @创时间 2016-07-14 17:23
 * @描述 TODO
 */
public class MainPresenter {
    private static final String TAG = "MainPresenter";
    MvpView mMvpView;

    @Inject
    MainPresenter(MvpView mvpView) {
        mMvpView = mvpView;
    }

    public void loadData() {
        mMvpView.showData();
    }

}
