package lesson2Hmw;

import java.util.Arrays;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = {"horse", "dog", "cat", "horse","dog"};
		int dup =0;
		for(int i=0; i<list.length;i++){
			for(int j=i+1; j<list.length;j++){
				if(list[i]==list[j]) {
					dup++;
					break;
				}
			}
		}
		
		String[] newList = new String[list.length-dup];
		int k=0;
		for(int i=0; i<list.length;i++){
			dup=0;
			
			for(int j=i+1; j<list.length;j++){
				if(list[i]==list[j]) dup++;
			}
			if(dup==0) {
				newList[k]=list[i];
				k++;
			}
			
		}
		System.out.println(Arrays.toString(newList));
	}

}