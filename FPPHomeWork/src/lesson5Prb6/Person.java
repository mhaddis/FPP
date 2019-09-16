package lesson5Prb6;

import lesson5Prb5.Computer;

public class Person implements Cloneable {

	String name;
	Computer computer;

	public Person(String name, Computer computer) {
		this.name = name;
		this.computer = computer;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		return person;
	}

	@Override
	public String toString() {
		return String.format("Name = %s \nComputer\n%S", name, computer);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Computer computer = new Computer("Microsoft", "	Inter(R) Core(TM) i7", 16, 1.80);
		Person hiwi = new Person("Hiwot", computer);

		System.out.println("Before Cloning");
		System.out.println(hiwi);

		Person beza = (Person) hiwi.clone();
		System.out.println();
		System.out.println("After Cloning");
		System.out.println(beza);

		hiwi.computer.setRamSize(4);
		System.out.println();
		System.out.println("After Modifing the Ram Size.");
		System.out.println(beza);

	}

}