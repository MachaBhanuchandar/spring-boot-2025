package mapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {
        Map<Integer,String> map1 =new HashMap<>();

        map1.put(1,"bhanu");
        map1.put(2,"chandar");
        map1.put(null,"macha");
        map1.put(1,"raja");
        System.out.println("map: "+map1);
        map1.remove(null);
        System.out.println("map: "+map1);
//        travrsing data
        for (Map.Entry m1:map1.entrySet()){
            System.out.println("map: "+m1.getKey()+"--------"+m1.getValue());

        }
    }
}
