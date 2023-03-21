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
public class ArrayList1 {
    
      public static void main(String[] args) {
//         String g="rroo";
//        String s="roro";
//        
//        
//         ArrayList set3=new ArrayList();
//        set3.add(g);
//         ArrayList set4=new ArrayList();
//        set4.add(s);
//        Collections.sort(set4);
//        Collections.sort(set3);
//         System.out.println("set4"+set4);
//          System.out.println("set3"+set3);
//        System.out.println("set contains  "+set4.containsAll(set3));
//        System.out.println(set3);
//        set4.removeAll(set3);
         
        
        
        
          ArrayList al = new ArrayList();
        al.add(43);
        al.add("vishal");
        al.add(43.43);
        al.add('v');
        al.add(5332);
        System.out.println(al);
        al.remove(1);
        al.remove(2);
        
        System.out.println(al);
        al.set(0,"chandravanshi");
        al.set(2,"shivam");
        System.out.println(al);
        
        System.out.println(al.get(2));
        
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.contains(43.43));
        System.out.println("");
        al.add(2,"vishal");
        al.add(3,"chandravanshi");
        al.set(3, "java")//   replace not increase directly replace
                ;       
     
        System.out.println(al);
    }
        
        
        
      
    
}
