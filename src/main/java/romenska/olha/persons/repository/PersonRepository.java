package romenska.olha.persons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import romenska.olha.persons.domain.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
