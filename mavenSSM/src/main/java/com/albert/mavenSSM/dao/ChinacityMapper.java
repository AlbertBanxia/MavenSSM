package com.albert.mavenSSM.dao;

import org.springframework.stereotype.Repository;

import com.albert.mavenSSM.entity.Chinacity;
@Repository
public interface ChinacityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Chinacity record);

    int insertSelective(Chinacity record);

    Chinacity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Chinacity record);

    int updateByPrimaryKey(Chinacity record);
}