package uz.java.maniac.elasticsearch.service;

import org.springframework.stereotype.Service;
import uz.java.maniac.elasticsearch.document.Person;
import uz.java.maniac.elasticsearch.repository.PersonRepository;

@Service
public class PersonService {
    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public void save(final Person person){
        repository.save(person);
    }
    public Person findById(final  String id){
        return repository.findById(id).orElse(null);
    }
}
