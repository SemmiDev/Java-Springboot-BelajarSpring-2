package com.belajarJDBC.jdbcTemplate.Dao;

import com.belajarJDBC.jdbcTemplate.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudent();

    Student getStudetnById(int id);

    Student removeStudentById(int id);

    void updateStudentById(Student student);

    void insertStudent(Student student);
}
