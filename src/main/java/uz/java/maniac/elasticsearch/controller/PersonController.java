package uz.java.maniac.elasticsearch.controller;

import org.springframework.web.bind.annotation.*;
import uz.java.maniac.elasticsearch.document.Person;
import uz.java.maniac.elasticsearch.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public void save(@RequestBody Person person){
        service.save(person);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable String id){
        return service.findById(id);
    }

}
