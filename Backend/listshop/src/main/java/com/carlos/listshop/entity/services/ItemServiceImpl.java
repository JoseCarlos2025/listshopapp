package com.carlos.listshop.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.listshop.entity.models.Item;
import com.carlos.listshop.entity.dao.IItemDao;

@Service
public class ItemServiceImpl implements IItemService{

	@Autowired
	private IItemDao itemDao;
	
	@Override
	public Item get(long id) {
		return itemDao.findById(id).get();
	}

	@Override
	public List<Item> getAll() {
		return (List<Item>) itemDao.findAll();
	}

	@Override
	public void post(Item items) {
		itemDao.save(items);
	}

	@Override
	public void put(Item item, long id) {
		itemDao.findById(id).ifPresent((x)->{
			item.setId(id);
			itemDao.save(item);
		});
	}

	@Override
	public void delete(long id) {
		itemDao.deleteById(id);
	}

	@Override
	public List<Item> findAllFromListID(String itemListId) {
		return itemDao.findAllFromListID(itemListId);
	}
	
}
