package com.hq.dream.base.mvp.view;

import android.support.annotation.StringRes;

/**
 * Created by lihuiqiang on 2018/2/1 0001.
 *
 * view类的基础参与者，视图响应
 *
 * 在对应的present中去拿到数据进行页面的响应操作
 *
 * 基类
 */

public interface IBaseView {

    /**
     * 弹出提示
     * @param msg
     */
    void showMessageToast(String msg);
    /**
     * 弹出提示
     * @param res
     */
    void showMessageToast(@StringRes int res);
    /**
     * 弹出加载框
     */
    void showLoadingDialog();
    /**
     * 隐藏加载框
     */
    void dissmissLoadingDialog();

}
