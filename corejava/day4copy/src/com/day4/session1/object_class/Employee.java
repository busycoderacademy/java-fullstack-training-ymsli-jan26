package com.day4.session1.object_class;

import java.util.Objects;

public class Employee implements Cloneable{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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
     public void print(){
         System.out.println("Employee [id=" + id + ", name=" + name + "]");
     }

   
}
