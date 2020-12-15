package rentalDrone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rentalDrone.model.Drone;

@Repository
public interface DroneRepository extends JpaRepository<Drone, Long> {
}
