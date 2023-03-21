
package collectionframeworkk;

import java.util.PriorityQueue;

import java.util.*;

public class Queue_LinkedList1 {
    
    public static void main(String[] args) {
        LinkedList q = new LinkedList();
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
          PriorityQueue<Integer> q1=new PriorityQueue<Integer>();
         q.add(1);
         q.add(65);
         q.add(2);
         q.add(564);
         q.add(1);
         System.out.println(q);
         System.out.println(q.poll());
         
        q.offer(64);
       
        q.offer(642);
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
         Iterator it=q.iterator();System.out.println("");
         while(it.hasNext())
         {
             System.out.print(it.next()+" ");
         }
    }
}
