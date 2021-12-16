package com.flightbooking.app.model.entity;

import com.flightbooking.app.model.FlightId;
import com.flightbooking.app.model.enumPacker.Meal;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Flights {

    @EmbeddedId
    private FlightId flightid;
    private String fromPlace;
    private String toPlace;
    private Boolean roundTrip;
    private Long ticketPrice;
    private String instrument;


    private Meal mealChoice;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="airline")
    private AirlineInfo airlineInfos;


    Flights(){}

    public FlightId getFlightid() {
        return flightid;
    }

    public void setFlightid(FlightId flightid) {
        this.flightid = flightid;
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

    public Boolean getRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(Boolean roundTrip) {
        this.roundTrip = roundTrip;
    }

    public Long getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Long ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Meal getMealChoice() {
        return mealChoice;
    }

    public void setMealChoice(Meal mealChoice) {
        this.mealChoice = mealChoice;
    }

    public AirlineInfo getAirlineInfos() {
        return airlineInfos;
    }

    public void setAirlineInfos(AirlineInfo airlineInfos) {
        this.airlineInfos = airlineInfos;
    }
}
