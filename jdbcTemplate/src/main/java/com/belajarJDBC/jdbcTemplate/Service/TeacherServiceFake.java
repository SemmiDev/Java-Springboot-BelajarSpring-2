package com.belajarJDBC.jdbcTemplate.Service;

import com.belajarJDBC.jdbcTemplate.Dao.TeacherDao;
import com.belajarJDBC.jdbcTemplate.Entity.Student;
import com.belajarJDBC.jdbcTemplate.Entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TeacherServiceFake {
    @Autowired
    @Qualifier("mongodatateacher")
    private TeacherDao teacherDao;


    public Collection<Teacher> getAllTeacher() {
        return this.teacherDao.getAllTeacher();
    }


    public Teacher getTeacherById(int id) {
        return this.teacherDao.getTeacherById(id);
    }


    public Teacher removeTeacherById(int id) {
        return this.teacherDao.removeTeacherById(id);
    }

    public void updateTeacher(Teacher teacher){
        this.teacherDao.updateTeacherById(teacher);
    }

    public void insertTeacher(Teacher teacher) {
        this.teacherDao.insertTeacher(teacher);
    }
}
