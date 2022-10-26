package romenska.olha.persons.service;


import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import romenska.olha.persons.client.NotesClient;
import romenska.olha.persons.dto.PersonDto;
import romenska.olha.persons.repository.PersonRepository;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
    private final NotesClient notesClient;

    public PersonDto getWithNotesById(Long personId){

        var person = personRepository.findById(personId)
                .orElseThrow();

        var notes = notesClient.getNotesByPersonId(personId);

        return new PersonDto(person.getFirstName(), person.getLastName(),notes );

    }
}
