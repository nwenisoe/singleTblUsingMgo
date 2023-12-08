package com.example.mongodb;

import com.example.mongodb.entity.Department;
import com.example.mongodb.entity.Student;
import com.example.mongodb.entity.Subject;
import com.example.mongodb.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class MongoDbApplication {
    private final StudentRepository studentRepository;
    @Bean
    public ApplicationRunner runner(){
        return runner->{

            Student student1=new Student("John Doe","j@gmail.com");
            student1.setDepartment(new Department("History","ES1"));

            student1.addSubject(new Subject("Java","Beginner Guide",6,2000));
            student1.addSubject(new Subject("Phthon","Beginner Guide",6,3000));
            Student student2=new Student("Thormas Hardy","thormas@gmail.com");
            student2.setDepartment(new Department("JavaScript","ES1"));
            student2.addSubject(new Subject("Java","Beginner Guide",6,2000));
            student2.addSubject(new Subject("Angular","UI",6,300));
            studentRepository.save(student1);
            studentRepository.save(student2);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(MongoDbApplication.class, args);
    }

}
