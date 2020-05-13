
package com.Empwage.test;
import com.Empwage.model.Employee;
import com.Empwage.controller.Employeecontroller;
public class EmployeeMain{

          Employee employee = new Employee();
          Employeecontroller employeecontroller = new Employeecontroller();
  
	 public static void main(String[] args){

		int status=0;
		int workhours=0;
		int dailywage=0;

		for(int days=0; days<20 && totalhours<100; days++){


			status=employeecontroller.EmployeeStatus();
			switch (status){
				case 0: 
	                        	//System.out.println("absent");
					break;
				case 1:
					//System.out.println("present");
					workhours=employeecontroller.Employee_Workhours();
					totalhours+=workhours;
					/*switch (workhours){
						case 8:
							System.out.println("fulltime wage of emplloyee is : "+ employeecontroller.Employeewage(workhours));
							break;
						default:
							System.out.println("parttime wage of emplloyee is : "+ employeecontroller.Employeewage(workhours));
					}*/
					dailywage=employeecontroller.Employeewage(workhours);
					employeecontroller.Employee_Monthlywage(dailywage);
			}
	}

	 System.out.println("monthly wage is : "+ employeecontroller.monthlywage);
	
	}
}
