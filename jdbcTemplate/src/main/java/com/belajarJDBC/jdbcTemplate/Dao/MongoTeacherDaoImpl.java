package com.belajarJDBC.jdbcTemplate.Dao;

import com.belajarJDBC.jdbcTemplate.Entity.Student;
import com.belajarJDBC.jdbcTemplate.Entity.Teacher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("mongodatateacher")
public class MongoTeacherDaoImpl implements TeacherDao{
    private static Map<Integer, Teacher> teachers;

    static {
        teachers = new HashMap<Integer, Teacher>() {
            {

                put(1, new Teacher(1,"Scarlet","Female","sipplett0@yale.edu","Nigeria"));
                put(2, new Teacher(2,"Kelsy","Female","kbolitho1@abc.net.au","Mexico"));
                put(3, new Teacher(3,"Lisbeth","Female","lbywaters2@mediafire.com","United States"));
                put(4, new Teacher(4,"Zane","Male","zholtum3@usa.gov","France"));
                put(5, new Teacher(5,"Lyon","Male","lhaet4@examiner.com","Brazil"));
                put(6, new Teacher(6,"Keir","Male","kfotherby5@mtv.com","Egypt"));
                put(7, new Teacher(7,"Tiphanie","Female","tdur6@google.ca","China"));
                put(8, new Teacher(8,"Vivyan","Female","vpollen7@soup.io","Indonesia"));
                put(9, new Teacher(9,"Tessi","Female","tbarnish8@symantec.com","China"));
                put(10, new Teacher(10,"Shirlene","Female","srentenbeck9@twitpic.com","Guatemala"));
                put(11, new Teacher(11,"Lyndsay","Female","lsarrella@walmart.com","Indonesia"));
                put(12, new Teacher(12,"Lucias","Male","lraglessb@google.com.hk","South Africa"));
                put(13, new Teacher(13,"Urbano","Male","useamonsc@cisco.com","Thailand"));
                put(14, new Teacher(14,"Orrin","Male","oemblowd@dmoz.org","China"));
                put(15, new Teacher(15,"Kessia","Female","kbortoluzzie@sogou.com","Mexico"));
                put(16, new Teacher(16,"Giorgia","Female","gsprasonf@wunderground.com","Indonesia"));
                put(17, new Teacher(17,"Britt","Female","bwychg@slashdot.org","Russia"));
                put(18, new Teacher(18,"Elvina","Female","eseeberth@odnoklassniki.ru","Philippines"));
                put(19, new Teacher(19,"Dianemarie","Female","dtynnani@vistaprint.com","Afghanistan"));
                put(20, new Teacher(20,"Dian","Male","dtynnani@vistaprint.com","Afghanistan"));
            }
        };
    }

    @Override
    public Collection<Teacher> getAllTeacher() {
        return this.teachers.values();
    }

    @Override
    public Teacher getTeacherById(int id) {
        return this.teachers.get(id);
    }

    @Override
    public Teacher removeTeacherById(int id) {
        return this.teachers.remove(id);
    }

    @Override
    public void updateTeacherById(Teacher teacher) {
        Teacher s = teachers.get(teacher.getId());
        s.setName(teacher.getName());
        s.setGender(teacher.getCountry());
        s.setEmail(teacher.getEmail());
        teachers.put(teacher.getId(), teacher);
    }

    @Override
    public void insertTeacher(Teacher teacher) {
        this.teachers.put(teacher.getId(),teacher);
    }
}
