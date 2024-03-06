package com.example.SpringBootIntroductionDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    DogRepository repository;

    // todo Create these 5 methods to handle the requests from the Integration Tests

    // todo 1. Create a method for Get to /dog that returns all dogs
    // todo 1. Use the repository to find all dogs


    // todo 2. Create a method for Get to /dog/{id} that return the dog with that id
    // todo 2. Use a @PathVariable to get the Long id as a path variable
    // todo 2. Use the repository to find the dog by id, get the dog out of the Optional and return it


    // todo 3. Create a method for Post to /dog that saves the dog sent as input argument
    // todo 3. Use @RequestBody Dog dog as input argument, this will get the dog from json data in the request
    // todo 3. Return the saved dog by just return what the save method in the repository returns


    // todo 4. Create a method for Put to /dog/{id}
    // todo 4. Use a @PathVariable to get the Long id as a path variable
    // todo 4. Use @RequestBody Dog dog as input argument, this will get the dog from json data in the request
    // todo 4. Return the saved dog by just return what the save method in the repository returns


    // todo 5. Create a method for Delete to /dog/{id}
    // todo 5. Use a @PathVariable to get the Long id as a path variable
    // todo 5. Use the repository to delete the dog by id

}
