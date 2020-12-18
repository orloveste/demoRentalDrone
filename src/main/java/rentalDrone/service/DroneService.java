package rentalDrone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentalDrone.model.Drone;
import rentalDrone.repository.DroneRepository;

import java.util.List;

@Service
public class DroneService {
    //injecting repository
    @Autowired
    DroneRepository droneRepository;
    //create
    public Drone createDrone(Drone newDrone) {
        return droneRepository.saveAndFlush(newDrone);
    }
    //findAll ak read
    public List<Drone> getAllDrones() {
        return droneRepository.findAll();
    }
    //find by id ak read
    public Drone getDroneById(Long id) {
        return droneRepository.findById(id).get();
    }

    //update ToDo research first - how to do this?

    //delete
    public void deleteDroneById(Long id) {
        droneRepository.deleteById(id);
    }
}
