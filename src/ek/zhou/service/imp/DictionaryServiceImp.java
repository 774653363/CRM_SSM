package ek.zhou.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ek.zhou.mapper.DictionaryMapper;
import ek.zhou.pojo.Dictionary;
import ek.zhou.service.DictionaryService;
@Service
public class DictionaryServiceImp implements DictionaryService{
	@Autowired
	DictionaryMapper dictionaryMapper;
	@Override
	public List<Dictionary> findByCode(String code) {
		return dictionaryMapper.findByCode(code);
	}

}
