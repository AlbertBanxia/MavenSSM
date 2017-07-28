package com.albert.mavenSSM.dao;

import com.albert.mavenSSM.entity.Chinaarea;

public interface ChinaareaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Chinaarea record);

    int insertSelective(Chinaarea record);

    Chinaarea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Chinaarea record);

    int updateByPrimaryKey(Chinaarea record);
}