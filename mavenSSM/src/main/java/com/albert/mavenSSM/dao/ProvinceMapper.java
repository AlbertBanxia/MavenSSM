package com.albert.mavenSSM.dao;

import org.springframework.stereotype.Repository;

import com.albert.mavenSSM.entity.Province;
@Repository
public interface ProvinceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
}