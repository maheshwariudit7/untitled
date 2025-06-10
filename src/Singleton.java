import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {

    private static Singleton INSTANCE;

    private Singleton(){
        if(INSTANCE != null)
            throw new RuntimeException("Use getInstance");
    }

    public static Singleton getInstance(){
        if(INSTANCE == null)
            INSTANCE = new Singleton();
        return INSTANCE;
    }

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1==s2);

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton s3 = constructor.newInstance();

        System.out.println("With reflection ==> "+(s1==s3));

    }
}
