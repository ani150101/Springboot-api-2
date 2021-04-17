package com.liveasy.liveasy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveasy.liveasy.dao.Dao;
import com.liveasy.liveasy.entities.Truck;

@Service
public class ServicesImpl implements Services {
	
	@Autowired
	private Dao truckDao;

	public ServicesImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addTruck(Truck truck) {
		try {
			truckDao.save(truck);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	

}
