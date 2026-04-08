package study.ch20.ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
class Student {
    private int id;
    private String name;
    private int score;
}

interface StudentManager {
    void addStudent(int id, String name, int score);
    Student findById(int id);
    List<Student> findByMinScore(int min);
    double getAverage();
    void printAll();
}

class StudentManagerImpl implements StudentManager {
    private Map<Integer, Student> studentMap;

    public StudentManagerImpl() {
        studentMap = new HashMap<>();
    }

    @Override
    public void addStudent(int id, String name, int score) {
        studentMap.put(id, new Student(id, name, score));
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> findByMinScore(int min) {
        return studentMap.values().stream()
                .filter(student -> student.getScore() >= min)
                .toList();
    }

    @Override
    public double getAverage() {
//        double avg = 0;
//        for (Student student : studentMap.values()) {
//            avg += student.getScore();
//        }
//        return avg / studentMap.size();
        return studentMap.values().stream()
                .map(student -> (double) student.getScore())
                .reduce(0.0, Double::sum) / studentMap.size();

    }

    @Override
    public void printAll() {
        studentMap.values().forEach(System.out::println);
    }
}

public class Ex17 {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManagerImpl();

        studentManager.addStudent(20260001, "김준일", 80);
        studentManager.addStudent(20260002, "김준이", 75);
        studentManager.addStudent(20260003, "김준삼", 70);
        studentManager.addStudent(20260004, "김준사", 65);

        Student foundStudent = studentManager.findById(20260003);
        System.out.println(foundStudent);

        System.out.println(studentManager.findByMinScore(70));

        System.out.println(studentManager.getAverage());

        studentManager.printAll();


    }
}
