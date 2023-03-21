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
import java.util.Iterator;

public class Queue_Priority1 {

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.offer("z");
        q.offer("V");
        //WHEN QUEUE IS EMPTY ELEMENT()RETURN EXCEPTION 

        System.out.println(q);
        System.out.println(q.element());
        //WHEN QUEUE IS EMPTY Pekk()RETURN NULL 
        System.out.println(q.peek());
//          PriorityQueue<Integer> q1=new PriorityQueue<Integer>();
//         q1.add(1);
//         q1.add(65);
//         q1.add(2);
//         q1.add(564);
//         q1.add(1);
//         System.out.println(q1);
//         System.out.println(q1.poll());
//         
//        q.offer(64);
//       
//        q.offer(642);
        System.out.println(q);

        //FOR GET AND REMOVE  from head
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
        for(Object s:q)
        {
            System.out.print(s+" ");
        }
        Iterator it=q.iterator();
//        while(it.hashNext())
//        {
//            System.out.println(it.next());
//        }
    }
}
