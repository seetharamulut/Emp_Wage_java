
package com.Empwage.test;
import com.Empwage.model.Employee;
import com.Empwage.controller.Employeecontroller;
public class EmployeeMain{

	 public static void main(String[] args){

		Employee employee = new Employee();
		Employeecontroller employeecontroller = new Employeecontroller();
		EmployeeMain employeeMain = new EmployeeMain();

		int status=employeecontroller.EmployeeStatus();
		switch (status){
			case 0: 
	                        System.out.println("absent");
				break;
			case 1:
				System.out.println("present");
				int workhours=employeecontroller.Employee_Workhours();
				switch (workhours){
					case 8:
						System.out.println("fulltime wage of emplloyee is : "+ employeecontroller.Employeewage(workhours));
						break;
					default:
						System.out.println("parttime wage of emplloyee is : "+ employeecontroller.Employeewage(workhours));
				}
		}
	}
}
