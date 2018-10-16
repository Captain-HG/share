package com.qilinxx.shareAct.service.Impl;

import com.qilinxx.shareAct.domain.mapper.ActivityMapper;
import com.qilinxx.shareAct.domain.mapper.DrawMapper;
import com.qilinxx.shareAct.domain.mapper.UserMapper;
import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Draw;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.domain.model.vo.DrawVO;
import com.qilinxx.shareAct.service.AdminDrawService;
import com.qilinxx.shareAct.util.DateKit;
import com.qilinxx.shareAct.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzc
 * @date 2018/10/15 11:04
 * @Description:
 */
@Service
public class AdminDrawServiceImpl implements AdminDrawService {
    @Autowired
    DrawMapper drawMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    ActivityMapper activityMapper;
    @Override
    public List<DrawVO> selectAll() {
        List<Draw> drawList = drawMapper.selectAll();
        List<DrawVO> drawVOList = new ArrayList<>();
        for (Draw draw:drawList){
            drawVOList.add(impro(draw));
        }
        return drawVOList;
    }

    @Override
    public Boolean selectByUId(String uId) {
        String aid = drawMapper.selectAidByUid(uId);
        if (aid==null){//说明用户未参加该活动
          return true;
        }
        else {//说明用户已参加活动
            return false;
        }

    }

    @Override
    public String insertDraw(String uId, String dAId) {
        Draw d=new Draw();
        d.setdId(UUID.UU32());
        d.setdAId(dAId);
        d.setdUId(uId);
        d.setdCreateTime(DateKit.getCurrentUnixTime());
        d.setdHadDraw(0);
        d.setdDrawNumber(1);
        d.setdInvitePeople(0);
        d.setdPoint(0);
        drawMapper.insert(d);
        User user = userMapper.selectByPrimaryKey(uId);
        Activity activity = activityMapper.selectByPrimaryKey(dAId);
        return "添加了用户:"+user.getuName()+"参加："+activity.getaName()+"活动";
    }

    @Override
    public Draw selectByDId(String dId) {
        return drawMapper.selectByPrimaryKey(dId);
    }


    /**
     * 封装drawVo对象
     * @param draw 抽奖表的对象
     * @return 一个封装好的DrawVO对象
     */
    private DrawVO impro(Draw draw) {
        DrawVO drawVO = new DrawVO();
        drawVO.setDraw(draw);
        User user = userMapper.selectByPrimaryKey(draw.getdUId());
        drawVO.setUser(user);
        Activity activity = activityMapper.selectByPrimaryKey(draw.getdAId());
        drawVO.setActivity(activity);
        return drawVO;
    }
}
