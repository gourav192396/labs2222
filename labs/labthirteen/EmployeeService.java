package labthirteen;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class EmployeeService {

	List<Employee> employees;
	List<Department> departments;

	public EmployeeService() {
		employees = EmployeeRepository.getEmployees();
		departments = EmployeeRepository.getDepartments();
	}

	void calculateSalary() {
		double totalSalary = employees.stream().map(a -> a.getSalary())
				.reduce((r, i) -> r + i).get();
		System.out.println("Total Salary of all employees is " + totalSalary);
	}

	void listEmployees() {
		for (Department department : departments) {
			long count = employees.stream()
					.filter(x -> x.getDepartment() == department).count();
			if (count != 0)
				System.out.println("Employee Count : " + count
						+ "\tDepartment : " + department.getDepartmentName());
			else
				System.out.println("Department "
						+ department.getDepartmentName() + " has no employees");
		}
	}

	void getSeniorEmployee() {
		LocalDate oldestDate = employees.stream().map(e -> e.getHireDate())
				.sorted().findFirst().get();
		Employee emp = employees.stream()
				.filter(e -> e.getHireDate().equals(oldestDate)).findFirst()
				.get();
		System.out.println("Senior Most Employee is " + emp.getFirstName()
				+ " " + emp.getLastName());
	}

	void getEmployeesDuration() {
		Consumer<Employee> consumer = (Employee e) -> {
			long monthDiff = ChronoUnit.MONTHS.between(e.getHireDate(),
					LocalDate.now());
			long dayDiff = ChronoUnit.DAYS.between(e.getHireDate(),
					LocalDate.now());

			System.out.println("Months " + monthDiff + "\tDays " + dayDiff
					+ "\tName : " + e.getFirstName() + " " + e.getLastName());
		};

		employees.stream().parallel().forEach(consumer);
	}

	void empDetails() {
		Consumer<Employee> consumer = (Employee e) -> System.out
				.println("Name : " + e.getFirstName() + " " + e.getLastName()
						+ "\tHire Date : " + e.getHireDate() + "\tDOW : "
						+ DayOfWeek.from(e.getHireDate()));

		employees.stream().parallel().forEach(consumer);
	}

	void getFridayEmp() {
		Consumer<Employee> consumer = (Employee e) -> System.out
				.println("Name : " + e.getFirstName() + " " + e.getLastName());
		employees
				.stream()
				.parallel()
				.filter(e -> DayOfWeek.from(e.getHireDate()).equals(
						DayOfWeek.FRIDAY)).forEach(consumer);
	}

	void highestEmp() {
		Map<Department, Integer> map = new HashMap();
		for (Department department : departments) {
			int count = (int) employees.stream()
					.filter(x -> x.getDepartment() == department).count();
			map.put(department, count);
		}
		// find to print this in easy way ?
		map.entrySet().stream()
				.max((x, y) -> x.getValue() > y.getValue() ? 1 : -1).get();
	}

	void salaryIncrease() {
		Consumer<Employee> consumer = (Employee e) -> {

			double inc = e.getSalary() + e.getSalary() * 0.15;
			System.out.println("Name : " + e.getFirstName() + " "
					+ e.getLastName() + "\tSalary : Rs." + e.getSalary()
					+ "\tRise : Rs." + inc);
		};
		
		employees.stream().parallel().forEach(consumer);
	}
	
	void empNoManager()
	{
		employees.stream().parallel().filter(x->x.getManagerId()==null).forEach(System.out::println);
	}
	
	void empSort(String type)
	{
		switch (type) {
		case "empid":
			employees.stream().sorted((x,y)->x.getEmployeeId()>y.getEmployeeId()?1:-1).forEach(System.out::println);			
			break;

		case "deptid":
			employees.stream().sorted((x,y)->x.getDepartment().getDepartmentId()>y.getDepartment().getDepartmentId()?1:-1).forEach(System.out::println);
			break;
			
		case "fn":
			employees.stream().sorted((x,y)->x.getFirstName().compareTo(y.getFirstName())).forEach(System.out::println);
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
		
	}

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		// employeeService.calculateSalary();
		// employeeService.listEmployees();
		// employeeService.getSeniorEmployee();
		// employeeService.getEmployeesDuration();
		// employeeService.empDetails();
		// employeeService.getFridayEmp();
		// employeeService.highestEmp();
		// employeeService.salaryIncrease();
		// employeeService.empNoManager();
		
		//employeeService.empSort("empid");
		employeeService.empSort("deptid");
		//employeeService.empSort("fn");
	}
}
