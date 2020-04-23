package com.belajarJDBC.jdbcTemplate.Controller;

import com.belajarJDBC.jdbcTemplate.Entity.Student;
import com.belajarJDBC.jdbcTemplate.Service.StudentServiceFake;
import com.belajarJDBC.jdbcTemplate.Service.StudentServiceMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/studentsfake")
public class StudentControllerFake{

    @Autowired
    private StudentServiceFake studentServiceFake;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudent(){
        return this.studentServiceFake.getAllStudent();
    }

    @RequestMapping(value = "/getbyid/{id}",method = RequestMethod.GET)
    public Student getSudentById(@PathVariable("id") int id){
        return studentServiceFake.getStudetnById(id);
    }

    @RequestMapping(value = "/deletebyid/{id}",method = RequestMethod.DELETE)
    public Student removeStudentById(@PathVariable("id") int id){
        return studentServiceFake.removeStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudentsById(@RequestBody Student student){
        this.studentServiceFake.updateStudent(student);
    }

    @RequestMapping(value = "/inserttodb" ,method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        this.studentServiceFake.insertStudent(student);
    }
}
