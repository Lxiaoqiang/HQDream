package com.hq.dream.base.mvp.present;

import com.hq.dream.base.mvp.view.IBaseView;

/**
 * Created by lihuiqiang on 2018/2/1 0001.
 *
 */

public class BasePresentImpl<V extends IBaseView> implements IBasePresent<V>{

    private V view;

    @Override
    public void attachView(V v) {
        this.view = v;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    public V getView(){
        return view;
    }
}
