package lesson11HmwPrb1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> hm=new HashMap<>();
		
		for(int i=0; i<students.size();i++) {
			
			hm.put(new Key(students.get(i).getFirstName(),students.get(i).getLastName()),students.get(i));
		}
		return hm;
	}
}
