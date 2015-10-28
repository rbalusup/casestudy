package com.myretail.service;

import java.util.List;

import com.myretail.entity.AvailableToPromise;
import com.myretail.entity.ProductLocationDemand;

public interface ProductLocationDemandService {
	
	public ProductLocationDemand createProductLocationDemand(ProductLocationDemand productLocationDemand);

	public AvailableToPromise getProductLocationDemand(int id);

	public ProductLocationDemand updateProductLocationDemand(ProductLocationDemand productLocationDemand);

	public void deleteProductLocationDemand(int id);

	public List<ProductLocationDemand> getAllProductLocationDemands();

}
