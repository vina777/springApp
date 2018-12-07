package com.springboot.db.recources;


import com.springboot.db.model.User;
import com.springboot.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/user")
public class UserContoller  {

    @Autowired
    UserRepository userRepository;


    @RequestMapping(value = "/getuser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    // @CrossOrigin(origins= "http://localhost:4200")

    public ResponseEntity<List<User>> getEmployees() {
        List<User> employees = userRepository.findAll();
        return new ResponseEntity<List<User>>(employees, HttpStatus.OK);
    }

    /*@GetMapping(value = "/all")
    public List<User> getAll()
    {
        return userRepository.findAll();
    }

    @PostMapping(value = "/load")
    public  List<User> persist(@RequestBody final User user)
    {
        userRepository.save(user);
        return userRepository.findAll();
    }*/
}
