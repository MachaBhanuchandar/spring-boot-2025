package SetExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set1 =new LinkedHashSet<>();
        set1.add("mango");
        set1.add("banana");
        set1.add("apple");
        set1.add("grapes");
        System.out.println("set1 :"+set1);
        System.out.println("set1 size is :"+set1.size());


    }
}
