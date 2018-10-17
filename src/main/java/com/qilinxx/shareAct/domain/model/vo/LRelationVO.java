package com.qilinxx.shareAct.domain.model.vo;

import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Relation;
import com.qilinxx.shareAct.domain.model.User;

/**
 * relation的封装
 * @Author lzc
 */
public class LRelationVO {
    private User user1;//邀请者
    private User user2;//被邀请者
    private Activity activity;
    private Relation relation;

    @Override
    public String toString() {
        return "LRelationVO{" +
                "user1=" + user1 +
                ", user2=" + user2 +
                ", activity=" + activity +
                ", relation=" + relation +
                '}';
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
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
}
