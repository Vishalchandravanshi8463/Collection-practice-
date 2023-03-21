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
public class ARRAYLIST_YT {
    public static void main(String[] args) {
        List<Employee>employees=new ArrayList<Employee>();
        employees.add(new Employee(10,"Ramesh",30,400000));
        employees.add(new Employee(20,"Vishal",29,310000));
        employees.add(new Employee(30,"shiva",31,350000));
        employees.add(new Employee(12,"Ramu",30,4004300));
        
      Collections.sort(employees,new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
         
                return (int)((o1.getSalary())-(o2.getSalary()));
            }
        });
     // Collections.sort(employees,(o1,o2))->(int)(o2.getSalary()-o1.getSalary());
      
        System.out.println(employees);
      
    }
    class mySort implements Comparator<Employee>
    {
        @Override
        public int compare(Employee o1,Employee o2)
        {
            return (int)((o1.getSalary())-(o2.getSalary()));
        }
    }
}
