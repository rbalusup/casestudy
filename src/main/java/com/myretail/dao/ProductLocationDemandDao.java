package com.myretail.dao;

import java.util.List;

import com.myretail.entity.ProductLocationDemand;

public interface  ProductLocationDemandDao {
	public ProductLocationDemand createProductLocationDemand(ProductLocationDemand productLocationDemand);

	
	public ProductLocationDemand getProductLocationDemand(int id);

	public ProductLocationDemand updateProductLocationDemand(ProductLocationDemand productLocationDemand);

	public void deleteProductLocationDemand(int id);

	public List<ProductLocationDemand> getAllProductLocationDemands();
}