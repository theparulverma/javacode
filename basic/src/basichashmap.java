import java.util.*;
public class basichashmap {
    public static void main(String args[])
    {
        HashMap<String,Integer> hm = new HashMap<>();
        //insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);
        //to get value of any key
        int population = hm.get("India");
        System.out.println(population);
        //if we pass the value of key which is not present then it will return null value
        System.out.println(hm.get("Indonesia"));
        //containskey check whether the Map contains that given key value or not and return true or false.
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));
        //remove*/
        System.out.println(hm.remove("China"));//it will remove china key from hashmap and return its value.
        System.out.println(hm);
        // to calculate the size
        System.out.println(hm.size());
        //Isempty returns boolean value and check whether hashmap is empty or not.
        //hm.clear means to delete all the values of hashmap
        hm.clear();
        System.out.println(hm.isEmpty());
        //hashcode()
    }
}
