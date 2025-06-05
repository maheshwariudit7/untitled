package Java8;

interface A{
    default void hello(){
        System.out.println("hello from A");
    }
}

interface B extends A{
    default void hello(){
        System.out.println("hello from B");
    }
}

interface C extends B{
    default void hello(){
        System.out.println("hello from C");
    }
}
public class DDD implements B,C{

    public void hello(){
        System.out.println("hello from DDD");
//        B.super.hello();
    }


    }


