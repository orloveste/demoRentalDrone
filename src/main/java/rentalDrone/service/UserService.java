package rentalDrone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentalDrone.model.User;
import rentalDrone.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    //injecting repository
    @Autowired
    UserRepository userRepository;
    //create
    public User createUser(User newUser) {
        return userRepository.saveAndFlush(newUser);
    }
    //findAll ak read
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    //find by id ak read
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

    //update ToDo research first - how to do this?

    //delete
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
