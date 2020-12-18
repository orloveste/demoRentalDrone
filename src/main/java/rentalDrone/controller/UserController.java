package rentalDrone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rentalDrone.model.User;

import rentalDrone.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    //Create
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    //get list db
    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers() {
        return userService.getAllUsers();
    }
    //get endpoint

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public User findUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    //put-update

    //delete
    @DeleteMapping
    @RequestMapping(value = "/id", method = RequestMethod.DELETE)
    public void deleteUser(Long id) {
        userService.deleteUserById(id);
    }
}
