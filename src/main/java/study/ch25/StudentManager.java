package study.ch25;

import com.sun.jdi.IntegerType;
import com.sun.jdi.VirtualMachine;

import java.util.AbstractList;
import java.util.List;

public interface StudentManager {
    void addStudent(int id, Student s);
    Student findById(int id);
    List<Student> findByMinScore(int min);
    double getAverage();
    void printAll();

    default void test() {

    }
}

abstract class AbstractStudentManager {
    public abstract void addStudent(int id, Student s);
    public abstract Student findById(int id);
    public abstract List<Student> findByMinScore(int min);
    public abstract double getAverage();
    public abstract void printAll();

    public void test() {

    }
}

class StudentManagerImpl implements StudentManager, IntegerType {
    @Override
    public String signature() {
        return "";
    }

    @Override
    public String name() {
        return "";
    }

    @Override
    public VirtualMachine virtualMachine() {
        return null;
    }

    @Override
    public void addStudent(int id, Student s) {

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findByMinScore(int min) {
        return List.of();
    }

    @Override
    public double getAverage() {
        return 0;
    }

    @Override
    public void printAll() {

    }
}

class StudentManagerImpl2 extends AbstractStudentManager {
    @Override
    public void addStudent(int id, Student s) {

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findByMinScore(int min) {
        return List.of();
    }

    @Override
    public double getAverage() {
        return 0;
    }

    @Override
    public void printAll() {

    }
}

class Main2 {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManagerImpl();
    }
}


















