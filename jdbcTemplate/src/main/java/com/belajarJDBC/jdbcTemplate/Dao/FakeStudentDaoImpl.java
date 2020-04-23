package com.belajarJDBC.jdbcTemplate.Dao;

import com.belajarJDBC.jdbcTemplate.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakedata")
public class FakeStudentDaoImpl implements StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {

                put(1, new Student(1,"Scarlet","Female","sipplett0@yale.edu","Nigeria"));
                put(2, new Student(2,"Kelsy","Female","kbolitho1@abc.net.au","Mexico"));
                put(3, new Student(3,"Lisbeth","Female","lbywaters2@mediafire.com","United States"));
                put(4, new Student(4,"Zane","Male","zholtum3@usa.gov","France"));
                put(5, new Student(5,"Lyon","Male","lhaet4@examiner.com","Brazil"));
                put(6, new Student(6,"Keir","Male","kfotherby5@mtv.com","Egypt"));
                put(7, new Student(7,"Tiphanie","Female","tdur6@google.ca","China"));
                put(8, new Student(8,"Vivyan","Female","vpollen7@soup.io","Indonesia"));
                put(9, new Student(9,"Tessi","Female","tbarnish8@symantec.com","China"));
                put(10, new Student(10,"Shirlene","Female","srentenbeck9@twitpic.com","Guatemala"));
                put(11, new Student(11,"Lyndsay","Female","lsarrella@walmart.com","Indonesia"));
                put(12, new Student(12,"Lucias","Male","lraglessb@google.com.hk","South Africa"));
                put(13, new Student(13,"Urbano","Male","useamonsc@cisco.com","Thailand"));
                put(14, new Student(14,"Orrin","Male","oemblowd@dmoz.org","China"));
                put(15, new Student(15,"Kessia","Female","kbortoluzzie@sogou.com","Mexico"));
                put(16, new Student(16,"Giorgia","Female","gsprasonf@wunderground.com","Indonesia"));
                put(17, new Student(17,"Britt","Female","bwychg@slashdot.org","Russia"));
                put(18, new Student(18,"Elvina","Female","eseeberth@odnoklassniki.ru","Philippines"));
                put(19, new Student(19,"Dianemarie","Female","dtynnani@vistaprint.com","Afghanistan"));
                put(20, new Student(20,"Dian","Male","dtynnani@vistaprint.com","Afghanistan"));

            }
        };
    }
    @Override
    public Collection<Student> getAllStudent(){
        return this.students.values();
    }

    @Override
    public Student getStudetnById(int id){
        return this.students.get(id);
    }

    @Override
    public Student removeStudentById(int id) {
        return this.students.remove(id);
    }

    @Override
    public void updateStudentById(Student student){
        Student s = students.get(student.getId());
        s.setName(student.getName());
        s.setGender(student.getCountry());
        s.setEmail(student.getEmail());
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudent(Student student) {
        this.students.put(student.getId(),student);
    }
}

