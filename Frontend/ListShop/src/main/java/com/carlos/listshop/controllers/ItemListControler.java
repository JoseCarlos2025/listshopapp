package com.carlos.listshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.listshop.entity.models.ItemList;
import com.carlos.listshop.entity.services.IItemListService;

@CrossOrigin(origins="*")
@RestController
public class ItemListControler {
	
	@Autowired
	IItemListService listService;
	
	@GetMapping("/itemlist")
	public List<ItemList> getAllList(){
		return listService.getAll();
	}
	
	@GetMapping("/itemlist/{id}")
	public ItemList getOne(@PathVariable(value = "id") long id) {
		return listService.get(id);
	}
	
	@PostMapping("/itemlist")
	public void post(ItemList list) {
		listService.post(list);
	}
	
	@PutMapping("/itemlist/{id}")
	public void put(@PathVariable(value = "id")long id,ItemList list) {
		listService.put(list, id);
	}
	
	@DeleteMapping("/itemlist/{id}")
	public void delete(@PathVariable(value = "id") long id) {
		listService.delete(id);
	}
}
