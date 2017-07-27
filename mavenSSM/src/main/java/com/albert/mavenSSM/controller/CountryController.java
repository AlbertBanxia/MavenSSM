package com.albert.mavenSSM.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.albert.mavenSSM.dao.CountryMapper;
import com.albert.mavenSSM.entity.Country;

@Controller
@RequestMapping("country")
public class CountryController {
	
	@Autowired
	private CountryMapper countryMapper123;
	
	@RequestMapping("getCountry")
	@ResponseBody
	public HashMap test(){
		HashMap<String,Object> m = new HashMap<>();
		Country c= countryMapper123.selectByPrimaryKey2("AFG");
		m.put("haha", c);
		//System.out.println(c.getCityList().get(1).getName());
		return m;
	}
}
