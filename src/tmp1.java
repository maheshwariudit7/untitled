import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class tmp1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");
        sb.appendCodePoint(98);
        System.out.println(sb);

        Queue<String> q = new PriorityQueue<>();
        q.add("hello");

        System.out.println(q);

        List<String> l = new LinkedList<>();
        l.add("hello");



    }

}


