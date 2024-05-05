package com.hotelservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.entity.NewCxEntity;
import com.hotelservice.repository.NewcxRepo;

@Service
public class NewcxServiceImpl implements NexcxService {
	@Autowired
	private NewcxRepo newcxRepo;

	@Override
	public NewCxEntity created(NewCxEntity newCxEntity) {
		// TODO Auto-generated method stub
		return newcxRepo.save(newCxEntity);
	}

	

}
