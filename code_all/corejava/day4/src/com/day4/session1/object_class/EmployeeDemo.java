package com.day4.session1.object_class;

public class EmployeeDemo  {
    public static void main(String[] args) throws CloneNotSupportedException {
    	
    
    	
//    	Employee employee=new Employee(1, "raj");
//    	System.out.println(employee);
    	
    	
//    	if(employee instanceof Object) {
//    		System.out.println("y");
//    	}
    	
    	
        Employee e1 = new Employee(1, "John");
        
        Employee e2 =(Employee) e1.clone();

        
        
        
        
        
//        if(e1.equals(e2)){
//            System.out.println("are equal");
//        }else{
//            System.out.println("not equal");
//        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        //What is the use of getClass method?

//        Employee e3 = new Employee(1, "John");
//
//        Class<?> clazz=e3.getClass();
//        System.out.println(clazz.getName());
//
//        Employee e3 = new Employee(1, "John");
//        System.out.println(e3);
//        try {
//            Employee e3Clone= (Employee) e3.clone();
//            System.out.println("clonned obj");
//            System.out.println(e3Clone);
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }

        Employee e3 = new Employee(1, "John");
        e3=null;
        System.gc();
        Runtime.getRuntime().gc();
        System.out.println("--------------");

    }
}
