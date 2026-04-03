package study.ch14;

class Animal {

}

class Duck extends Animal {

}

public class Main {
    public static void main(String[] args) {
        // 최상위 객체 (Object)
        Object a = 10;
        Object b = 3.14;
        Object c = "김준일";
        Object d = 'a';
        Object e = new Animal();

        // Wrapper Class(래퍼 클래스)
        Integer integer = (Integer) 10; // 일반자료형 -> 클래스자료형 (Boxing)
        int i = (int) integer;  // 클래스자료형 -> 일반자료형 (UnBoxing)
        // 자바는 Boxing, UnBoxing이 자동 -> AutoBoxing

        // int i2 = null;   -> null대입 불가능
        Integer integer2 = null;

        System.out.println(((int) a) + ((double)b));

    }
}
