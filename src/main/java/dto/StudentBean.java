package dto;

import entities.Student;

/**
 * Created by stfcr on 10/29/2017.
 */
public class StudentBean {

    public int id;
    public String name;

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

    public static StudentBean convertToBean(Student student){
        StudentBean studentBean = new StudentBean();
        studentBean.setId(student.getId());
        studentBean.setName(student.getName());
        return studentBean;
    }

}
