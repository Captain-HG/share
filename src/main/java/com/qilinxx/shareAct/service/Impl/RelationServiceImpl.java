package com.qilinxx.shareAct.service.Impl;

import com.qilinxx.shareAct.domain.mapper.RelationMapper;
import com.qilinxx.shareAct.domain.model.Relation;
import com.qilinxx.shareAct.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lzc
 * @Date: 2018/10/15 10:25
 * @Description:
 */
@Service
public class RelationServiceImpl implements RelationService {
    @Autowired
    RelationMapper relationMapper;
    @Override
    public List<Relation> selectAll() {
        return   relationMapper.selectAll();
    }
}
