package com.mbs.Multiplex_Booking_system.mbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mbs.Multiplex_Booking_system.mbs.entity")
@ComponentScan("com.mbs.Multiplex_Booking_system.mbs.repository")
@ComponentScan("com.mbs.Multiplex_Booking_system.mbs.service")
@ComponentScan("com.mbs.Multiplex_Booking_system.mbs.controller")
public class MbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbsApplication.class, args);
	}

}
