package com.example.model;

public class Employee {
	
	String empId;
	String empName;
	int salary;
	
	Employee(){
		
	}
	public Employee(String empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setEmpId("gunja123");
		System.out.println(obj.getEmpId());
		obj.setEmpName("gunja");
		System.out.println(obj.getEmpName());
		obj.setSalary(90000);
		System.out.println(obj.getSalary());
		
		Employee obj1=new Employee("gunja123","gunja",50000000);
		System.out.println(obj);
		
		System.out.println(obj1);
		System.out.println(obj1.getSalary());
		
		
	}

}
