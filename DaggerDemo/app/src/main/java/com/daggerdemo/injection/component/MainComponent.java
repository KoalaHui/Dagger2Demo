package com.daggerdemo.injection.component;

import com.daggerdemo.MainActivity;
import com.daggerdemo.injection.module.MainModule;

import dagger.Component;

/**
 * @创建者 luhui
 * @创时间 2016-07-14 17:30
 * @描述 TODO
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
