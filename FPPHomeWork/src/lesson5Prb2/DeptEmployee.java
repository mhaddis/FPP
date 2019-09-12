package lesson5Prb2;

import java.time.LocalDate;

public class DeptEmployee {

    private String name;
    private double salary;
    private LocalDate hireDate;
     
    public DeptEmployee(String name, double salary,  int aYear, int aMonth, int aDay){
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(aYear,aMonth,aDay);
;
    }
  
    public double computeSalary() {
        return salary;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

}
