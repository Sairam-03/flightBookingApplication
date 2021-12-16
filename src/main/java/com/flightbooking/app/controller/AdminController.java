package com.flightbooking.app.controller;


import com.flightbooking.app.model.entity.AirlineInfo;
import com.flightbooking.app.model.entity.Flights;
import com.flightbooking.app.service.AdminFlightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/admin")
@Slf4j
public class AdminController {
    @Autowired
    AdminFlightService adminFlightService;

    @PostMapping("/airlines")
    public String createAirlines(@RequestBody Flights flights) {

        return adminFlightService.saveAirlineDetails(flights);
    }

    @PostMapping("/UpdateBlocker")
    public String updateBlocker(@RequestBody AirlineInfo airlineInfo) {
        AirlineInfo returnedValue=adminFlightService.updateAirLineBlocker(airlineInfo);
        return returnedValue!=null?"success":"Issue found";
    }

}
