package com.hq.dream.base.mvp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.hq.dream.base.mvp.present.BasePresentImpl;
import com.hq.dream.base.mvp.view.IBaseView;

/**
 * Created by lihuiqiang on 2018/2/1 0001.
 */

public abstract class BaseMVPFragment<V extends IBaseView,P extends BasePresentImpl<V>>
        extends BaseFragment implements IBaseView{

    private P mPresent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresent = initPresent();
        mPresent.attachView((V) this);
    }

    @Override
    public void onDestroy() {
        if (isHidden()){
            dissmissLoadingDialog();
        }
        if (mPresent != null){
            mPresent.detachView();
        }
        super.onDestroy();
    }

    @Override
    public void showMessageToast(String msg) {

    }

    @Override
    public void showMessageToast(int res) {

    }

    @Override
    public void showLoadingDialog() {

    }

    @Override
    public void dissmissLoadingDialog() {

    }

    abstract P initPresent();


}
