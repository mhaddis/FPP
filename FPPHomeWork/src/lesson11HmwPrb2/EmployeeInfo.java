package lesson11HmwPrb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeInfo {

	/**
	 * Removes from a copy of the input list all duplicate Employees, and then
	 * returns this list.
	 * 
	 * An Employee instance is considered to be a duplicate of another Employee
	 * instance if the two instances have the same name and salary.
	 */
	public static List<Employee> removeDuplicates(List<Employee> employees) {

		HashMap<Employee, String> mp = new HashMap<>();
		List<Employee> lists = new ArrayList<Employee>();
		mp.put(employees.get(0), employees.get(0).getName());
		lists.add(employees.get(0));
		for (int i = 1; i < employees.size(); i++) {
			if (!mp.containsKey(employees.get(i))) {
				mp.put(employees.get(i), employees.get(i).getName());
				lists.add(employees.get(i));
			}
		}
		return lists;
	}

	// DO NOT MODIFY
	/**
	 * Use the main method to test your solution
	 */
	public static void main(String[] args) {
		List<Employee> myDupsRemoved = removeDuplicates(TestData.originalList);
		boolean dupsCorrectlyRemoved = Util.listsAreEqual(TestData.dupsRemoved, myDupsRemoved);
		System.out.println("Is answer correct? " + dupsCorrectlyRemoved);
	}

}