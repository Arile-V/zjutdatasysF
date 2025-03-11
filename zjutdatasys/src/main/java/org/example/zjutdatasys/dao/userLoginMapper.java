package org.example.zjutdatasys.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface userLoginMapper {
    @Select("select * from zjut_user where id = #{id}")
    public String queryPasswordById(long id);
}
