package com.eliasfs06.spring.restapi.projectkickoff.service;

import com.eliasfs06.spring.restapi.projectkickoff.model.Person;
import com.eliasfs06.spring.restapi.projectkickoff.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends GenericService<Person>{
    public PersonService(GenericRepository<Person> repository) {
        super(repository);
    }
}
