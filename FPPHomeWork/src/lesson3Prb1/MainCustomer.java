package lesson3Prb1;

public class MainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] cust= new Customer[3];
		Address[] add=new Address[6];
		
		cust[0]= new Customer("Hiwot", "Bishaw","0011");
		cust[1]= new Customer("Beza", "Demisse", "0022");
		cust[2]= new Customer ("Blen", "Mekuria","0033");
		
		add [0]= new Address ("4th st", "Detroit", "Michigan", "D1001");
		add [1]= new Address ("4th st", "Detroit", "Michigan", "D1001");
		add [2]= new Address ("5th st", "Chicago", "Illinois", "C2002");
		add [3]= new Address ("5th st", "Chicago", "Illinois", "C2002");
		add [4]= new Address ("6th st", "Hampton ", "Verginia", "H3003");
		add [5]= new Address ("6th st", "Hampton ", "Verginia", "H3003");
		
		cust[0].setBillingAddress(add[0]);
		cust[0].setShippingAddress(add[1]);
		cust[1].setBillingAddress(add[2]);
		cust[1].setShippingAddress(add[3]);
		cust[2].setBillingAddress(add[4]);
		cust[2].setShippingAddress(add[5]);
		
		for(Customer cs: cust){
			if((cs.getBillingAddress().getCity()).equals("Chicago"))
			System.out.println(cs);
			}
	
	}
}
