package com.myretail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myretail.dao.ProductSupplyDao;
import com.myretail.entity.ProductSupply;
import com.myretail.service.ProductSupplyService;

@Service
public class ProductSupplyServiceImpl implements ProductSupplyService {
	
	@Autowired 
	private ProductSupplyDao ProductSupplyDAO;

	/**
	* Default Constructor
	*/
	public ProductSupplyServiceImpl() {
	super(); 
	}

	@Override 
	public ProductSupply createProductSupply(ProductSupply ProductSupply) { 
	return ProductSupplyDAO.createProductSupply(ProductSupply);
	}

	@Override 
	public ProductSupply getProductSupply(int id) { 
	return ProductSupplyDAO.getProductSupply(id);
	}

	@Override 
	public ProductSupply updateProductSupply(ProductSupply ProductSupply) { 
	return ProductSupplyDAO.updateProductSupply(ProductSupply);
	}

	@Override 
	public void deleteProductSupply(int id) { 
	ProductSupplyDAO.deleteProductSupply(id);
	}

	@Override 
	public List<ProductSupply> getAllProductSupplys() { 
	return ProductSupplyDAO.getAllProductSupplys();
	}
}