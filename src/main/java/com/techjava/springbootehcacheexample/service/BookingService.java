package com.techjava.springbootehcacheexample.service;

import com.techjava.springbootehcacheexample.dao.BookingRepository;
import com.techjava.springbootehcacheexample.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Cacheable(value = "bookingCache",key = "#bookingId", unless = "#result==null")
    public Booking getBookingById(Integer bookingId){
        System.out.println("Retrieving booking details by Id" + bookingId);
        return bookingRepository.findOne(bookingId);
    }

    @CacheEvict(value = "bookingCache", key = "#bookingId")
    public void deleteBookingById(Integer bookingId){
        bookingRepository.delete(bookingId);
    }

    @CachePut(value = "bookingCache", key = "#bookingId")
    public Booking updateBookingById(Integer bookingId, String bookingName){
        Booking booking = bookingRepository.findOne(bookingId);
        if(null != booking){
            booking.setBookingName(bookingName);
            return bookingRepository.save(booking);
        }
        return null;
    }
}
