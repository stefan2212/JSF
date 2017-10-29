package services;

import dao.StudentDao;
import entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by stfcr on 10/29/2017.
 */
@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public Student saveStudent(Student student){
        studentDao.saveStudent(student);
        return student;
    }
}
