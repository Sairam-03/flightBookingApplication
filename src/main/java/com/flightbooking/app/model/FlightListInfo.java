package com.flightbooking.app.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FlightListInfo {

    private String fromPlace;
    private String toPlace;
    @ApiModelProperty(value = "A JSON value representing date format", example = "yyyy-MM-dd")
    private String onboardDate;
    //optional
    @ApiModelProperty(example="HH:mm:ss")
    private String onboardTime;
    private Boolean roundTrip;

    //extra
    private String airLine;

    @JsonIgnore
    private Long ticketPrice;

    @JsonIgnore
    private Date dateTime;

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

    public String getOnboardDate() {
        return onboardDate;
    }

    public void setOnboardDate(String onboardDate) {
        this.onboardDate = onboardDate;
    }

    public String getOnboardTime() {
        return onboardTime;
    }

    public void setOnboardTime(String onboardTime) {
        this.onboardTime = onboardTime;
    }

    public Boolean getRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(Boolean roundTrip) {
        this.roundTrip = roundTrip;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public Long getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Long ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
