package com.liveasy.liveasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liveasy.liveasy.entities.Truck;

public interface Dao extends JpaRepository<Truck, Long> {

}
