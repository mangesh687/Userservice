package com.hotelservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.entity.NewCxEntity;
import com.hotelservice.exception.ResourcenotFoundException;
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

	@Override
	public List<NewCxEntity> alldata() {
		// TODO Auto-generated method stub
		return newcxRepo.findAll();
	}

	@Override
	public NewCxEntity getdata1(Integer id) {
		NewCxEntity cx=newcxRepo.findById(id).orElseThrow(()->new ResourcenotFoundException("hotel with given id is not found !!"));
		
		
		
		return cx;
	}

	

}
