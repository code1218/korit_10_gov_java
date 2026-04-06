package study.ch17.ex;

class Student {
    String name;
    int id;
    static int nextId = 1;

    public Student(String name) {
        this.name = name;
        this.id = nextId++;
    }

    public static int getStudentCount() {
        return nextId;
    }
}

public class Ex03 {


}
