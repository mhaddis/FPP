package lesson5Prb5;

public class TestComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Computer c1= new Computer("HP","Intel",4,2.40);
			Computer c2= new Computer("HP","Intel",4,2.40);
			Computer c3= new Computer("Dell","AMD",8,4.0);
			System.out.println(c1.equals(c2));
			System.out.println(c1.equals(c3));
			System.out.println(c1.hashCode());
			System.out.println(c2.hashCode());
			System.out.println(c3.hashCode());
		}
	}


