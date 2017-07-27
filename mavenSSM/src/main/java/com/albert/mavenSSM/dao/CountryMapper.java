package com.albert.mavenSSM.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.albert.mavenSSM.entity.Country;

public interface CountryMapper {
    int deleteByPrimaryKey(String code);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(String code);

    @Select("select * from country where code=#{code}")
    @ResultMap("CollectionResultMap")
    Country selectByPrimaryKey2(String code);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}