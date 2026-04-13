package study.ch25;

class ClassA {
    private ClassB b;

    public ClassA(ClassB b) {
        this.b = b;
    }

    public void test1() {
        System.out.println("테스트1 호출");
        b.test2();
    }
}

class ClassB {
    private ClassC c;

    public ClassB(ClassC c) {
        this.c = c;
    }

    public void test2() {
        System.out.println("테스트2 호출");
        c.test3();
    }
}

class ClassC {
    public void test3() {
        System.out.println("테스트3 호출");
    }

}

public class Main {
    public static void main(String[] args) {
        ClassC 배터리1 = new ClassC();
        ClassC 배터리2 = new ClassC();

        ClassB b = new ClassB(배터리2);

        ClassA a = new ClassA(b);
        a.test1();
    }
}











