package com.hq.dream.main;

import android.os.Bundle;
import android.widget.Toast;

import com.hq.dream.R;
import com.hq.dream.base.mvp.activity.BaseMVPActivity;
import com.hq.dream.main.mvpresent.MainActivityPresent;
import com.hq.dream.main.mvpview.MainActivityView;

public class MainActivity extends BaseMVPActivity<MainActivityView,MainActivityPresent> implements MainActivityView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresent.loadData();
    }

    @Override
    public MainActivityPresent initPresent() {
        return new MainActivityPresent();
    }

    @Override
    public void setResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }


}
