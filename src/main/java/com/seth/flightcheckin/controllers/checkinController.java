package com.seth.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seth.flightcheckin.integration.ReservationRestClient;
import com.seth.flightcheckin.integration.dto.Reservation;
import com.seth.flightcheckin.integration.dto.ReservationUpdateRequest;

@Controller
public class checkinController {

	@Autowired
	ReservationRestClient restClient;
	
	@RequestMapping("/showCheckin")
	public String showCheckin() {
		return "startCheckin";
	}
	@RequestMapping("/viewCheckin")
	public String viewCheckin() {
		return "checkInStatus";
	}
	

	
	@RequestMapping("/startCheckin")
	public String startCheckin(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservation";
	}
	
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Long id, @RequestParam("numberOfBags") int bags, ModelMap modelMap) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setNumberOfBags(bags);
		request.setCheckedIn(true);
		request.setId(id);
		restClient.updateReservation(request);
		Reservation reservation = restClient.findReservation(id);
		modelMap.addAttribute("reservation", reservation);
		return"confirmCheckin";
	}
	
	@RequestMapping("/checkStatus")
	public String statusCheck(@RequestParam("reservationId") Long id, ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(id);
		modelMap.addAttribute("reservation", reservation);
		if (reservation.isCheckedIn()) {
			return"confirmCheckin"; 
		}
		
		return"notCheckedIn";
	}
	
	
	
}
