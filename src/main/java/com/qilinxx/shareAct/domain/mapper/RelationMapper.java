package com.qilinxx.shareAct.domain.mapper;


import com.qilinxx.shareAct.domain.model.Relation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface RelationMapper extends Mapper<Relation> {
    List<Relation> selectAllByInviteId(@Param("uid") String id);
}