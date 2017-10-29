package entities;

import javax.persistence.*;

/**
 * Created by stfcr on 10/28/2017.
 */
@Entity
@Table(name ="students")
public class Student {
    private static final String STUDENT_SEQUENCE = "student_id_seq";
    @Id
    @SequenceGenerator(name = "students_generator", sequenceName = STUDENT_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "students_generator")
    private int id;
    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
