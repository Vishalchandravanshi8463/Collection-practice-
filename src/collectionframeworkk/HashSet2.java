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
import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<Integer> even=new HashSet<Integer>();
        even.add(4);
        even.add(4);
        even.add(6);
        System.out.println(even);
        HashSet<Integer> odd=new HashSet<Integer>();
        odd.add(43);
        odd.add(4532);
        odd.add(61);
        odd.add(4);
        System.out.println(odd);
        odd.addAll(even);
        System.out.println(odd);
        odd.removeAll(even);
        System.out.println(odd);
    }
}
