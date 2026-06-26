package Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Set;

class solution{
    public static void main(String[] args) {
        
        HashMap<Integer,Integer> hp = new HashMap<>();

        hp.put(0,1);
        hp.put(1,1);
        hp.put(2,1);
        hp.put(3,1);

        Set enter = hp.entrySet();
        Iterator itr = enter.iterator();

        while(itr.hasNext()){
            Map.Entry map =(Map.Entry) itr.next();
            System.out.println(map.getKey());
            System.out.println(map.getValue());
            
        }

    }
}