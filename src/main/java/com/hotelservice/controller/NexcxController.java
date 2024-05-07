package com.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PostExchange;

import com.hotelservice.entity.NewCxEntity;
import com.hotelservice.service.NewcxServiceImpl;

@RestController
public class NexcxController {
	@Autowired
	private NewcxServiceImpl newcxServiceImpl;
	@PostExchange("/create")
	public NewCxEntity crated1(@RequestBody NewCxEntity cxEntity ) {
		return newcxServiceImpl.created(cxEntity) ;
	}
	@GetMapping("/getall")
	public List<NewCxEntity> getall() {
		return newcxServiceImpl.alldata();
	}
	@GetMapping("/get/{id}")
	public NewCxEntity getid(@PathVariable Integer id) {
		return newcxServiceImpl.getdata1(id);
	}
	
	
	
	

}
