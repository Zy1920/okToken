package com.fykj.cloud.userserver.service.impl;

import com.fykj.cloud.commons.redis.RedisUtil;
import com.fykj.cloud.model.entity.user.OdtaAdmin;
import com.fykj.cloud.userserver.mapper.OdtaAdminMapper;
import com.fykj.cloud.userserver.service.OdtaAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lis
 * @date 2018/12/25
 */
@Service
public class OdtaAdminServiceImpl implements OdtaAdminService {
    @Autowired
    private OdtaAdminMapper odtaAdminMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public OdtaAdmin selectOdtaAdminById(Integer id) {
        return odtaAdminMapper.selectById(id);
    }

    @Override
    public Integer testSaveToRedis() {
        redisUtil.set("test","test");
        return 1;
    }
}
