package com.pioneer.springbootehcacheexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pioneer.springbootehcacheexample.model.Booking;
import com.pioneer.springbootehcacheexample.model.BookingDTO;
import com.pioneer.springbootehcacheexample.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/id/{bookingId}")
    public Booking getBookingById(@PathVariable Integer bookingId){
        return bookingService.getBookingById(bookingId);
    }

    @DeleteMapping("/delete/{bookingId}")
    public void deleteBookingById(@PathVariable Integer bookingId){
        bookingService.deleteBookingById(bookingId);
    }

    @PutMapping("/update/{bookingId}")
    public Booking updateBookingById(@PathVariable Integer bookingId, @RequestBody BookingDTO bookingDTO){
    	
    	String bookingName = bookingDTO.getBookingName();
        return bookingService.updateBookingById(bookingId, bookingName);
    }
}
