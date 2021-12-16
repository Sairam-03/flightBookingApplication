package com.flightbooking.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightId implements Serializable {

    private Long flightno;
    private Date onboardDateTime;
    private Date terminalDateTime;

    public Long getFlightno() {
        return flightno;
    }

    public void setFlightno(Long flightno) {
        this.flightno = flightno;
    }

    public Date getOnboardDateTime() {
        return onboardDateTime;
    }

    public void setOnboardDateTime(Date onboardDateTime) {
        this.onboardDateTime = onboardDateTime;
    }

    public Date getTerminalDateTime() {
        return terminalDateTime;
    }

    public void setTerminalDateTime(Date terminalDateTime) {
        this.terminalDateTime = terminalDateTime;
    }
}
