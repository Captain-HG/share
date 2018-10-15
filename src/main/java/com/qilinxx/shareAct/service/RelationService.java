package com.qilinxx.shareAct.service;

import com.qilinxx.shareAct.domain.model.Relation;

import java.util.List;

public interface RelationService {
    /** 获取所有*/
    List<Relation> selectAll();
}
