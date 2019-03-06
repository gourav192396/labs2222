package labfive;

public class Employee {

	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void checkSalary() {
		try {
			if (salary >= 3000)
				System.out.println("Salary of " + name + " is ok");
			else
				throw new EmployeeException("Salary of " + name
						+ " is below 3000 !!!");
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
