package lesson4Hmw;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sorted("ace","bdf"));
		System.out.println(sorted("des","bh"));
		
	}
	
	public static String sorted(String str, String str1){
		
		if(str.length()==0&&str1.length()>0) 
			return str1;
		if(str.length()>0&&str1.length()==0) 
			return str;
		if(str.charAt(0)>=str1.charAt(0))
			return str1.substring(0,1) + sorted(str,str1.substring(1));
		else if(str.charAt(0)<=str1.charAt(0))
			return str.substring(0,1) + sorted(str.substring(1),str1);
		return null;
	}

}
