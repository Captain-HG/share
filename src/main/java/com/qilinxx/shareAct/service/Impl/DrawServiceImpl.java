package com.qilinxx.shareAct.service.Impl;

import com.qilinxx.shareAct.domain.mapper.DrawMapper;
import com.qilinxx.shareAct.domain.model.Draw;
import com.qilinxx.shareAct.service.DrawService;
import com.qilinxx.shareAct.util.DateKit;
import com.qilinxx.shareAct.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Auther: dqsdc
 * @Date: 2018-10-12 16:10
 * @Description:
 */
@Service
public class DrawServiceImpl implements DrawService {

    @Autowired
    DrawMapper drawMapper;
    @Override
    public String add(String uId, String aId) {
        Draw draw=drawMapper.selectDrawByUidAid(uId, aId);
        if (draw!=null) return "您已参加过本次活动";
        Draw d=new Draw();
        d.setdId(UUID.UU32());
        d.setdAId(aId);
        d.setdUId(uId);
        d.setdCreateTime(DateKit.getCurrentUnixTime());
        d.setdHadDraw(0);
        d.setdDrawNumber(1);
        d.setdInvitePeople(0);
        d.setdPoint(0);
        drawMapper.insert(d);
        return "成功添加";
    }

    @Override
    public String getDrawId(String uId) {
        System.out.println("getDraw--->"+uId);
        return drawMapper.selectAidByUid(uId);
    }

    @Override
    public Draw selectDrawByUid(String uid) {
        return drawMapper.selectDrawByUidAid(uid,null);
    }
}
