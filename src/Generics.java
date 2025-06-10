public class Generics {

    // <T> represents the generic type i.e parameters of any data type can be supplied
    // to the method
    // without "T data" parameter there's no use of <T> generic

    public <T> void genericMethod(T data){
        System.out.println(data);
    }

    public static void main(String[] args) {

        Generics g = new Generics();
        g.genericMethod(10);
    }
}

class Box<T> {

    T data;

    public Box(T data){
        this.data=data;
    }

    public T getData(){
        return data;
    }

    public static void main(String[] args) {

        Box<String> box= new Box<>("hola");
        System.out.println(box.getData());


    }
}