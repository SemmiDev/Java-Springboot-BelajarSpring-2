package com.belajarJDBC.jdbcTemplate.Controller;


import com.belajarJDBC.jdbcTemplate.Entity.Teacher;
import com.belajarJDBC.jdbcTemplate.Service.TeacherServiceFake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    private TeacherServiceFake teacherServiceFake;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Teacher> getAllTeacher(){
        return this.teacherServiceFake.getAllTeacher();
    }

    @RequestMapping(value = "/getbyid/{id}",method = RequestMethod.GET)
    public Teacher getTeacherById(@PathVariable("id") int id){
        return teacherServiceFake.getTeacherById(id);
    }

    @RequestMapping(value = "/deletebyid/{id}",method = RequestMethod.DELETE)
    public Teacher removeTeacherById(@PathVariable("id") int id){
        return teacherServiceFake.removeTeacherById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateTeacherById(@RequestBody Teacher teacher){
        this.teacherServiceFake.updateTeacher(teacher);
    }

    @RequestMapping(value = "/inserttodb" ,method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertTeacher(@RequestBody Teacher teacher){
        this.teacherServiceFake.insertTeacher(teacher);
    }
}
