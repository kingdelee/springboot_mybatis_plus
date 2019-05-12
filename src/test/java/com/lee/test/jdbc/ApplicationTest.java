package com.lee.test.jdbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhongcheng.oa.config.datasources.DB_Key;
import com.zhongcheng.oa.dao.WorkerMapper;
import com.zhongcheng.oa.service.impl.Worker2ServiceImpl;
import com.zhongcheng.oa.utils.ColumnMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhongcheng.oa.OaApplication;
import com.zhongcheng.oa.entity.AdvertiserInfo;
import com.zhongcheng.oa.entity.Worker;
import com.zhongcheng.oa.service.AdvertiserInfoService;
import com.zhongcheng.oa.service.WorkerService;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OaApplication.class)
@Slf4j
public class ApplicationTest {

    private Random random = new Random();

    @Autowired
    private WorkerService workerService;


    @Autowired
    private AdvertiserInfoService advertiserInfoService;

    @Autowired
    private Worker2ServiceImpl worker2Service;

    @Resource
    WorkerMapper workerMapper;


    @Test
    public void t1(){

        List<Worker> workers =workerService.select();

        log.info(workers.toString());
    }

    @Test
    public void t2(){
        log.info("111");

        // 这样调用才会使用到@DS 自定义的数据源
//        List<AdvertiserInfo> select = advertiserInfoService.select();


        List<AdvertiserInfo> select = (List<AdvertiserInfo>) advertiserInfoService.l(f ->  f.getBaseMapper().selectList(null));


        log.info(select.toString());
        // 这样只会调用默认的master数据源
//        List<AdvertiserInfo> advertiserInfos = advertiserInfoService.getBaseMapper().selectList(null);
//        log.info(advertiserInfos.toString());
    }

    @Test
    public void t3(){
        List<Worker> workers = worker2Service.t1();
        log.info(workers.toString());
    }

    @Test
    public void conditionQuery(){
        ColumnMap columnMap = ColumnMap.build().putVal("", "").putVal("", "");
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        workerMapper.selectList(new QueryWrapper<Worker>().allEq(columnMap));
    }

}
