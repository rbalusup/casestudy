package com.myretail.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myretail.dao.LocationDao;
import com.myretail.entity.Location;
import com.myretail.util.MyCassandraTemplate;

@Repository
public class LocationDaoImpl implements LocationDao {
	
	@Autowired
	private MyCassandraTemplate myCassandraTemplate;

	@Override
	public Location createLocation(Location Location) { 
	return myCassandraTemplate.create(Location);
	}

	@Override
	public Location getLocation(int id) { 
	return myCassandraTemplate.findById(id, Location.class);
	}

	@Override
	public Location updateLocation(Location Location) { 
	return myCassandraTemplate.update(Location, Location.class);
	}

	@Override
	public void deleteLocation(int id) { 
		myCassandraTemplate.deleteById(id, Location.class);
	}

	@Override
	public List<Location> getAllLocations() { 
		return myCassandraTemplate.findAll(Location.class);
	}
}