
package com.Empwage.controller;
import com.Empwage.model.Employee;
public class Employeecontroller{

	public int EmployeeStatus(){

		int status=(int)(Math.random()*10)%2;
		return status;
	}

	public int Employeewage(){

		int dailywage=((int)((Math.random()*10)%8)+1)*20;
		return dailywage;
	}
}
