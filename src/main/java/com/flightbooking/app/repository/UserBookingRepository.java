package com.flightbooking.app.repository;

import com.flightbooking.app.model.entity.UserBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserBookingRepository extends JpaRepository<UserBooking, String> {

	List<UserBooking> findByEmailId(String emailId);

}
