package com.techjava.springbootehcacheexample.dao;

import com.techjava.springbootehcacheexample.model.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking,Integer> {
}
