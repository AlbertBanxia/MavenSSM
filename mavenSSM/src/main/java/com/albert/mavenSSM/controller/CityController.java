package com.albert.mavenSSM.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.albert.mavenSSM.dao.CityMapper;
import com.albert.mavenSSM.entity.City;

@Controller
@RequestMapping("city")
public class CityController {
	
	@Autowired
	private CityMapper cityMapper123;
	
	@RequestMapping("test")
	@ResponseBody
	public HashMap test(){
		HashMap<String,Object> m = new HashMap<>();
		//m.put("hah", cityMapper.getCityById());
		City c = cityMapper123.selectByPrimaryKey2((Integer)3);
		System.out.println(c.getCountry());
		m.put("hah", c);
		return m;
	}
}
