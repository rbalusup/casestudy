package com.myretail.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myretail.dao.ProductLocationDemandDao;
import com.myretail.entity.ProductLocationDemand;
import com.myretail.util.MyCassandraTemplate;

@Repository
public class ProductLocationDemandDaoImpl implements ProductLocationDemandDao {
	
	@Autowired
	private MyCassandraTemplate myCassandraTemplate;

	@Override
	public ProductLocationDemand createProductLocationDemand(ProductLocationDemand productLocationDemand) { 
	return myCassandraTemplate.create(productLocationDemand);
	}

	@Override
	public ProductLocationDemand getProductLocationDemand(int id) { 
	return myCassandraTemplate.findById(id, ProductLocationDemand.class);
	}

	@Override
	public ProductLocationDemand updateProductLocationDemand(ProductLocationDemand productLocationDemand) { 
	return myCassandraTemplate.update(productLocationDemand, ProductLocationDemand.class);
	}

	@Override
	public void deleteProductLocationDemand(int id) { 
		myCassandraTemplate.deleteById(id, ProductLocationDemand.class);
	}

	@Override
	public List<ProductLocationDemand> getAllProductLocationDemands() { 
		return myCassandraTemplate.findAll(ProductLocationDemand.class);
	}
}