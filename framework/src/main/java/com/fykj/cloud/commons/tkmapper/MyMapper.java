package com.fykj.cloud.commons.tkmapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface MyMapper<T>  extends Mapper<T>,MySqlMapper<T> {




}
