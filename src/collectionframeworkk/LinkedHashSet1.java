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
import java.util.LinkedHashSet;
public class LinkedHashSet1 {
    
    
    //BASIC DIFF BETWEEN HASHSET AND LINKEDHASHSET IS IN LINKEDHASHSET INSERTION ORDER PRESERVED
    
    public static void main(String[] args) {
        
        LinkedHashSet lset=new LinkedHashSet();
        lset.add(53);
        lset.add(64);
        lset.add("vishal");
        System.out.println(lset);
        
         LinkedHashSet<Integer> llset=new LinkedHashSet<Integer>();
         llset.add(94);
         llset.add(64);
         
         llset.remove(64);
         System.out.println(llset);
         System.out.println(llset);
         llset.addAll(lset);
         System.out.println(llset);
         lset.add(llset);
         System.out.println(lset);
         llset.removeAll(lset);
         System.out.println(llset);
         lset.removeAll(llset);
         System.out.println(lset);
    }
    
}
