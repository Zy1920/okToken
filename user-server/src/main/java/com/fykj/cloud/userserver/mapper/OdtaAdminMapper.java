package com.fykj.cloud.userserver.mapper;

import com.fykj.cloud.commons.tkmapper.MyMapper;
import com.fykj.cloud.model.entity.user.OdtaAdmin;
import org.apache.ibatis.annotations.Select;


public interface OdtaAdminMapper extends MyMapper<OdtaAdmin> {

    @Select("select * from odta_admin where id= #{id}")
    OdtaAdmin selectById(Integer id);
}