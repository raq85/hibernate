package com.ge.hibernate.controllers;

import com.ge.hibernate.entities.Backpack;
import com.ge.hibernate.entities.Student;
import com.ge.hibernate.repositories.BackpackRepository;
import com.ge.hibernate.repositories.StudentRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import javax.transaction.Transactional;


@Component
public class Test {

    private final StudentRepository studentRepository;
    private final BackpackRepository backpackRepository;

    public Test(StudentRepository studentRepository, BackpackRepository backpackRepository) {
        this.studentRepository = studentRepository;
        this.backpackRepository = backpackRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void superTest(){
        try {
            test();
        } catch (Exception ex){
            System.out.println("test");
        }


    }

    @Transactional()
    public void test(){
        Backpack backpack = new Backpack();
        backpack.setBrand("deuter");
        backpackRepository.save(backpack);

        Student student = new Student();
        student.setName("Czesiek");
        student.setBackpack(backpack);
        if(true){throw new RuntimeException();};
        studentRepository.save(student);

//        studentRepository.getStudent("Czesiek").stream().forEach(System.out::println);
//        studentRepository.getStudent();
    }
}
