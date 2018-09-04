package com.capgemini.Day5;

public class Employee {
	private long employeeId;
	private double basicSalary; 
	private String employeeName;
	private String employeeAddress;
	private final double specialAllowance=250.80;
	private final double HRA=1000.50;
	private int employeePhone;
	
	public Employee(long id,String name, String address, int phone) {
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
	}
	
	public double calculateSalary(long basicSalary) {
		
		double salary;
		salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*HRA/100);
		return salary;
	}
	

}
