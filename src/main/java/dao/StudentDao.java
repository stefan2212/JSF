package dao;

import entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repositories.StudentRepository;

/**
 * Created by stfcr on 10/29/2017.
 */
@Repository
public class StudentDao  {

    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(Student student){
        studentRepository.save(student);
        return student;
    }

}
