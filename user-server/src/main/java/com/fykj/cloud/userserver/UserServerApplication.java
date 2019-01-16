package com.fykj.cloud.userserver;

import com.fykj.cloud.commons.tkmapper.MyMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
*描述：    用户中心
*@author lis
*@date 2018/12/24 17:00
*/
@MapperScan(basePackages ={ "com.fykj.cloud.userserver.mapper"},markerInterface = MyMapper.class)
@ComponentScan(basePackages = {"com.fykj.cloud"})
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class UserServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServerApplication.class, args);
    }

}

