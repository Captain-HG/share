package com.qilinxx.shareAct.service;


import com.qilinxx.shareAct.domain.model.Relation;
import com.qilinxx.shareAct.domain.model.vo.LRelationVO;
import com.qilinxx.shareAct.domain.vo.RelationVo;
import com.qilinxx.shareAct.service.Impl.UserException;

import java.util.List;
/**
 * @author lzc
 * @date 2018/10/15 11:04
 * @Description:
 */
public interface RelationService {
    void addRelation(String uId,String iId,String aId) throws UserException;   // 增加关系
    List<RelationVo> getRelation(String inviteId);  //通过邀请人获得所有被他邀请的关系
    List<Relation>   selectAll();

    List<LRelationVO> selectAllRelationVO();
}
