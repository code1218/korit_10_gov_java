package study.ch12;

abstract class AA {

}

class BB extends AA {

}

class CC extends BB {

}

class MM {
    public static void main(String[] args) {
//        AA a = new AA();    // 추상클래스라서 생성 불가능
        BB b = new BB();
        AA b2 = new BB();
        AA c = new AA() {

        };
        AA cc = new CC();
        AA ccc = new BB() {

        };
        BB cccc = new BB() {

        };

    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Cat cat = new Cat();

        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();

        animals[2] = new Animal() {
            @Override
            public void eat() {

            }
        };

    }
}
