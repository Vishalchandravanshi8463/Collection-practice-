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
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class HashMap1 {

    public static void main(String[] args) {
        //HashMap hm=new HashMap();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "vishal");
        hm.put(101, "rahul");
        hm.put(103, "shiva");
        hm.put(104, "shiyaa");
        hm.put(105, "vijay");
        System.out.println(hm); //{100=vishal, 101=rahul, 103=shiva}
        //IF I PUT D=SAME KEY THEN IT UPDATE THE VALUE LETS SEE
        hm.put(101, "shubham");//{100=vishal, 101=shubham, 103=shiva}
        System.out.println(hm);
        /////  RETURN FOR GET()
        System.out.println(hm.get(101));
        System.out.println(hm.get(102));//Null
        System.out.println(hm.get(103));
        //REMOVE PAIR remove()
        System.out.println(hm.remove(101));//shubham
        System.out.println(hm);//vishal,shiva
        System.out.println(hm.containsKey(101));  //false 
        System.out.println(hm.containsValue("vishal"));//true 

        System.out.println(hm.isEmpty());//FALSE

        //for only key set
        System.out.println(hm.keySet());//[100, 103, 104, 105]

        for (Object i : hm.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println("");
        //for all the valures which may be duplicate 
        System.out.println(hm.values());//[vishal, shiva, shiyaa, vijay]

        for (Object i : hm.values()) {
            System.out.print(i + " ");
        }
        System.out.println("");
        //for entry set 
        System.out.println(hm.entrySet());//[100=vishal, 103=shiva, 104=shiyaa, 105=vijay]

        for (Object i : hm.keySet()) {
            System.out.println(i + "   " + hm.get(i));
        }
        System.out.println("");
        //100   vishal
        //103   shiva
        //104   shiyaa
        // 105   vijay

        //entry method 
        for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        //100   vishal
        //103   shiva
        //104   shiyaa
        // 105   vijay
        System.out.println("");
        //ITERATOR 
        Set s = hm.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Entry) it.next();
            System.out.println(entry.getKey() + "  " + entry.getValue());

        }/*
        
100  vishal
103  shiva
104  shiyaa
105  vijay
        */

    }
}
