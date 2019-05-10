package com.lee.test.jdbc;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhongcheng.oa.OaApplication;
import com.zhongcheng.oa.entity.Worker;
import com.zhongcheng.oa.service.WorkerService;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OaApplication.class)
@Slf4j
public class ApplicationTest {

    private Random random = new Random();

    @Autowired
    private WorkerService workerService;


    @Test
    public void t1(){
        List<Worker> workers = workerService.getBaseMapper().selectList(null);
        log.info(workers.toString());
    }

}
