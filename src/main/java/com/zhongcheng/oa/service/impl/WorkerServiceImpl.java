package com.zhongcheng.oa.service.impl;

import org.springframework.stereotype.Service;

import com.zhongcheng.oa.common.service.impl.SuperServiceImpl;
import com.zhongcheng.oa.dao.WorkerMapper;
import com.zhongcheng.oa.service.WorkerService;

/**
 * @Title: WorkerServiceImpl
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-10 14:53
 * @Modified By: Who(When)
 * @Version v1.0
 **/
@Service
public class WorkerServiceImpl<Worker> extends SuperServiceImpl<WorkerMapper<Worker>, Worker> implements WorkerService<Worker> {

}
