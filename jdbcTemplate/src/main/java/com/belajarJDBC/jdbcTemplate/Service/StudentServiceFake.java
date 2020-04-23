package com.belajarJDBC.jdbcTemplate.Service;

import com.belajarJDBC.jdbcTemplate.Dao.StudentDao;
import com.belajarJDBC.jdbcTemplate.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentServiceFake {
    // ubah mongo data jadi fakedata kalau mau gunakan itu
    @Autowired
    @Qualifier("fakedata")
    private StudentDao studentDao;

    public Collection<Student> getAllStudent(){
        return this.studentDao.getAllStudent();
    }

    public Student getStudetnById(int id){
        return this.studentDao.getStudetnById(id);
    }

    public Student removeStudentById(int id) {
        return this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudentById(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudent(student);
    }
}
