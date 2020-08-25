package com.ge.hibernate.repositories;

import com.ge.hibernate.entities.Backpack;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackpackRepository extends CrudRepository<Backpack, Long> {


}
