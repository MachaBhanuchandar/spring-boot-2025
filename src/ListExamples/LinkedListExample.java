package ListExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(28);
        list1.add(96);
        list1.add(69);
        list1.add(56);
        list1.add(23);



        System.out.println(list1);
//        remove data
        list1.remove(2);
        System.out.println("list after removing "+list1);
//        search list
        System.out.println("list of 0th index element :"+list1.get(0));
        System.out.println("list of 2nd index element :"+list1.get(2));
        System.out.println("list of 3rd index element :"+list1.get(3));

    }
}
