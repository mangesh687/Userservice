package com.hotelservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelservice.entity.NewCxEntity;

@Repository
public interface NewcxRepo extends JpaRepository<NewCxEntity, Integer> {

}
