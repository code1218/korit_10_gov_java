package study.ch25;


import java.util.Arrays;

enum Student {
    J, K, M("m");

    Student() {
        System.out.println("생성됨");
    }

    Student(String name) {
        System.out.println(name);
        System.out.println("생성됨");
    }

}

public class Enum01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Student.values()));
        Student s1 = Student.J;
        Student s2 = Student.M;

    }
}
