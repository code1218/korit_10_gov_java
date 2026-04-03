package study.ch15;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("김준일");
        student.setAge(33);
        student.setAddress("부산진구");
        System.out.println(student);

        Student student2 = new Student("김준일", 33, "동래구");
        System.out.println(student2);

        final String data = "임시 데이터";   //final 상수
//        data = "test";    상수는 한번 초기화 후 변경 할 수 없다.
        System.out.println(data);

        final String data2; // 상수 선언
        data2 = "test"; // 초기화
//        data2 = "test2";

        Student student3 = new Student("김준일", 33);

    }
}
