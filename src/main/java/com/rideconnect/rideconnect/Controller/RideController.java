package com.rideconnect.rideconnect.Controller;

import com.rideconnect.rideconnect.Models.Ride;
import com.rideconnect.rideconnect.Service.RideService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/ride")
public class RideController {
    private final RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    @PostMapping("/RideRequest")
    public Ride RideRequest(@RequestBody Ride ride, @RequestParam Integer ride_type) {
        return rideService.rideRequest(ride, ride_type);
    }
    // - http://localhost:8080/api/v1/ride/RideRequest?ride_type=2

    @GetMapping("/RideRequest")
    public Ride RideTest(@RequestBody Ride ride) {
        return ride;
    }
}
