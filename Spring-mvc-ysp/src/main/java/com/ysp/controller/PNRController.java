package com.ysp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysp.Entity.Passenger;
import com.ysp.Entity.Passenger.Gender;
import com.ysp.Entity.Passenger.Status;
import com.ysp.Entity.Pnr;

@RestController
@CrossOrigin
public class PNRController {

	@GetMapping("/pnr-status")
	public Pnr checkStatus(@RequestParam int pnrNO) {
		
		Passenger passenger1 = new Passenger();
		passenger1.setName("Yogesh");
		passenger1.setGender(Gender.MALE);
		passenger1.setStatus(Status.CONFIRMED);
		
		Passenger passenger2 = new Passenger();
		passenger2.setName("Saurabh");
		passenger2.setGender(Gender.MALE);
		passenger2.setStatus(Status.CONFIRMED);
		
		
		List<Passenger> plist = new ArrayList<Passenger>();
		plist.add(passenger1);
		plist.add(passenger2);
		
		Pnr pnr = new Pnr();
		pnr.setPnrNo(1234);
		pnr.setTrainNo(1000);
		pnr.setTravelDate(LocalDate.of(2023, 11, 11));
		pnr.setPassenger(plist);

		return pnr;
		
		
	}
}
