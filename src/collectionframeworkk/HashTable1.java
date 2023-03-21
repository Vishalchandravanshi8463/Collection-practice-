/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionframeworkk;

/**
 *
 * @author vishal chandravanshi
 */
import java.util.*;
import java.util.Map.Entry;

public class HashTable1 { //same hashMap and hashtable their is null not accepted 

    public static void main(String[] args) {
        // Hashtable hs=new Hashtable(); //capacity is 11 load factor 0.75 
        //  Hashtable hs=new Hashtable(16);//new capacity initialcapacity 
        // Hashtable hs=new Hashtable(18,(float)0.95);
        Hashtable<Integer, String> hs = new Hashtable<Integer, String>();
        hs.put(101, "vishal");
        hs.put(100, "vishal");
        hs.put(103, "shiva");
        hs.put(104, "shiyaa");
        hs.put(105, "vijay");
        System.out.println(hs);
        // hs.put(null,"riya");       //NullPointerException
        //  hs.put(111, null);             //NullPointerException
        System.out.println(hs.get(100)); //vishal
        System.out.println(hs.get(105));//vijay
        System.out.println(hs.remove(100));//vishal
        System.out.println(hs);//{105=vijay, 104=shiyaa, 103=shiva, 101=vishal}

        System.out.println(hs.containsKey(101));//true
        System.out.println(hs.containsValue("vijay"));//true

        System.out.println(hs.isEmpty());//false

        System.out.println(hs.keySet());//[105, 104, 103, 101]
        System.out.println(hs.values());//[vijay, shiyaa, shiva, vishal]

        for (int t : hs.keySet()) {
            System.out.println(t + "  " + hs.get(t));
        }
        /*
        105  vijay
104  shiyaa
103  shiva
101  vishal
         */
        System.out.println("");
        //Entry specific method 
        for (Map.Entry entry : hs.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        System.out.println("");
        Set s = hs.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {

            Map.Entry entry;
            entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

    }

}
