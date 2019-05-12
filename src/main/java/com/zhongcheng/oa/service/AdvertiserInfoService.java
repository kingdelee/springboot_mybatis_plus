package com.zhongcheng.oa.service;

import org.springframework.stereotype.Service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.zhongcheng.oa.common.service.SuperService;
import com.zhongcheng.oa.config.datasources.DB_Key;
import com.zhongcheng.oa.entity.AdvertiserInfo;

import java.util.List;
import java.util.function.Function;

/**
 * @Title: AdvertiserInfoService
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-10 18:15
 * @Modified By: Who(When)
 * @Version v1.0
 **/
@Service
public interface AdvertiserInfoService extends SuperService<AdvertiserInfo>{


    List<AdvertiserInfo> select();

    Object l(Function<AdvertiserInfoService, Object> f);
}
