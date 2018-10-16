package com.qilinxx.shareAct.domain.model.vo;

import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Relation;
import com.qilinxx.shareAct.domain.model.User;

/**
 * relation的封装
 * @Author lzc
 */
public class LRelationVO {
    private User user;
    private Activity activity;
    private Relation relation;

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

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "RelationVO{" +
                "user=" + user +
                ", activity=" + activity +
                ", relation=" + relation +
                '}';
    }
}
