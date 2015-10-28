package com.myretail.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myretail.dao.ProductSupplyDao;
import com.myretail.entity.ProductSupply;
import com.myretail.util.MyCassandraTemplate;

@Repository
public class ProductSupplyDaoImpl implements ProductSupplyDao {
	
	@Autowired
	private MyCassandraTemplate myCassandraTemplate;

	@Override
	public ProductSupply createProductSupply(ProductSupply productSupply) { 
	return myCassandraTemplate.create(productSupply);
	}

	@Override
	public ProductSupply getProductSupply(int id) { 
	return myCassandraTemplate.findById(id, ProductSupply.class);
	}

	@Override
	public ProductSupply updateProductSupply(ProductSupply productSupply) { 
	return myCassandraTemplate.update(productSupply, ProductSupply.class);
	}

	@Override
	public void deleteProductSupply(int id) { 
		myCassandraTemplate.deleteById(id, ProductSupply.class);
	}

	@Override
	public List<ProductSupply> getAllProductSupplys() { 
		return myCassandraTemplate.findAll(ProductSupply.class);
	}
}