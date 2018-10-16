package com.qilinxx.shareAct.service;

import com.qilinxx.shareAct.domain.model.Draw;

/**
 * @Auther: dqsdc
 * @Date: 2018-10-12 16:10
 * @Description:
 */
public interface DrawService {
    /**
     * 添加抽奖draw表记录
     * @param uId 用户id
     * @param aId 活动id
     * @return 若此用户在此活动已注册，则不可再次添加
     */
    String add(String uId,String aId);

    String getDrawId(String uId);

    Draw selectDrawByUid(String uid);
}
