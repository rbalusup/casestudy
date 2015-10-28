package com.myretail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myretail.dao.ProductLocationDemandDao;
import com.myretail.entity.AvailableToPromise;
import com.myretail.entity.ProductLocationDemand;
import com.myretail.service.ProductLocationDemandService;

@Service
public class ProductLocationDemandServiceImpl implements ProductLocationDemandService {
	
	@Autowired 
	private ProductLocationDemandDao ProductLocationDemandDAO;

	/**
	* Default Constructor
	*/
	public ProductLocationDemandServiceImpl() {
	super(); 
	}

	@Override 
	public ProductLocationDemand createProductLocationDemand(ProductLocationDemand ProductLocationDemand) { 
	return ProductLocationDemandDAO.createProductLocationDemand(ProductLocationDemand);
	}

	@Override 
	public AvailableToPromise getProductLocationDemand(int productId) { 
		ProductLocationDemand productLocationDemand = ProductLocationDemandDAO.getProductLocationDemand(productId);
		AvailableToPromise atp = buildAvailableToPromise(productLocationDemand);
		return atp;
	}

	@Override 
	public ProductLocationDemand updateProductLocationDemand(ProductLocationDemand ProductLocationDemand) { 
	return ProductLocationDemandDAO.updateProductLocationDemand(ProductLocationDemand);
	}

	@Override 
	public void deleteProductLocationDemand(int id) { 
	ProductLocationDemandDAO.deleteProductLocationDemand(id);
	}

	@Override 
	public List<ProductLocationDemand> getAllProductLocationDemands() { 
	return ProductLocationDemandDAO.getAllProductLocationDemands();
	}
	
	private AvailableToPromise buildAvailableToPromise(ProductLocationDemand productLocationDemand) {
		AvailableToPromise atp = new AvailableToPromise();
		
		
		return atp;
	}
}