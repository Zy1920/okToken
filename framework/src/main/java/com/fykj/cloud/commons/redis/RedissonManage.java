package com.fykj.cloud.commons.redis;

import lombok.extern.log4j.Log4j2;
import org.redisson.Redisson;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author wky
 * @date 2018/11/29
 */
@Component
@Log4j2
public class RedissonManage {
    private Config config = new Config();

    private Redisson redisson = null;

    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.password}")
    private String password;
    @Value("${spring.redis.port}")
    private int port;

    @PostConstruct
    private void init() {
        try {
            config.useSingleServer().setAddress("redis://" + host + ":" + port).setPassword(password);
            redisson = (Redisson) Redisson.create(config);
            log.info("初始化Redisson完成。");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Redisson 初始化失败。");
        }
    }

    public Redisson getRedisson() {
        return redisson;
    }
}
