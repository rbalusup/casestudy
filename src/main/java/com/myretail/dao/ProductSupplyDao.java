package com.myretail.dao;

import java.util.List;

import com.myretail.entity.ProductSupply;

public interface  ProductSupplyDao {
	public ProductSupply createProductSupply(ProductSupply productSupply);

	
	public ProductSupply getProductSupply(int id);

	public ProductSupply updateProductSupply(ProductSupply productSupply);

	public void deleteProductSupply(int id);

	public List<ProductSupply> getAllProductSupplys();
}