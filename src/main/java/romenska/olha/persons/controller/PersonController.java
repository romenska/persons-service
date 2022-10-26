package romenska.olha.persons.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import romenska.olha.persons.domain.Person;
import romenska.olha.persons.dto.PersonDto;
import romenska.olha.persons.repository.PersonRepository;
import romenska.olha.persons.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor

public class PersonController {

    private final PersonService personService;
    private final PersonRepository personRepository;
    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @GetMapping
    public List<Person> getAll(){
        return personRepository.findAll();
    }

    @GetMapping("/{personId}")
    public PersonDto getPersonWithNotes(@PathVariable Long personId){
        return personService.getWithNotesById(personId);
    }
}
