package com.qilinxx.shareAct.domain.vo;

import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Relation;
import com.qilinxx.shareAct.domain.model.User;

/**
 * @Auther: dqsdc
 * @Date: 2018-10-12 16:14
 * @Description:
 */
public class RelationVo extends Relation {

    private User invitee;

    private Activity activity;

    public User getInvitee() {
        return invitee;
    }

    public void setInvitee(User invitee) {
        this.invitee = invitee;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "RelationVo{" +
                ", invitee=" + invitee +
                ", activity=" + activity +
                '}';
    }
}
