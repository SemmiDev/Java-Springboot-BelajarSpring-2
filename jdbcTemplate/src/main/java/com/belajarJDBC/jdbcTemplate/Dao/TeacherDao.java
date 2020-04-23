package com.belajarJDBC.jdbcTemplate.Dao;

import com.belajarJDBC.jdbcTemplate.Entity.Teacher;

import java.util.Collection;

public interface TeacherDao {
    Collection<Teacher> getAllTeacher();

    Teacher getTeacherById(int id);

    Teacher removeTeacherById(int id);

    void updateTeacherById(Teacher teacher);

    void insertTeacher(Teacher teacher);
}
