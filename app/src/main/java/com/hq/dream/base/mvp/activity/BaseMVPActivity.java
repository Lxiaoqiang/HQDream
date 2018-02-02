package com.hq.dream.base.mvp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hq.dream.base.mvp.present.BasePresentImpl;
import com.hq.dream.base.mvp.view.IBaseView;

/**
 * Created by lihuiqiang on 2018/2/1 0001.
 * mvp基类activity
 * 将present和view封装到一起
 *
 * activity要持有present的引用
 *
 * 类的完成过程
 * 1.activity要持有present的引用，也就是mPresent
 * 2.mPresent的产生应该是由具体的类去产生
 */

public abstract class BaseMVPActivity<V extends IBaseView,P extends BasePresentImpl<V>> extends BaseActivity implements IBaseView{

    protected P mPresent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresent = initPresent();
        mPresent.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        if (isFinishing()){
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

    public abstract P initPresent();

}
