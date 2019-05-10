package com.zhongcheng.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

/**
 * @Title: OaApplication
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-10 11:17
 * @Modified By: Who(When)
 * @Version v1.0
 **/
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.zhongcheng.oa.dao")
public class OaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaApplication.class, args);
    }

}

