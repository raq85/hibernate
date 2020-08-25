package com.ge.hibernate.repositories;

import com.ge.hibernate.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

//    @Query(value = "select * " +
//            "from students st " +
//            "join backpacks bp on st.backpack=bp.id" +
//            "where st.name=?1")
//    List<Student> getStudent(String name);

//    @Query(value = "select st.id, st.name, bp.brand " +
//            "from students st " +
//            "join backpacks bp on st.id = bp.id")
//    Object getStudent();

}
