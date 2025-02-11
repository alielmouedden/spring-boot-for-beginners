package com.universia.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student("Ali","EL MOUEDDEN", LocalDate.now(),"ali.elmouedden@gmail.com",24),
                new Student("limam","KARA",LocalDate.now(),"limam.kara@gmail.com",24)
        );
    }
}
