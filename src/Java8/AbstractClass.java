package Java8;

public abstract class AbstractClass {

    public void printHello() {
        System.out.println("hello");
    }


}

class ConcreteClass extends AbstractClass {

    public static void main(String[] args) {
        ConcreteClass ac = new ConcreteClass();
        ac.printSomething();

    }

    public void printSomething() {
        System.out.println("from concrete class");
    }
}
