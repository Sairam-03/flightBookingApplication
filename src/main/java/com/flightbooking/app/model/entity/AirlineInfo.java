package com.flightbooking.app.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table(name = "airline_info")
public class AirlineInfo {

    @Id
    private String airline;

    @OneToMany(mappedBy="airlineInfos")
    @JsonIgnore
    private List<Flights> flights;
    private String blockStatus;
    @Override
    public String toString() {
        return "AirlineInfo [airline=" + airline + ", blockStatus=" + blockStatus + "]";
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public List<Flights> getFlights() {
        return flights;
    }

    public void setFlights(List<Flights> flights) {
        this.flights = flights;
    }

    public String getBlockStatus() {
        return blockStatus;
    }

    public void setBlockStatus(String blockStatus) {
        this.blockStatus = blockStatus;
    }
}
