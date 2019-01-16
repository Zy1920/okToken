package com.fykj.cloud.model.entity.user;

import lombok.Data;

/**
 * @author lis
 * @date 2018/12/25
 */
@Data
public class OdtaAdmin {

    private static final long serialVersionUID = 611197991672067628L;

    private Integer id;

    private String unm;

    private String loginPwd;

    private Integer createTime;

    private Integer  updateTime;
}
