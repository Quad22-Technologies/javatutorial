package com.java.tutorial.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/vehicles")
public class VehiclesController {
    @Autowired
    private VehiclesService vehiclesService;

    @GetMapping
    public List<Vehicles> getAllVehicles() {
        return vehiclesService.getAllVehicles();
    }
}
