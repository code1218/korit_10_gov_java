package study.ch14;

import java.util.Objects;

class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Teacher)) {
//            return false;
//        }
//        Teacher teacher = (Teacher) o;
//        return this.age == teacher.age && this.name.equals(teacher.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Teacher teacher)) return false;
        return age == teacher.age && Objects.equals(name, teacher.name);
    }
}

public class Equals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일", 33);
        Teacher teacher2 = new Teacher("김준일", 33);

        System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher1 == teacher2);
    }
}
