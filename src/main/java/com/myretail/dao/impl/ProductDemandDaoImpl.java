package com.myretail.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myretail.dao.ProductDemandDao;
import com.myretail.entity.ProductDemand;
import com.myretail.util.MyCassandraTemplate;

@Repository
public class ProductDemandDaoImpl implements ProductDemandDao {
	
	@Autowired
	private MyCassandraTemplate myCassandraTemplate;

	@Override
	public ProductDemand createProductDemand(ProductDemand ProductDemand) { 
	return myCassandraTemplate.create(ProductDemand);
	}

	@Override
	public ProductDemand getProductDemand(int id) { 
	return myCassandraTemplate.findById(id, ProductDemand.class);
	}

	@Override
	public ProductDemand updateProductDemand(ProductDemand ProductDemand) { 
	return myCassandraTemplate.update(ProductDemand, ProductDemand.class);
	}

	@Override
	public void deleteProductDemand(int id) { 
		myCassandraTemplate.deleteById(id, ProductDemand.class);
	}

	@Override
	public List<ProductDemand> getAllProductDemands() { 
		return myCassandraTemplate.findAll(ProductDemand.class);
	}
}