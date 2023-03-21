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
public class HashSet3 {
    public static void main(String[] args) {
//        String g="ror";
//        String s="rro";
//        
//        
//         HashSet set3=new HashSet();
//        set3.add(g);
//         HashSet set4=new HashSet();
//        set4.add(s);
//        System.out.println("set"+set3.containsAll(set4));
//        System.out.println(set3);
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
         HashSet<Integer> set1=new HashSet<Integer>();
        set1.add(6);
        set1.add(7);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);
        
        //UNIUN
        //set1.addAll(set);
        System.out.println(set1);
        
        //INTERSECTION 
        System.out.println("intersection ");
        set.retainAll(set1);
        System.out.println(set);
        System.out.println("set"+set);
        System.out.println("set1"+set1);
    //    set1.removeAll(set);
        System.out.println("diff"+set1);
        
        System.out.println(set1.containsAll(set));
    }
}
