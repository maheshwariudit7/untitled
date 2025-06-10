import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

//        Given a list of integers, separate odd and even numbers?
/*
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean,List<Integer>> map =
                listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
        for(Map.Entry<Boolean,List<Integer>> m:map.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }*/

//        How do you remove duplicate elements from a list using Java 8 streams?

       /* List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        listOfStrings.stream().distinct().forEach(System.out::println);*/

//   How do you find frequency of each character in a string using Java 8 streams?

    /* String inputString = "Java Concept Of The Day";
        Map<Character,Long> map =
                inputString.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(Map.Entry<Character,Long> m: map.entrySet()){
            System.out.println(m.getKey()+" --> "+m.getValue());

        }*/

//         How do you find frequency of each element in an array or a list?

        /*List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String,Long> map =
                stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));

        for(Map.Entry<String,Long> m:map.entrySet()){
            System.out.println(m.getKey());
            System.out.print(m.getValue());
        }*/

//        How do you sort the given list of decimals in reverse order?

       /* List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
*/

//        Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?

     /*   List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String res = listOfStrings.stream().collect(Collectors.joining(",","[","]"));

        System.out.println(res);
*/

//         min and max from the list
       /* List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int i = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(i);

        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);*/

//        9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?

       /* int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().forEach(System.out::print);
*/

//        How do you get three maximum numbers and three minimum numbers from the given list of integers?

      /*  List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        listOfIntegers.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(System.out::println);
*/

//        Java 8 program to check if two strings are anagrams or not?

       /* String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 =
                Arrays.stream(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        s2 =
                Arrays.stream(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if(s1.equals(s2))
            System.out.println("yes");
        else
            System.out.println("no");
*/

//        Find sum of all digits of a number in Java 8?

     /*   int i = 15623;

        int sum = Arrays.stream(String.valueOf(i).split("")).map(s->Integer.valueOf(s)).reduce(0,
                (s1,s2)->s1+s2);

        System.out.println(sum);*/

      // second largest in list

      /*  List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Set<Integer> s =
                listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).collect(Collectors.toSet());

        System.out.println(s);*/

//        Given a list of strings, sort them according to increasing order of their length?

        /*List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

                listOfStrings.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);*/

//        How do you find common elements between two arrays?

       /* List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream().filter(i->list2.contains(i)).forEach(System.out::println);
*/

//        Reverse each word of a string using Java 8 streams?
      /*  String str = "Java Concept Of The Day";

        String res =
                Arrays.stream(str.split(" ")).map(s->(new StringBuffer(s).reverse())).collect(Collectors.joining(" "));
        System.out.println(res);
*/

//        How do you find sum of first 10 natural numbers?

    /*    int sum = IntStream.range(1,11).sum();
        System.out.println(sum);*/

//        reverse an integer array

        /*int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] res = IntStream.rangeClosed(1,array.length).map(i->array[array.length-i]).toArray();

        System.out.println(res.toString());*/

//        How do you find the most repeated element in an array?

       /* List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

                Map.Entry<String,Long> map =
                        listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println(map.getKey()+"-->"+map.getValue());*/


// is it a palindrome

     /*   String str = "ROTATOR";

        boolean b =
                IntStream.range(0,str.length()/2).noneMatch(i->str.charAt(i) != str.charAt(str.length()-i-1));

        if(b)
            System.out.println(" a palindrome");
        else System.out.println("Not a palindrome");
        */

       /* String name = "firstname lastname";
        String[] s = name.split(" ");
        String res =
                IntStream.range(0,s.length).mapToObj(i->s[s.length-i-1]).collect(Collectors.joining(
                " "));

        System.out.println(res);*/

//        How do you extract duplicate elements from an array?

        /*List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> uniqueEl = new HashSet<>();

        Set<Integer> dupEl = listOfIntegers.stream().filter(e-> !uniqueEl.add(e)).collect(Collectors.toSet());

        for(int i:dupEl){
            System.out.println(i);
        }

        System.out.println("========================");
        for(int j:uniqueEl){
            System.out.println(j);
        }
*/

//        Print duplicate characters in a string?

        /*String inputString = "Java Concept Of The Day";
        Map<String,Long> map =
                Arrays.stream(inputString.split("")).map(s->s.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for(Map.Entry<String,Long> m:map.entrySet()){
            if(m.getValue()>1L)
                System.out.println(m.getKey());
        }*/

//        Find first repeated character in a string?
/*
        String inputString = "Java Concept Of The Day";
        Map.Entry<String,Long> repeatedChar =
                Arrays.stream(inputString.split("")).map(s->s.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(m->m.getValue()>1L).findFirst().get();
        System.out.println(repeatedChar.getKey());
        */

//        Find first non-repeated character in a string?

       /* String inputString = "Java Concept Of The Day";
        Map.Entry<String,Long> c =
                Arrays.stream(inputString.split("")).map(s->s.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1L).findFirst().get();

        System.out.println(c.getKey());*/

        //fibonacci series

        /*Stream.iterate(new int[] {0,1},f-> new int[] {f[1],f[0]+f[1]}).limit(10).map(f->f[0])
                .forEach(i->System.out.print(i+" "));*/

        // first 10 odd numbers

       /* Stream.iterate(new int[] {1,3},f-> new int[]{f[1],f[1]+2})
                .limit(10)
                .map(f->f[0]).forEach(i->System.out.print(i+" "));
*/

        // last element of an array

       /* List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        listOfStrings.stream().skip(listOfStrings.size()-1).forEach(System.out::println);*/

//        Find the age of a person in years if the birthday has given?

        LocalDate bday = LocalDate.of(1985,11,21);
        LocalDate now = LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(bday,now));





    }
}
