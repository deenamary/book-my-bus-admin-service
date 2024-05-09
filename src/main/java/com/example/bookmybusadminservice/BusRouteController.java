package com.example.bookmybusadminservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/v1")
public class BusRouteController {

    private  BusRouteRepository busRouteRepository;

    BusRouteController(BusRouteRepository busRouteRepository) {
        this.busRouteRepository = busRouteRepository;
    }


    @PostMapping("add/busroute")
    public ResponseEntity<BusRoute> createOrder(@RequestBody BusRoute busRoute)
    {
        busRoute.setBusId(String.valueOf(UUID.randomUUID()));
        busRoute.setSource(busRoute.getSource());
        busRoute.setDestination(busRoute.getDestination());
        busRoute.setPrice(busRoute.getPrice());
        busRouteRepository.save(busRoute);

        return ResponseEntity.ok(busRoute);
    }
}
