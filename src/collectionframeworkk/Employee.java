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
public class Employee {

    private int id;
    private String name;
    private int age;
    private long salary;

   public Employee(int id,String name,int age,long salary)
   {
       this.id=id;
       this.name=name;
       this.age=age;
       this.salary=salary;
   }
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

   
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

  
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }

    
    public long getSalary() {
        return salary;
    }

  
    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
    return "Employee[id="+id+" ,names "+name+" ,age= "+age+" ,salary "+salary+"]";
        
}
    
}
