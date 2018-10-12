package com.qilinxx.shareAct.service.Impl;

import com.qilinxx.shareAct.domain.mapper.ProvideMapper;
import com.qilinxx.shareAct.domain.model.Provide;
import com.qilinxx.shareAct.service.ProvideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 余小北
 * @Date: 2018/10/12 09:54
 * @Description:
 */
@Service
public class ProvideServiceImpl implements ProvideService {
    @Autowired
    ProvideMapper provideMapper;

    @Override
    public Provide selectProvideById(String id) {
        return provideMapper.selectByPrimaryKey(id);
    }

}
