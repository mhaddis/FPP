package lesson4Hmw;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPal("madam"));
		System.out.println(isPal("car"));
		System.out.println(isPal("refer"));
		}
	public static boolean isPal(String str){
		if(str.length()<=1)
			return true;
		if(str.charAt(0)!=str.charAt(str.length()-1))
			return false;
		return isPal(str.substring(1,str.length()-1));
	}

}
