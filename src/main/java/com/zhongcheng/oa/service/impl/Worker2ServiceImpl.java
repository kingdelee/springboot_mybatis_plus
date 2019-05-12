package com.zhongcheng.oa.service.impl;

import com.zhongcheng.oa.dao.WorkerMapper;
import com.zhongcheng.oa.entity.Worker;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title: WorkerServiceImpl
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-10 14:53
 * @Modified By: Who(When)
 * @Version v1.0
 **/
@Service
public class Worker2ServiceImpl  {

    @Resource
    WorkerMapper workerMapper;

    public List<Worker> t1(){
        return workerMapper.selectList(null);
    }

}
