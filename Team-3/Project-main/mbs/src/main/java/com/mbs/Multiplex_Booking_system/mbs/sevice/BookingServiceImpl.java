package com.mbs.Multiplex_Booking_system.mbs.sevice;


import com.mbs.Multiplex_Booking_system.mbs.entity.Booking;
import com.mbs.Multiplex_Booking_system.mbs.exception.RecordAlreadyPresentException;
import com.mbs.Multiplex_Booking_system.mbs.exception.RecordNotFoundException;
import com.mbs.Multiplex_Booking_system.mbs.repository.BookingRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    /*
     * Creating DAO object
     */
    @Autowired
   BookingRepository bookingRepository;

    /*
     * making new Booking
     */
    @Override
    public ResponseEntity<Booking> createBooking(Booking newBooking) {

        Optional<Booking> findBookingById = bookingRepository.findById(newBooking.getBookingId());
        try {
            if (!findBookingById.isPresent()) {
                bookingRepository.save(newBooking);
                return new ResponseEntity<Booking>(newBooking, HttpStatus.OK);
            } else
                throw new RecordAlreadyPresentException(
                        "Booking with Booking Id: " + newBooking.getBookingId() + " already exists!!");
        } catch (RecordAlreadyPresentException e) {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /*
     * update booking made
     */
    @Override
    public Booking updateBooking(Booking changedBooking) {
        Optional<Booking> findBookingById = bookingRepository.findById(changedBooking.getBookingId());
        if (findBookingById.isPresent()) {
            bookingRepository.save(changedBooking);
        } else
            throw new RecordNotFoundException(
                    "Booking with Booking Id: " + changedBooking.getBookingId() + " not exists!!");
        return changedBooking;
    }



    /*
     * deleteing the booking
     */

    @Override
    public String deleteBooking(Long BookingId) {

        Optional<Booking> findBookingById = bookingRepository.findById(BookingId);
        if (findBookingById.isPresent()) {
            bookingRepository.deleteById(BookingId);
            return "Booking Deleted!!";
        } else
            throw new RecordNotFoundException("Booking not found for the entered BookingID");
    }

    /*
     * (non-Javadoc)
     *
     * @see com.org.service.BookingService#displayAllBooking() show all booking
     */
    @Override

    public Iterable<Booking> displayAllBooking() {

        return bookingRepository.findAll();
    }



    /*
     * (non-Javadoc)
     *
     * @see com.org.service.BookingService#findBookingById(java.math.BigInteger)
     * find booking by ID
     */
    @Override
    public ResponseEntity<?> findBookingById(Long BookingId) {
        Optional<Booking> findById = bookingRepository.findById(BookingId);
        try {
            if (findById.isPresent()) {
                Booking findBooking = findById.get();
                return new ResponseEntity<Booking>(findBooking, HttpStatus.OK);
            } else
                throw new RecordNotFoundException("No record found with ID " + BookingId);
        } catch (RecordNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}