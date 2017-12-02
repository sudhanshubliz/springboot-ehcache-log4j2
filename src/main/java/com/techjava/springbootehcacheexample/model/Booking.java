package com.techjava.springbootehcacheexample.model;


import javax.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name = "booking_name", nullable = false)
    private String bookingName;

    @Column(name = "booking_place", nullable = false)
    private String bookingPlace;

    public Booking() {
    }

    public Booking(Integer bookingId, String bookingName, String bookingPlace) {
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
