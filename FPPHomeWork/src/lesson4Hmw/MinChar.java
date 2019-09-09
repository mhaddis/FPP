package lesson4Hmw;

public class MinChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinChar min= new MinChar();
		char cr= min.minChar("hgdyisebt");
		System.out.println(cr);
		}
	
	char minC= 'z';
	public char minChar(String str){
		if(str.length()==0)
			return minC;
	if(minC>str.charAt(0))minC= str.charAt(0);
	return minChar(str.substring(1));
	}

}
