package com.seth.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.seth.flightcheckin.integration.dto.Reservation;
import com.seth.flightcheckin.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestImpl implements ReservationRestClient {

	private static final String RESERVATION_REST_URL = "http://localhost:8080/flightreservation/reservations/";

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemp = new RestTemplate();
		Reservation forObject = restTemp.getForObject(RESERVATION_REST_URL+id, Reservation.class);
		return forObject;
	}

	@Transactional
	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemp = new RestTemplate();
		Reservation reservation = restTemp.postForObject(RESERVATION_REST_URL, request, Reservation.class);
		return reservation;
	}

}
