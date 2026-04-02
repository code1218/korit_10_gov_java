package study.ch10;

import study.ch10.entity.Student;

public class Array09 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("김준일", 80);
        students[1] = new Student("김준이", 90);
        students[2] = new Student("김준삼", 100);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            student.setScore(student.getScore() - 5);
        }

        for (Student student : students) {
            student.setScore(student.getScore() - 5);
        }

        for (Student student : students) {
            System.out.println(student.toString());
        }

        String searchName = "김준사";
        Student foundStudent = null;
        for (int i = 0; i < students.length; i++) {
            if (searchName.equals(students[i].getName())) {
                foundStudent = students[i];
                break;
            }
        }
        if (foundStudent == null) {
            System.out.println("해당 이름의 학생이 존재하지 않습니다.");
            return;
        }

        System.out.println("[ 찾은 학생 정보 ]");
        System.out.println("이름: " + foundStudent.getName());
        System.out.println("점수: " + foundStudent.getScore());

    }
}
