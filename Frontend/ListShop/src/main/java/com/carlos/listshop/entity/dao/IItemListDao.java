package com.carlos.listshop.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.carlos.listshop.entity.models.ItemList;

public interface IItemListDao extends CrudRepository<ItemList, Long> {
	
}
