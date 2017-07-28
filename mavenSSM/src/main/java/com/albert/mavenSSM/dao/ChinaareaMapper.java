package com.albert.mavenSSM.dao;

import org.springframework.stereotype.Repository;

import com.albert.mavenSSM.entity.Chinaarea;

@Repository
public interface ChinaareaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Chinaarea record);

    int insertSelective(Chinaarea record);

    Chinaarea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Chinaarea record);

    int updateByPrimaryKey(Chinaarea record);
}