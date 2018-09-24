package com.pioneer.springbootehcacheexample.model;

import java.io.Serializable;

public class BookingDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2806196231875615537L;

	private Integer bookingId;

    private String bookingName;

    private String bookingPlace;

    public BookingDTO() {
    }

    public BookingDTO(Integer bookingId, String bookingName, String bookingPlace) {
        this.bookingId = bookingId;
        this.bookingName = bookingName;
        this.bookingPlace = bookingPlace;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public String getBookingPlace() {
        return bookingPlace;
    }

    public void setBookingPlace(String bookingPlace) {
        this.bookingPlace = bookingPlace;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingName='" + bookingName + '\'' +
                ", bookingPlace='" + bookingPlace + '\'' +
                '}';
    }
}
