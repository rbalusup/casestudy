package com.myretail.service;

import java.util.List;

import com.myretail.entity.Location;

public interface LocationService {
	
	public Location createLocation(Location Location);

	public Location getLocation(int id);

	public Location updateLocation(Location Location);

	public void deleteLocation(int id);

	public List<Location> getAllLocations();

}
