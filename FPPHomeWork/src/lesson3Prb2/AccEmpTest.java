package lesson3Prb2;

public class AccEmpTest {

	public static void main(String[] args) {

				// TODO Auto-generated method stub
				
				Employee employee = new Employee("Hiwot", "Hiwi", 25788, 2021, 9, 7);
				
				Account checkingAcc = new Account(employee, "CHECKING", 500);
				
				Account savingingAcc = new Account(employee, "SAVINGS", 500);
				
				Account retirementAcc = new Account(employee, "RETIREMENT", 500);
				
				checkingAcc.makeDeposit(5000);
				savingingAcc.makeDeposit(10);
				retirementAcc.makeDeposit(500);
				
				checkingAcc.makeWithdrawal(300);
				savingingAcc.makeWithdrawal(300);
				retirementAcc.makeWithdrawal(500);
				
				System.out.println(checkingAcc.toString());
				System.out.println(savingingAcc.toString());
				System.out.println(retirementAcc.toString());
				

			}

		}

