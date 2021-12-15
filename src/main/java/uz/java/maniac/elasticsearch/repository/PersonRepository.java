package uz.java.maniac.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import uz.java.maniac.elasticsearch.document.Person;

public interface PersonRepository extends ElasticsearchRepository<Person,String> {
}
