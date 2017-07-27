package com.albert.mavenSSM.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.albert.mavenSSM.entity.City;

@Repository
public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);
    
    @Select("select * from city where ID=#{id}")
    @ResultMap("AssociationResultMap")
    City selectByPrimaryKey2(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
    
    @Select("select * from city where CountryCode = #{code}")
    @ResultMap("BaseResultMap")
    List<City> selectCityByCountryCode(String code);
}