package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Sasha Batcovich", 1, 9.8);
        Student st2 = new Student("Rita Sergeevna", 3, 9.9);
        Student st3 = new Student("Dasha Fibikh", 5, 9.7);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
