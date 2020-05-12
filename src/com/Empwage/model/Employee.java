
package com.Empwage.model;
public class Employee{


        private int status;
	private int dailywage;
	private int workhours;

        public int EmployeeStatus(){
                this.status=status;
		return status;
        }

	public int EmployeeWage(int hours){
		this.dailywage=dailywage;
		return dailywage;
	}

	public int Employee_workhours(){
		this.workhours=workhours;
		return workhours;
	}
}
