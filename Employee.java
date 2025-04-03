package LambdaRelatedToCollections;

public class Employee {
	private Integer empId;
	private String empName;
	private int salary;

	private Integer getEmpId() {
		return empId;
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

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

	public Employee(Integer empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	
	
	
	
}
