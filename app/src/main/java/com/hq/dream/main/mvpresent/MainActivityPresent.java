package com.hq.dream.main.mvpresent;


import com.hq.dream.base.mvp.present.BasePresentImpl;
import com.hq.dream.main.mvpview.MainActivityView;

/**
 * Created by lihuiqiang on 2018/2/1 0001.
 */

public class MainActivityPresent extends BasePresentImpl<MainActivityView>{



    public void loadData(){
        getView().setResult("加载完成，刷新界面");
    }
}
