package com.myretail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.entity.AvailableToPromise;
import com.myretail.entity.ProductDemand;
import com.myretail.service.ProductDemandService;
import com.myretail.service.ProductLocationDemandService;

@RestController
public class MyRetailController {
	
	@Autowired
	private ProductDemandService productDemandService;
	
	@Autowired
	private ProductLocationDemandService productLocationService;
	
	@RequestMapping(value="/demands", method = RequestMethod.GET)
	List<ProductDemand> findAll() {
		return productDemandService.getAllProductDemands();
	}

	@RequestMapping(value = "/{product_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	protected AvailableToPromise findProductAvailability(@RequestHeader HttpHeaders headers, @PathVariable("product_id") String productId) { 
		return productLocationService.getProductLocationDemand(Integer.valueOf(productId));
	}

}
