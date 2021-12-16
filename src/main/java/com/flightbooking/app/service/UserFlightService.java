package com.flightbooking.app.service;

import com.flightbooking.app.model.FlightListInfo;
import com.flightbooking.app.model.entity.Flights;
import com.flightbooking.app.model.entity.UserBooking;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserFlightService {

	public List<Flights> searchForFlights(FlightListInfo flightReq);

	public String bookTickets(UserBooking userBooking);

	public UserBooking findByPnr(String pnr);

	public ResponseEntity<List<UserBooking>> findByEmailId(String emailId);

	public String deleteByPnr(String pnr);
}
