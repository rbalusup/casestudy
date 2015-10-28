package com.myretail.dao;

import java.util.List;

import com.myretail.entity.Location;

public interface  LocationDao {
	public Location createLocation(Location location);

	
	public Location getLocation(int id);

	public Location updateLocation(Location location);

	public void deleteLocation(int id);

	public List<Location> getAllLocations();
}