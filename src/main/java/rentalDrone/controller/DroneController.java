package rentalDrone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rentalDrone.model.Drone;
import rentalDrone.model.User;
import rentalDrone.service.DroneService;

import java.util.List;

@RestController
@RequestMapping("/drones")
public class DroneController {
    @Autowired
    DroneService droneService;
    //create
    @PostMapping
    public Drone addDrone(@RequestBody Drone drone) {
        return droneService.createDrone(drone);
    }
    // get list db
    @RequestMapping(method = RequestMethod.GET)
    public List<Drone> findAllDrones() {
        return droneService.getAllDrones();
    }
    //get endpoint
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public Drone findDroneById(@PathVariable("id") Long id) {
        return droneService.getDroneById(id);
    }
    //put-update

    //delete
    @DeleteMapping
    @RequestMapping(value = "/id", method = RequestMethod.DELETE)
    public void deleteDrone(Long id) {
        droneService.deleteDroneById(id);
    }

}
