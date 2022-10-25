package romenska.olha.persons.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import romenska.olha.persons.domain.Person;
import romenska.olha.persons.repository.PersonRepository;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor

public class PersonController {

    private final PersonRepository personRepository;
    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personRepository.save(person);
    }
}
