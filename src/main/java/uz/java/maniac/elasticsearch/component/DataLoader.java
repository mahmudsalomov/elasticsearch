package uz.java.maniac.elasticsearch.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.java.maniac.elasticsearch.document.Person;
import uz.java.maniac.elasticsearch.repository.PersonRepository;
import uz.java.maniac.elasticsearch.service.PersonService;

import java.util.UUID;

@Component
public class DataLoader implements CommandLineRunner {

    private final PersonService personService;
    private final PersonRepository personRepository;

    public DataLoader(PersonService personService, PersonRepository personRepository) {
        this.personService = personService;
        this.personRepository = personRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i <100000 ; i++) {
            personService.save(new Person(UUID.randomUUID().toString(),""+i));
        }
    }
}
