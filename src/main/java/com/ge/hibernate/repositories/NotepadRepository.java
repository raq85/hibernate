package com.ge.hibernate.repositories;

import com.ge.hibernate.entities.Notepad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotepadRepository extends CrudRepository<Notepad, Long> {

}
