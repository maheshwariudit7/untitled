package Java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("from");
        list.add("java");

//        for(String s:list){
//            list.remove(s);
//        }

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            iterator.remove();
        }

    }
}
