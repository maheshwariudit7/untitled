package Java8;

public class Singleton {
    private static Singleton obj;

    private Singleton(){}

    public static Singleton getInstance(){
        if(obj == null){
            return obj = new Singleton();
        }

        return obj;
    }

    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();

        System.out.println(s==s1);
    }



}
