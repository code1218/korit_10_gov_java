package study.ch13;

abstract class AbstractAnimal {
    private String name;
    public AbstractAnimal() {}
    public AbstractAnimal(String name) {this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck extends AbstractAnimal implements Flyable, Swimmable {

    public Duck() {
        super();
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("날기!");
    }

    @Override
    public void swim() {
        System.out.println("수영하기!");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        AbstractAnimal animal = new Duck();
        Flyable flyable = new Duck();
        Swimmable swimmable = new Duck();

        duck.fly();
        duck.swim();
        duck.setName("우리집오리");
        System.out.println(duck.getName());

        animal.setName("옆집오리");
        System.out.println(animal.getName());

        flyable.fly();

        swimmable.swim();
    }
}













