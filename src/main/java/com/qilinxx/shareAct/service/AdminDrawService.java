package com.qilinxx.shareAct.service;

import com.qilinxx.shareAct.domain.model.Draw;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.domain.model.vo.DrawVO;

import java.util.List;

/**
 * @author lzc
 * @date 2018/10/15 11:04
 * @Description:
 */
public interface AdminDrawService {
    /** 查询所有的抽奖记录，并封装活动VO,包括用户和活动*/
    List<DrawVO> selectAll();
    /** 根据用户id查询是否已经参加了活动*/
    Boolean selectByUId(String uId);
    /** 添加抽奖*/
    String  insertDraw(String uId, String dAId);
    /** 通过id查找Draw对象*/
    Draw selectByDId(String dId);
}
