/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpackage;

public class Employee{
	private String name;
	private String empId;
	private double salary;
	public void setName(String name){
		this.name=name;
	}
	public void setEmpId(String empId){
		this.empId=empId;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public String getName(){
		return name;
	}
	public String getEmpId(){
		return empId;
	}
	public double getSalary(){
		return salary;
	}
}
	