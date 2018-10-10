package com.qilinxx.shareAct.domain.mapper;

import com.qilinxx.shareAct.domain.model.Activity;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface ActivityMapper extends Mapper<Activity> {
}