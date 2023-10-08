package com.carlos.listshop.entity.services;

import java.util.List;

import com.carlos.listshop.entity.models.ItemList;

public interface IItemListService {
	public 	ItemList get(long id);
	public List<ItemList> getAll();
	public void post(ItemList list);
	public void put(ItemList list,long id);
	public void delete(long id);
}
