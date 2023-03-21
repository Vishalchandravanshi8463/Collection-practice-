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

public class HashSet1 {

    private static Object hss;

    public static void main(String[] args) {
        // HashSet hs=new HashSet(); capacity 16 
//        HashSet hs=new HashSet(100);  capacity 100
//        HashSet hss=new HashSet(100,(0.95)); capacity 100,loader 0.95
//        HashSet<Integer> hsss=new HashSet<Integer>();   integer value 
//        
        HashSet hs = new HashSet();
        hs.add(42);
        hs.add(53);
        hs.add(63);
        hs.add("vishal");
        hs.add("chandravanshi");
        hs.remove(53);
        System.out.println(hs);
        System.out.println(hs.contains("vishal"));
        System.out.println(hs.isEmpty());

        //only two ways 
        for(Object v:hs)
        {
            System.out.print(v+" ");
        }System.out.println("");
        Iterator it =hs.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }System.out.println("");
        // NEW METHOD FOR PRINTING LAMBDA EXPRESSION 
        
       
    }
}
