package rentalDrone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rentalDrone.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
