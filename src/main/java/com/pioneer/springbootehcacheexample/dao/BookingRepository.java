package com.pioneer.springbootehcacheexample.dao;

import org.springframework.data.repository.CrudRepository;

import com.pioneer.springbootehcacheexample.model.Booking;

public interface BookingRepository extends CrudRepository<Booking,Integer> {
}
