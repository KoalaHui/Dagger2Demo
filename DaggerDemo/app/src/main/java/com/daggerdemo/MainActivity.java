package com.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daggerdemo.injection.component.DaggerMainComponent;
import com.daggerdemo.injection.module.MainModule;
import com.daggerdemo.presenter.MainPresenter;
import com.daggerdemo.ui.MvpView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MvpView {
    @Inject
    MainPresenter mMainPresenter;
    private TextView mTextView;
    private Button   mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.tv_content);
        mButton = (Button) findViewById(R.id.btn_onclick);

        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);

        mButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mMainPresenter.loadData();
                    }
                }
        );
    }

    @Override
    public void showData() {
        mTextView.setText("你好！");
    }
}
