package javaTask06;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void raiseSalary(double percent) {
		if (percent > 0) {
			double raiseAmount = salary * (percent / 100);
			salary += raiseAmount;
			System.out.println("Salary raised by " + percent + "%, new salary: " + salary);
		} else {
			System.out.println("Percentage should be positive to raise the salary.");
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void displayEmployeeDetails() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
	}

	public static void main(String[] args) {

		Employee employee1 = new Employee(101, "James Bond", 50000.0);
		System.out.println("Employee details before salary raise:");
		employee1.displayEmployeeDetails();

		employee1.raiseSalary(10);

		System.out.println("\nEmployee details after salary raise:");
		employee1.displayEmployeeDetails();
	}


}
