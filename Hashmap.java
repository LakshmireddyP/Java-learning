import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        //Country(key), population(value)
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India", 120);
        map.put("US", 30);
        map.put("Chaina", 150);
        System.out.println(map);
        map.put("Chaina", 180);  //It override the firstone
        System.out.println(map);

        //search
        if(map.containsKey("Chaina")){
            System.out.println("Key is present in the map");
        }else{
            System.out.println("key is not present in the map");
        }

        //get the value using get()function
        System.out.println(map.get("Chaina"));  //Key exists
        System.out.println(map.get("Indonesia"));  //key doesn't exists then it prints null

        //Iteration in Hashmap
        //for(int val: arr)
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }
        //Another type of Iteration
        // Set<String> keys =map.keySet();
        // for(String key:keys){
        //     System.out.println(key+" "+map.get(key));
        // }

        map.remove("Chaina");
        System.out.println(map);
    }
}
