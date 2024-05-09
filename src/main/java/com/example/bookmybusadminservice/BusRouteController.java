package com.example.bookmybusadminservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1")
public class BusRouteController {

    private  BusRouteRepository busRouteRepository;

    BusRouteController(BusRouteRepository busRouteRepository) {
        this.busRouteRepository = busRouteRepository;
    }


    @PostMapping("add/busroute")
    public ResponseEntity<BusRoute> addBusRoute(@RequestBody BusRoute busRoute)
    {
        busRoute.setBusId(String.valueOf(UUID.randomUUID()));
        busRouteRepository.save(busRoute);

        return ResponseEntity.ok(busRoute);
    }

    @GetMapping("get/all/busroutes")
    public ResponseEntity<List<BusRoute>> getBusRouts()
    {
        List<BusRoute> busRoutes = busRouteRepository.findAll();
        return ResponseEntity.ok(busRoutes);
    }

    @PutMapping("update/busroute")
    public ResponseEntity<BusRoute> updateBusRoute(@RequestBody BusRoute busRoute)
    {
        busRouteRepository.save(busRoute);

        return ResponseEntity.ok(busRoute);
    }

    @DeleteMapping("delete/busroute/{busid}")
    public ResponseEntity<String> deleteBusRoute(@PathVariable String busid)
    {
        busRouteRepository.deleteById(busid);
        return ResponseEntity.ok().body("Deleted successfully");
    }
}
