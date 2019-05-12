package com.zhongcheng.oa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongcheng.oa.common.service.SuperService;
import com.zhongcheng.oa.entity.Worker;

import java.util.List;

/**
 * @Title: WorkerService
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-10 14:53
 * @Modified By: Who(When)
 * @Version v1.0
 **/
public interface WorkerService extends SuperService<Worker> {

    List<Worker> select();
}
