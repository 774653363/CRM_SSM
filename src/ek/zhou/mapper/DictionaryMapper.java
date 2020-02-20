package ek.zhou.mapper;

import java.util.List;

import ek.zhou.pojo.Dictionary;

public interface DictionaryMapper {
public List<Dictionary> findByCode(String code);
}
