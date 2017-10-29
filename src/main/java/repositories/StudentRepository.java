package repositories;

import entities.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by stfcr on 10/29/2017.
 */
public interface StudentRepository extends CrudRepository<Student,Integer> {
}
