package com.carlos.listshop.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.listshop.entity.models.ItemList;
import com.carlos.listshop.entity.dao.IItemListDao;

@Service
public class ItemListServiceImpl implements IItemListService {

	@Autowired
	private IItemListDao itemListDao;

	@Override
	public ItemList get(long id) {
		return itemListDao.findById(id).get();
	}

	@Override
	public List<ItemList> getAll() {
		return (List<ItemList>) itemListDao.findAll();
	}

	@Override
	public void post(ItemList itemList) {
		itemListDao.save(itemList);

	}

	@Override
	public void put(ItemList itemList, long id) {
		itemListDao.findById(id).ifPresent((x) -> {
			itemList.setId(id);
			itemListDao.save(itemList);
		});
	}

	@Override
	public void delete(long id) {
		itemListDao.deleteById(id);

	}

}
