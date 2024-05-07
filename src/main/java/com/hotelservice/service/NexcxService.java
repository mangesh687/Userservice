package com.hotelservice.service;

import java.util.List;

import com.hotelservice.entity.NewCxEntity;

public interface NexcxService {

	// created user
	public NewCxEntity created(NewCxEntity newCxEntity);
	public List<NewCxEntity> alldata();
	public NewCxEntity getdata1(Integer id);
	
	
}
