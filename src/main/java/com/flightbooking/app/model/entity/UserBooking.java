package com.flightbooking.app.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@Entity
public class UserBooking {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name="pnr",columnDefinition = "CHAR(32)")
	private String pnr;
	
	private long flightId;
	private Date onboardDateTime;
	private String fromPlace;
	private String toPlace;
	private String name;
	private String emailId;
	private int seatCount;
	
	@OneToMany(targetEntity = Passenger.class, cascade = CascadeType.ALL)
	@JoinColumn(name="pnr")
	private List<Passenger> passenger;

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public Date getOnboardDateTime() {
		return onboardDateTime;
	}

	public void setOnboardDateTime(Date onboardDateTime) {
		this.onboardDateTime = onboardDateTime;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
}
