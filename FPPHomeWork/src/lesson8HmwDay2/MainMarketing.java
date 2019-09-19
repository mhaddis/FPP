package lesson8Hmw2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainMarketing {

	public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		List<Marketing> l = new ArrayList();
		for (Marketing m : list) {
			if (m.getSalesamount() >= 1000) {
				l.add(m);
			}
		}
		return l;
	}

	public static void main(String[] args) {
		ArrayList<Marketing> list = new ArrayList();
		list.add(new Marketing("Merry", "Dress", 50));
		list.add(new Marketing("Hiwi", "Laptop", 100));
		list.add(new Marketing("Beza", "Mobile", 1000));
		list.add(new Marketing("Blen", "Pizza", 8));

		System.out.println("Marketing List");
		System.out.println(list);
		list.remove(list.get(1));
		System.out.println("After remove");
		System.out.println(list);
		System.out.println("Size : " + list.size());
		System.out.println("Order by Sales Amount");
		Collections.sort(list, new SalesAmountComparator());
		System.out.println(list);
		System.out.println("Sorted list by Name and listMoreThan1000 ");
		List<Marketing> sl = listMoreThan1000(list);
		Collections.sort(sl, new NameComparator());
		System.out.println(sl);
	}
}
