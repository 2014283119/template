package com.tangshi.templatetest.mapper.db2;

import com.tangshi.templatetest.anno.db2Dao;
import com.tangshi.templatetest.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@db2Dao
@Mapper
public interface db2Mapper {
    List<UserInfo> findAll();

        List<UserInfo> findByUserId(@Param("userId") String userId);
}
