/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.Collections;

/**
 *
 * @author vishal chandravanshi
 */
import java.lang.*;
import static java.util.Collections.list;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(53);
        list.add("vishal");

        System.out.println(list);
        LinkedList li = new LinkedList();
        li.add(42);
        li.add(674);
        li.addFirst(42);
        li.addLast(8);
        System.out.println(li);
        li.addAll(list);
        System.out.println(li);
        li.add("chandravanshi");
        System.out.println(li);
        li.removeAll(list);
        System.out.println(li);
        li.remove(1);
        li.add(2, "java");
        System.out.println(li);
        li.set(4, "jawariya");
        System.out.println(li);

        System.out.println(li.get(3));

        System.out.println(li.contains("java"));
        System.out.println(li.isEmpty());
        System.out.println(li.contains("vishu"));

        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }
        System.out.println("");
        for (Object v : li) {
            System.out.print(v + " ");
        }
        System.out.println("");

        Iterator it = li.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("");
        li.removeAll(li);
        System.out.println(li);
        li.add(42);
        li.add(64);
        li.add(1);
        li.add(4);
        System.out.println(li);
        Collections.sort(li);
        System.out.println("after sorting" + li);
        Collections.sort(li, Collections.reverseOrder());
        System.out.println(li);
        Collections.shuffle(li);
        System.out.println("after shuffling" + li);
        Collections.shuffle(li);
        System.out.println("after shuffling" + li);
        li.addFirst(422);
        li.addLast(99);
        System.out.println(li);

        System.out.println(li.getLast());
        System.out.println(li.getFirst());
        li.removeFirst();
        System.out.println(li);

        String g = "rroo";
        String s = "roro";
        LinkedList set3 = new LinkedList();
        set3.add('a');
        set3.add('b');
        set3.add('b');
        //set3.add('o');
        LinkedList set4 = new LinkedList();
        set4.add('a');
        set4.add('a');
        set4.add('b');
      //  set4.add('r');
//        Collections.sort(set4);
//        Collections.sort(set3);
//        System.out.println("set4" + set4);
//        System.out.println("set3" + set3);
        System.out.println("set contains  " + set4.containsAll(set3));
        System.out.println(set3);
        set3.addAll(set4);
        set3.removeAll(set4);
        System.out.println(set3);

    }


}
