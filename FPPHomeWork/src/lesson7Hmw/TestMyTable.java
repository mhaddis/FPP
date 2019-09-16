package lesson7Hmw;

public class TestMyTable {
	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('b', "Beza");
		t.add('m', "Merry");
		t.add('h', "Hiwi");
		System.out.println(t);
		System.out.println(t.get('h'));
	}
}
