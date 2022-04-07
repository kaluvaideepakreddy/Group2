package com.mbs.Multiplex_Booking_system.mbs.sevice;



import org.springframework.http.ResponseEntity;

import com.mbs.Multiplex_Booking_system.mbs.entity.Booking;

public interface BookingService  {

    public ResponseEntity<?> createBooking(Booking newBooking);

    public Booking updateBooking(Booking newBooking);

    public String deleteBooking(Long BookingId);

    public Iterable<Booking> displayAllBooking();

    public ResponseEntity<?> findBookingById(Long BookingId);
}