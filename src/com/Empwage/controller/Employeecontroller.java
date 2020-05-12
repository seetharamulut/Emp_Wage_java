
package com.Empwage.controller;
import com.Empwage.model.Employee;
public class Employeecontroller{

	public int EmployeeStatus(){

		int status=(int)(Math.random()*10)%2;
		return status;
	}
}
