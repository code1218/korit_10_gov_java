package study.ch10;

public class Array02 {
    public static void main(String[] args) {
        int[] iArr = { 1, 2, 3, 4, 5 };
        char[] cArr = { 'a', 'b', 'c' };
        boolean[] bArr = { true, false, true, false };
        double[] dArr = { 1.0, 3.14, 5.5 };
        String[] sArr = { "김준일", "김준이", "김준삼" };

        class Student {
            private String name;

            Student() {}

            Student(String name) {
                this.name = name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        Student[] students = {
                new Student("김준일"),
                new Student("김준이"),
                new Student("김준삼")
        };

        Student[] students2 = { new Student(), new Student(), new Student() };
        students2[0].setName("김준일");
        students2[1].setName("김준이");
        students2[2].setName("김준삼");
    }
}
