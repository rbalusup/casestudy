package com.myretail.service;

import java.util.List;

import com.myretail.entity.Inventory;

public interface InventoryService {
	
	public Inventory createInventory(Inventory Inventory);

	public Inventory getInventory(int id);

	public Inventory updateInventory(Inventory Inventory);

	public void deleteInventory(int id);

	public List<Inventory> getAllInventories();

}
