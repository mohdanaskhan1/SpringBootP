package com.example.springboot3.service;

import com.example.springboot3.dto.StudentDto;
import com.example.springboot3.entity.Student;
import com.example.springboot3.repository.Crud;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements MyService{

    private Crud  crud;

    public MyServiceImpl(Crud crud) {
        this.crud = crud;
    }

    @Override
    public List<Student> readData(){
        return crud.findAll();
    }

    @Override
    public String insertData(StudentDto studentDto){
        Student stu = new Student();
        stu.setId(studentDto.getId());
        stu.setName(studentDto.getName());
        stu.setAge(studentDto.getAge());
        stu.setAddress(studentDto.getAddress());
        crud.save(stu);
        return "INSERTED";
    }

    @Override
    public String DeleteById(int id){
        if(crud.existsById(id)){
            crud.deleteById(id);
            return "DELETED";
        }
        else{
            return "Student Not Found "+id;
        }
    }

    @Override
    public Student UpdateAll(int id, StudentDto studentdto){
        Student existingStudent = crud.findById(id)
                .orElseThrow(()->new EntityNotFoundException("Student Not Found "+id));
        existingStudent.setName(studentdto.getName());
        existingStudent.setAge(studentdto.getAge());
        existingStudent.setAddress(studentdto.getAddress());
        return crud.save(existingStudent);
    }



}
