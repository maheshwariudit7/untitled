package Java17;

import java.util.List;

public class temp {

    public static void main(String[] args) {

        List<Integer> l = List.of(1,2,4);

        // cant perform modifying operations as the resultant list of List.of() call return an unmodifiable list

//        l.add(10);
        l.forEach(System.out::println);
    }
}
