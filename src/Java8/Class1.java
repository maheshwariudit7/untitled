package Java8;

public class Class1 {

    public static void main(String[] args) {

        FuncInterface action = () -> System.out.println("Printed Something");
        action.printSomething();
    }
}
