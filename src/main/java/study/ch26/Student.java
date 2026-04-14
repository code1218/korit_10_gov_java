package study.ch26;

import java.util.Arrays;

class Student2 {

}

public enum Student {
    김준이(), 김준삼(), 김준사(), 김준일(10);

    private int age;

    Student() {
        System.out.println("생성됨");
    }

    Student(int age) {
        System.out.println("생성됨2");
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Student student1 = Student.김준일;
//        Student student2 = Student.김준이;
//        Student student3 = Student.김준삼;
        System.out.println(Student.values()[0].name());
        System.out.println(Student.valueOf("김준삼").name());
        Student2 s2 = new Student2();
        System.out.println(s2);
    }
}