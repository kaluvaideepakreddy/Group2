package com.mbs.Multiplex_Booking_system.mbs.controller;
import com.mbs.Multiplex_Booking_system.mbs.entity.Booking;
import com.mbs.Multiplex_Booking_system.mbs.exception.RecordAlreadyPresentException;
import com.mbs.Multiplex_Booking_system.mbs.exception.RecordNotFoundException;
import com.mbs.Multiplex_Booking_system.mbs.sevice.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin("http://localhost:8080")
@ComponentScan(basePackages = "com")
@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired(required= true)
    BookingService bookingService;

    @PostMapping("/createBooking")
    @ExceptionHandler(RecordAlreadyPresentException.class)
    public void addBooking(@RequestBody Booking newBooking) {

        bookingService.createBooking(newBooking);

    }

   // @GetMapping("/readAllBooking")
    //public Iterable<Booking> readAllBookings() {

      //  return bookingService.displayAllBooking();
    //}

    @PutMapping("/updateBooking")
    @ExceptionHandler(RecordNotFoundException.class)
    public void modifyBooking(@RequestBody Booking updateBooking) {

        bookingService.updateBooking(updateBooking);
    }

    @GetMapping("/searchBooking/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<?> searchBookingByID(@PathVariable("id")  Long BookingId) {

        return bookingService.findBookingById(BookingId);
    }

    @DeleteMapping("/deleteBooking/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public void deleteBookingByID(@PathVariable("id") Long BookingId) {

        bookingService.deleteBooking(BookingId);
    }
}