package com.example.mongodb.dto;

import com.example.mongodb.entity.Department;
import com.example.mongodb.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
public class StudentDto {

        private String id;
        private String name;
        private String email;

        public StudentDto() {
        }

        private Department department;
        private List<Subject> subjects=new ArrayList<>();
//        public void addSubject(Subject subject){
//            this.subjects.add(subject);
//        }


}
