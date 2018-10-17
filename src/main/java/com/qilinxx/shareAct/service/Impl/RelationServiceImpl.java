package com.qilinxx.shareAct.service.Impl;


import com.qilinxx.shareAct.domain.mapper.ActivityMapper;
import com.qilinxx.shareAct.domain.mapper.RelationMapper;
import com.qilinxx.shareAct.domain.mapper.UserMapper;
import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Relation;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.domain.model.vo.LRelationVO;
import com.qilinxx.shareAct.domain.vo.RelationVo;
import com.qilinxx.shareAct.service.RelationService;
import com.qilinxx.shareAct.service.UserService;
import com.qilinxx.shareAct.util.DateKit;
import com.qilinxx.shareAct.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RelationServiceImpl implements RelationService {
    @Autowired
    RelationMapper relationMapper;

    @Autowired
    UserService userService;
    @Autowired
    ActivityMapper activityMapper;

    @Override
    public void addRelation(String uId, String iId, String aId) throws UserException {
        if (aId == null) throw new UserException("活动id过时，请重新注册");
        Relation relation = new Relation();
        relation.setrId(UUID.UU32());
        relation.setrUId(uId);
        relation.setrIId(iId);
        relation.setrAId(aId);
        relation.setrCreateTime(DateKit.getCurrentUnixTime());
        relationMapper.insert(relation);
    }

    @Override
    public List<RelationVo> getRelation(String inviteId) {
        List<RelationVo> relationVoList=new ArrayList<>();
        List<Relation> relations = relationMapper.selectAllByInviteId(inviteId);
        for (Relation r : relations) {
            relationVoList.add(copy(r));
        }
        return relationVoList;
    }

    private RelationVo copy(Relation relation){
        RelationVo relationVo=new RelationVo();
        relationVo.setrAId(relation.getrAId());
        relationVo.setrCreateTime(relation.getrCreateTime());
        relationVo.setrId(relation.getrId());
        relationVo.setrIId(relation.getrIId());
        relationVo.setrBackup(relation.getrBackup());
        relationVo.setrUId(relation.getrUId());
        relationVo.setInvitee(userService.selectById(relation.getrIId()));
        return relationVo;
    }

    @Override
    public List<Relation> selectAll() {
        return relationMapper.selectAll();
    }

    @Override
    public List<LRelationVO> selectAllRelationVO() {
        List<Relation> relationList = relationMapper.selectAll();
        List<LRelationVO> lRelationVOs = new ArrayList<>();
        for (Relation relation:relationList){
           lRelationVOs.add(improve(relation));
        }
        return lRelationVOs;
    }

    private LRelationVO improve(Relation relation) {
        LRelationVO lRelationVO = new LRelationVO();
        Activity activity = activityMapper.selectByPrimaryKey(relation.getrAId());
        lRelationVO.setActivity(activity);
        lRelationVO.setRelation(relation);
//        if (relation.getrUId()!=null){
//            User userUI = userService.selectById(relation.getrUId());//邀请者
//            if (userUI==null){
//                lRelationVO.setUser1(null);
//            }
//            else{
//            lRelationVO.setUser1(userUI);
//            }
//
//        }else {
//            lRelationVO.setUser1(null);
//        }
//
//        if(relation.getrIId()!=null){
//         User userII=userService.selectById(relation.getrIId());
//         if (userII==){
//
//         }
//        }
//        else{
//            lRelationVO.setUser2(null);
//        }
        User userUI = userService.selectById(relation.getrUId());//邀请者
        User userII = userService.selectById(relation.getrIId());//被邀请者
        lRelationVO.setUser1(userUI);
        lRelationVO.setUser2(userII);
        return lRelationVO;
    }
}
