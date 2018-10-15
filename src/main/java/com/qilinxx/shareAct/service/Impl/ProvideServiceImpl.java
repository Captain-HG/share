package com.qilinxx.shareAct.service.Impl;

import com.qilinxx.shareAct.domain.mapper.ProvideMapper;
import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Provide;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.service.ProvideService;
import com.qilinxx.shareAct.util.DateKit;
import com.qilinxx.shareAct.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Override
    public List<Provide> selectAll() {
        return provideMapper.selectAll();
    }

    @Override
    public String stopProvide(String pId) {
        Provide provide = provideMapper.selectByPrimaryKey(pId);
        provide.setpState("0");
        provideMapper.updateByPrimaryKeySelective(provide);
        return "停用了:"+provide.getpName();
    }

    @Override
    public String startProvide(String pId) {
        Provide provide = provideMapper.selectByPrimaryKey(pId);
        provide.setpState("1");
        provideMapper.updateByPrimaryKeySelective(provide);
        return "审核通过了:"+provide.getpName();
    }

    @Override
    public String updateProvide(Provide provide) {
        provide.setpState("0");
        provideMapper.updateByPrimaryKeySelective(provide);
        return "更新了:"+provide.getpName()+",等待审核";
    }

    @Override
    public String changePassword(String pId, String newPassword) {
        Provide provide = provideMapper.selectByPrimaryKey(pId);
        provide.setpPassword(newPassword);
        provideMapper.updateByPrimaryKeySelective(provide);
        return "更改了商家:"+provide.getpName()+"的密码";
    }

    @Override
    public String  insertProvide(Provide provide) {
        String uu32 = UUID.UU32();
        provide.setpId(uu32);
        Date now = DateKit.getNow();
        long timeLong = DateKit.getUnixTimeLong(now);
        provide.setpCreateTime((int) timeLong);
        provide.setpState("0");
        provideMapper.insertSelective(provide);
        return "新增了商家:"+provide.getpName()+",等待审核";
    }



}
