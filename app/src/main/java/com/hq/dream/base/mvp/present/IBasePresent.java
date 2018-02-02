package com.hq.dream.base.mvp.present;

import com.hq.dream.base.mvp.view.IBaseView;

/**
 * Created by lihuiqiang on 2018/2/1 0001.
 *
 * 逻辑控制基类，获取数据，逻辑运算
 *
 * 例：一个activity要加载数据，
 *      需要通过对应的present去加载数据，
 *      然后present加载完成后，
 *      通过IBaseView去完成页面的响应操作（这里说明present中肯定是持有一个对应的IBaseView类型的引用）
 *
 *  基类
 */

public interface IBasePresent<V extends IBaseView> {

    void attachView(V v);

    void detachView();
}
