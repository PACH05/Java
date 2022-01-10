package javaDSA;
import java.util.*;

public class HashMapexample {
    public static void main(String[] args) {
        Set <Integer> hashing = new HashSet<>();
        hashing.add(1);
        hashing.add(4);
        hashing.add(5);
        System.out.println(hashing.size());
        System.out.println(hashing.contains(6));
        System.out.println(hashing.contains(5));
        System.out.println(hashing.remove(4));
        System.out.println(hashing.size());
        Hashing hash = new Hashing();
        hash.adele(1, 2);
        System.out.println(hash.sizeh());
    }
}

class Hashing {
   Map<Integer, Integer> hash = new Hashtable<>();
   public void adele(int key, int value){
       hash.put(key, value);
   }
   public int sizeh(){
       int s = hash.size();
       return s;
   }
}

