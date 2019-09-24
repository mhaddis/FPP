package lesson11HmwPrb2;

import java.util.Objects;

/** NOTE: You must override equals in this class */
public class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}

	@Override

	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (ob.getClass() != this.getClass())
			return false;
		Employee emp = (Employee) ob;
		if (emp.getName().equalsIgnoreCase(this.getName()) && emp.getSalary() == this.getSalary())
			return true;
		return false;

	}

	@Override

	public int hashCode() {
		return Objects.hash(name, salary);
	}

}
