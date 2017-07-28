package com.albert.mavenSSM.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.albert.mavenSSM.dao.ProvinceMapper;
import com.albert.mavenSSM.entity.Province;

@Controller
@RequestMapping("province")
public class ProvinceController {
	
	@Autowired
	private ProvinceMapper provinceMapper;
	
	@RequestMapping("getProvince")
	@ResponseBody
	public HashMap test(){
		HashMap<String,Object> m = new HashMap<>();
		Province p= provinceMapper.selectByPrimaryKey(new Integer(7));
		m.put("haha", p);
		return m;
	}
}
