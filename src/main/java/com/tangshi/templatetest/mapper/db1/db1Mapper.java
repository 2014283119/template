package com.tangshi.templatetest.mapper.db1;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tangshi.templatetest.anno.db1Dao;
import com.tangshi.templatetest.domain.ConferenceBasic;
import org.apache.ibatis.annotations.Mapper;

@db1Dao
@Mapper
public interface db1Mapper extends BaseMapper<ConferenceBasic> {

}
