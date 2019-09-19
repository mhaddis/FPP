package lesson8Hmw2;

import java.util.Comparator;

public class SalesAmountComparator implements Comparator<Marketing> {
	@Override
	public int compare(Marketing o1, Marketing o2) {
		Double d1 = (double) o1.getSalesamount();
		Double d2 = (double) o2.getSalesamount();
		String e1 = o1.getEmployeename();
		String e2 = o2.getEmployeename();
		String p1 = o1.getProductname();
		String p2 = o2.getProductname();
		if (d1.compareTo(d2) != 0)
			return d1.compareTo(d2);
		else if (e1.compareTo(e2) != 0)
			return e1.compareTo(e2);
		else
			return p1.compareTo(p2);
	}
}
