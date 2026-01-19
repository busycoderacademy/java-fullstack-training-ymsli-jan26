package com.day2.session1;

class Employee {
	private int id;
	private double salary;

	public Employee(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void printEmpDetails() {
		System.out.println("id: " + id + " salary: " + salary);
	}
}

class EmployeeSalaryProcessing {

	//case 1: although case 1 have not side effected in calling method but why to even allowe this think
	final void processSalary( Employee employee) {
		employee=null;
		System.out.println("final method");
	}
	
	//thats way u perfer to have final keyword here
//	final void processSalary(final Employee employee) {
//		employee=null;
//		System.out.println("final method");
//	}
}

public class NeedOfFinal {
	public static void main(String[] args) {
		
//		final Employee employee = new Employee(1, 10000);
//		employee=new Employee(1, 10000);
		
//		employee.printEmpDetails();
//		employee.setSalary(employee.getSalary()*1.1);
//		employee.printEmpDetails();
		
		
		
//		EmployeeSalaryProcessing employeeSalaryProcessing = new EmployeeSalaryProcessing();
//		employeeSalaryProcessing.processSalary(employee);
//
//		employee.printEmpDetails();
		
	}

}
