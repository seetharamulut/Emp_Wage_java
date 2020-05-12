
package com.Empwage.controller;
import com.Empwage.model.Employee;
public class Employeecontroller{

	public int EmployeeStatus(){

		int status=(int)(Math.random()*10)%2;
		return status;
	}

	public int Employee_Workhours(){
		int workhours=((int)((Math.random()*10)%8)+1);
		return workhours;
	}

	public int Employeewage(int hours){

		int dailywage=hours*20;
		return dailywage;
	}
}
