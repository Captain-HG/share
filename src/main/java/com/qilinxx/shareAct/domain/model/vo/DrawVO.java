package com.qilinxx.shareAct.domain.model.vo;

import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Draw;
import com.qilinxx.shareAct.domain.model.User;

public class DrawVO  {
    private User user;
    private Activity activity;
    private  Draw draw;

    public Draw getDraw() {
        return draw;
    }

    public void setDraw(Draw draw) {
        this.draw = draw;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "DrawVO{" +
                "user=" + user +
                ", activity=" + activity +
                ", draw=" + draw +
                '}';
    }
}
