package lesson4Hmw;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {7,6,9,8,6,12,52};
		int stPos= 0;
		int endPos= 7;
		
		System.out.println(bnrySearch(a,2,stPos,endPos));
		System.out.println(bnrySearch(a,52,stPos,endPos));
		System.out.println(bnrySearch(a,6,stPos,endPos));
		System.out.println(bnrySearch(a,7,stPos,endPos));
		System.out.println(bnrySearch(a,34,stPos,endPos));
		}
	public static int bnrySearch(int[] a, int target, int stPos, int endPos){
		int mid= (stPos+endPos)/2;
		if(a[mid]==target)
			return mid;
		if(endPos==mid||mid==stPos) 
			return-1;
		if(a[mid]>target)
			return bnrySearch(a,target,stPos,mid);
		else
			return bnrySearch(a,target,mid,endPos);
	}

}
