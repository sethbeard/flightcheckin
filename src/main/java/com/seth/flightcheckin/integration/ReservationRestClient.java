package com.seth.flightcheckin.integration;

import com.seth.flightcheckin.integration.dto.Reservation;
import com.seth.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);
	
}
