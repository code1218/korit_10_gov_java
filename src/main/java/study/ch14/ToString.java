package study.ch14;

import java.util.Arrays;

class Student extends Object {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

public class ToString {
    public static void main(String[] args) {
        Student student = new Student("김준일", 90);
        System.out.println(student.toString());
        System.out.println(student);
        String a = student.toString();
        System.out.println(a);
        int[] nums = {1,2,3,4};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
    }
}
