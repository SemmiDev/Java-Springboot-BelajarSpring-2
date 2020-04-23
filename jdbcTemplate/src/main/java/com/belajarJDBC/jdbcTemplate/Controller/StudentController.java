package com.belajarJDBC.jdbcTemplate.Controller;

import com.belajarJDBC.jdbcTemplate.Entity.Student;
import com.belajarJDBC.jdbcTemplate.Service.StudentServiceMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceMongo studentServiceMongo;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudent(){
        return this.studentServiceMongo.getAllStudent();
    }

    @RequestMapping(value = "/getbyid/{id}",method = RequestMethod.GET)
    public Student getSudentById(@PathVariable("id") int id){
        return studentServiceMongo.getStudetnById(id);
    }

    @RequestMapping(value = "/deletebyid/{id}",method = RequestMethod.DELETE)
    public Student removeStudentById(@PathVariable("id") int id){
        return studentServiceMongo.removeStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudentsById(@RequestBody Student student){
        this.studentServiceMongo.updateStudent(student);
    }

    @RequestMapping(value = "/inserttodb" ,method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        this.studentServiceMongo.insertStudent(student);
    }
}
