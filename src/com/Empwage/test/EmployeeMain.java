
package com.Empwage.test;
import com.Empwage.model.Employee;
import com.Empwage.controller.Employeecontroller;
public class EmployeeMain{

	 public static void main(String[] args){

		Employee employee = new Employee();
		Employeecontroller employeecontroller = new Employeecontroller();
		int status=employeecontroller.EmployeeStatus();
		if( status == 1)
			System.out.println("present");
		else
			System.out.println("absent");
	}
}
