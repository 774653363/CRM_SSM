package ek.zhou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ek.zhou.pojo.Customer;
import ek.zhou.pojo.Dictionary;
import ek.zhou.service.DictionaryService;
import ek.zhou.util.Page;

@Controller
public class DictionaryController {
	@Autowired
	DictionaryService dictionaryService;
	
	@ResponseBody
	@RequestMapping("/findByTypeCodeDictionary")
	public String findByCode(Dictionary dictionary){
		
		List<Dictionary> ds = dictionaryService.findByCode(dictionary.getDict_type_code());
		
		return JSONArray.toJSONString(ds);
	}
}
