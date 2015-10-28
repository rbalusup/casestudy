package com.myretail.service;

import java.util.List;

import com.myretail.entity.ProductDemand;

public interface ProductDemandService {
	
	public ProductDemand createProductDemand(ProductDemand ProductDemand);

	public ProductDemand getProductDemand(int id);

	public ProductDemand updateProductDemand(ProductDemand ProductDemand);

	public void deleteProductDemand(int id);

	public List<ProductDemand> getAllProductDemands();

}
