package com.zhongcheng.oa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.zhongcheng.oa.common.service.impl.SuperServiceImpl;
import com.zhongcheng.oa.config.datasources.DB_Key;
import com.zhongcheng.oa.dao.AdvertiserInfoMapper;
import com.zhongcheng.oa.entity.AdvertiserInfo;
import com.zhongcheng.oa.service.AdvertiserInfoService;

import java.util.List;
import java.util.function.Function;

/**
 * @Title: AdvertiserInfoImpl
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-10 18:16
 * @Modified By: Who(When)
 * @Version v1.0
 **/
@Service
@DS(DB_Key.HU_DONG)
public class AdvertiserInfoImpl extends SuperServiceImpl<AdvertiserInfoMapper, AdvertiserInfo> implements AdvertiserInfoService {

    @Override
    public List<AdvertiserInfo> select() {
        return baseMapper.selectList(null);
    }

    @Override
    public Object l(Function<AdvertiserInfoService, Object> f) {

         return f.apply(this);
    }




}
