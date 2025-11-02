package com.example.springboot3.controller;

import com.example.springboot3.dto.StudentDto;
import com.example.springboot3.entity.Student;
import com.example.springboot3.service.MyServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/")
@RestController
public class MyController {

    private MyServiceImpl myService;

    public MyController(MyServiceImpl myService) {
        this.myService = myService;
    }

//    @ResponseBody  Not Needed
    @GetMapping("read")
    public List<Student> readData(){
//        return new ResponseEntity<>(myService.readData(), HttpStatus.OK);
//        return ResponseEntity.ok(myService.readData());
        return myService.readData();
    }

    @PostMapping("insert")
    public ResponseEntity<String> insertData(@RequestBody StudentDto studentDto) {
        String result = myService.insertData(studentDto);
        if (result.equals("INSERTED")) {
            System.out.println(studentDto);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteData(@PathVariable int id) {
        String s = myService.DeleteById(id);
        if(s.contains("DELETED")){
            return ResponseEntity.ok(s);
        }else{
            return new ResponseEntity<>("BAD REQUEST",HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Student> fullUpdate(@PathVariable int id, @RequestBody StudentDto studentDto) {
        Student updatedStu = myService.UpdateAll(id, studentDto);
        if (updatedStu != null) {
            return ResponseEntity.ok(updatedStu);
        }
        else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
