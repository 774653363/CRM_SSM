package ek.zhou.service;

import java.util.List;

import ek.zhou.pojo.Dictionary;

public interface DictionaryService {
	public List<Dictionary> findByCode(String code);

}
