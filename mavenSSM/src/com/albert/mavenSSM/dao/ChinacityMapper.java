package com.albert.mavenSSM.dao;

import com.albert.mavenSSM.entity.Chinacity;

public interface ChinacityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Chinacity record);

    int insertSelective(Chinacity record);

    Chinacity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Chinacity record);

    int updateByPrimaryKey(Chinacity record);
}