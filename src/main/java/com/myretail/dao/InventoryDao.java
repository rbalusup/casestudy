package com.myretail.dao;

import java.util.List;

import com.myretail.entity.Inventory;

public interface  InventoryDao {
	public Inventory createInventory(Inventory inventory);
	public Inventory getInventory(int id);

	public Inventory updateInventory(Inventory inventory);

	public void deleteInventory(int id);

	public List<Inventory> getAllInventories();
}