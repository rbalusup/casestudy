package com.myretail.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myretail.dao.InventoryDao;
import com.myretail.entity.Inventory;
import com.myretail.util.MyCassandraTemplate;

@Repository
public class InventoryDaoImpl implements InventoryDao {
	
	@Autowired
	private MyCassandraTemplate myCassandraTemplate;

	@Override
	public Inventory createInventory(Inventory inventory) { 
	return myCassandraTemplate.create(inventory);
	}

	@Override
	public Inventory getInventory(int id) { 
	return myCassandraTemplate.findById(id, Inventory.class);
	}

	@Override
	public Inventory updateInventory(Inventory inventory) { 
	return myCassandraTemplate.update(inventory, Inventory.class);
	}

	@Override
	public void deleteInventory(int id) { 
		myCassandraTemplate.deleteById(id, Inventory.class);
	}

	@Override
	public List<Inventory> getAllInventories() { 
		return myCassandraTemplate.findAll(Inventory.class);
	}
}