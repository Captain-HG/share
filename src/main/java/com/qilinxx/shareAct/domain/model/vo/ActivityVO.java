package com.qilinxx.shareAct.domain.model.vo;

import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Provide;

/**
 * @author lzc
 * @Date 2018/10/15 14:10
 * 活动管理界面的展示对象
 */
public class ActivityVO  {
    private Activity activity;
    private Provide provide;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Provide getProvide() {
        return provide;
    }

    public void setProvide(Provide provide) {
        this.provide = provide;
    }

    @Override
    public String toString() {
        return "ActivityVO{" +
                "activity=" + activity +
                ", provide=" + provide +
                '}';
    }
}
