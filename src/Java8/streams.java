package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streams {

    public static void main(String[] args) {

//        Given a list of integers, separate odd and even numbers?
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean,List<Integer>> map =
                listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));

        for(Map.Entry<Boolean,List<Integer>> m:map.entrySet()){

            if(m.getKey())
                System.out.println("============== Even numbers ===============");
            else
                System.out.println("============== Odd numbers ===============");

            for(int i:m.getValue()){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
