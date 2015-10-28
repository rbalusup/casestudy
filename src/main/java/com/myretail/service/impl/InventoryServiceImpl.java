package com.myretail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myretail.dao.InventoryDao;
import com.myretail.entity.Inventory;
import com.myretail.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired 
	private InventoryDao InventoryDAO;

	/**
	* Default Constructor
	*/
	public InventoryServiceImpl() {
	super(); 
	}

	@Override 
	public Inventory createInventory(Inventory inventory) { 
	return InventoryDAO.createInventory(inventory);
	}

	@Override 
	public Inventory getInventory(int id) { 
	return InventoryDAO.getInventory(id);
	}

	@Override 
	public Inventory updateInventory(Inventory inventory) { 
	return InventoryDAO.updateInventory(inventory);
	}

	@Override 
	public void deleteInventory(int id) { 
	InventoryDAO.deleteInventory(id);
	}

	@Override 
	public List<Inventory> getAllInventories() { 
	return InventoryDAO.getAllInventories();
	}
}