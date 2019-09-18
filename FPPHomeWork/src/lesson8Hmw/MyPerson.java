package lesson8Hmw;


public class MyPerson {
	private final int initialLn= 10;
	private Person[] personArr;
	private int size;
	
	MyPerson(){
		personArr= new Person[initialLn];
		size= 0;
		}
	public void add(Person p){
		if(size== personArr.length) 
			resize();
		personArr[size++] = p;
	}
	public Person get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return personArr[i];
	}

	// Using lastname
	
	public boolean find(String lastName) {
		for (Person test : personArr) {
			if (test != null) {
				if (test.getLast().equals(lastName))
					return true;
			}
		}
		return false;
	}

	public void insert(Person s, int pos) {
		if (pos > size)
			return;
		if (pos >= personArr.length || size + 1 > personArr.length) {
			resize();
		}
		Person[] temp = new Person[personArr.length + 1];
		System.arraycopy(personArr, 0, temp, 0, pos);
		temp[pos] = s;
		System.arraycopy(personArr, pos, temp, pos + 1, personArr.length - pos);
		personArr = temp;
		size++;
	}
  // Remove using lastname
	public boolean remove(String lastName) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (personArr[i].getLast().equals(lastName)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		Person[] temp = new Person[personArr.length];
		System.arraycopy(personArr, 0, temp, 0, index);
		System.arraycopy(personArr, index + 1, temp, index, personArr.length - (index + 1));
		personArr = temp;
		size--;
		return true;
	}

	private void resize() {
		System.out.println("Resizing");
		int len = personArr.length;
		int newlen = 2 * len;
		Person[] temp = new Person[newlen];
		System.arraycopy(personArr, 0, temp, 0, len);
		personArr = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; i++) {
			sb.append(personArr[i] + ", \n");
		}
		sb.append(personArr[size - 1] + "]");
		return sb.toString();
	}

	public int size() {
		return size;
	}
	public static void main(String[] args) {
		MyPerson l = new MyPerson();
		l.add(new Person("Meron", "Tesfay", 26));
		l.add(new Person("Hiwot", "Bishaw", 25));
		l.add(new Person("Beza	", "Demisse", 24));
		
		System.out.println("The list of size "+l.size()+" is \n"+l );
		l.remove("Hiwot");
		System.out.println("\nThe list of size "+l.size()+" is \n"+l);
		l.insert(new Person("Blen","Mekuria",25),0);
		System.out.println("\nThe list of size "+l.size()+" after inserting Blen into pos 0 is\n "+l);
	}
}
