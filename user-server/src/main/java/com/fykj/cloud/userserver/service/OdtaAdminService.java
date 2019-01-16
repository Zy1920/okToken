package com.fykj.cloud.userserver.service;

import com.fykj.cloud.model.entity.user.OdtaAdmin;

/**
*描述：
*@author lis
*@date 2018/12/25 10:15
*/

public interface OdtaAdminService {
    OdtaAdmin selectOdtaAdminById(Integer id);

    Integer testSaveToRedis();
}
