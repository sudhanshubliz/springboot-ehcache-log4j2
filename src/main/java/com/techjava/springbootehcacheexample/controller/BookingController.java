package com.techjava.springbootehcacheexample.controller;

import com.techjava.springbootehcacheexample.model.Booking;
import com.techjava.springbootehcacheexample.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/update/{bookingId}/name/{bookingName}")
    public Booking updateBookingById(Integer bookingId, String bookingName){
        return bookingService.updateBookingById(bookingId, bookingName);
    }
}
