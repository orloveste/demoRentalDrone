package rentalDrone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rentalDrone.model.Costumer;

@Repository
public interface CostumerRepository extends JpaRepository<Costumer, Long> {
}
