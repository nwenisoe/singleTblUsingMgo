package com.example.mongodb.util;

import com.example.mongodb.dto.StudentDto;
import com.example.mongodb.entity.Student;
import org.springframework.beans.BeanUtils;

public class EntityToDto {
    public static Student toEntity(StudentDto studentDto){
        Student student=new Student();
        BeanUtils.copyProperties(studentDto,student);
        return student;
    }
    public static StudentDto toDto(Student student){
        StudentDto studentDto=new StudentDto();
        BeanUtils.copyProperties(student,studentDto);
        return studentDto;
    }
//    learn and test how to work @RestController,@Controller,@PathVariable,@RequestParam,@Data,@NoArgsConstructor,@AllArgsConstructor,@RequiredArgsConstructor
//    learn DAO and DTO
//    learn project flow for CRUD between tables when connect MongoDb
}
