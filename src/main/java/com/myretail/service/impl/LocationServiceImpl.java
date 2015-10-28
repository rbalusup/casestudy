package com.myretail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myretail.dao.LocationDao;
import com.myretail.entity.Location;
import com.myretail.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired 
	private LocationDao LocationDAO;

	/**
	* Default Constructor
	*/
	public LocationServiceImpl() {
	super(); 
	}

	@Override 
	public Location createLocation(Location Location) { 
	return LocationDAO.createLocation(Location);
	}

	@Override 
	public Location getLocation(int id) { 
	return LocationDAO.getLocation(id);
	}

	@Override 
	public Location updateLocation(Location Location) { 
	return LocationDAO.updateLocation(Location);
	}

	@Override 
	public void deleteLocation(int id) { 
	LocationDAO.deleteLocation(id);
	}

	@Override 
	public List<Location> getAllLocations() { 
	return LocationDAO.getAllLocations();
	}
}