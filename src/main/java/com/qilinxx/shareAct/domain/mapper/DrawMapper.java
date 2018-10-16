package com.qilinxx.shareAct.domain.mapper;


import com.qilinxx.shareAct.domain.model.Draw;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface DrawMapper extends Mapper<Draw> {
    Draw selectDrawByUidAid(@Param("uid") String uid, @Param("aid") String aid);

    String selectAidByUid(@Param("uid") String uid);
}