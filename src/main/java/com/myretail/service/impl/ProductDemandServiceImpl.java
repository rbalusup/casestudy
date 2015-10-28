package com.myretail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myretail.dao.ProductDemandDao;
import com.myretail.entity.ProductDemand;
import com.myretail.service.ProductDemandService;

@Service
public class ProductDemandServiceImpl implements ProductDemandService {
	
	@Autowired 
	private ProductDemandDao ProductDemandDAO;

	/**
	* Default Constructor
	*/
	public ProductDemandServiceImpl() {
	super(); 
	}

	@Override 
	public ProductDemand createProductDemand(ProductDemand ProductDemand) { 
	return ProductDemandDAO.createProductDemand(ProductDemand);
	}

	@Override 
	public ProductDemand getProductDemand(int id) { 
	return ProductDemandDAO.getProductDemand(id);
	}

	@Override 
	public ProductDemand updateProductDemand(ProductDemand ProductDemand) { 
	return ProductDemandDAO.updateProductDemand(ProductDemand);
	}

	@Override 
	public void deleteProductDemand(int id) { 
	ProductDemandDAO.deleteProductDemand(id);
	}

	@Override 
	public List<ProductDemand> getAllProductDemands() { 
	return ProductDemandDAO.getAllProductDemands();
	}
}