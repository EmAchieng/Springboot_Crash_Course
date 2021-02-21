package com.example.demo.dao;

import java.util.UUID;

public interface PersonDao {
    // with id
    int InsertPerson(UUID id, Person person);

    //random id
    default int addPerson(Person person) {
        UUID id = UUID.randomUUID();
        return InsertPerson(id, person);
    }
}
