package lesson2Hmw;

public class Prog5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ran = new int[4][4];
		String st = "_____";
		for(int i=0; i<4;i++){
			for(int j=0; j<4;j++){
				ran[i][j]= RandomNumbers.getRandomInt(1, 99);
				if(i%2!=0)  {
					System.out.printf("%+10d",ran[i][j]);
				}
				else System.out.printf("%10d",ran[i][j]);
			}
			System.out.printf("%n");			
			if(i%2!=0){				
				System.out.printf("%11s%10s%10s%10s",st,st,st,st);
				System.out.printf("%n%n");
				
			}
		}
	}
}