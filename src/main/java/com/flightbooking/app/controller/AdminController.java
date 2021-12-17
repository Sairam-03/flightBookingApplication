package com.flightbooking.app.controller;


import com.flightbooking.app.model.entity.AirlineInfo;
import com.flightbooking.app.model.entity.Flights;
import com.flightbooking.app.service.AdminFlightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/admin")
@Slf4j
public class AdminController {
    private final AdminFlightService adminFlightService;

    public AdminController(AdminFlightService adminFlightService) {
        this.adminFlightService = adminFlightService;
    }

    @PostMapping("/airlines")
    public ResponseEntity<String> createAirlines(@RequestBody Flights flights) {

        String airLineDetails = adminFlightService.saveAirlineDetails(flights);
        return new ResponseEntity<>(airLineDetails, HttpStatus.OK);

    }

    @PostMapping("/UpdateBlocker")
    public ResponseEntity<String> updateBlocker(@RequestBody AirlineInfo airlineInfo) {
        AirlineInfo returnedValue = adminFlightService.updateAirLineBlocker(airlineInfo);
        String value = returnedValue != null ? "success" : "Issue found";
        return new ResponseEntity<>(value, HttpStatus.OK);
    }

}
