package com.myretail.dao;

import java.util.List;

import com.myretail.entity.ProductDemand;

public interface  ProductDemandDao {
	public ProductDemand createProductDemand(ProductDemand productDemand);

	
	public ProductDemand getProductDemand(int id);

	public ProductDemand updateProductDemand(ProductDemand productDemand);

	public void deleteProductDemand(int id);

	public List<ProductDemand> getAllProductDemands();
}