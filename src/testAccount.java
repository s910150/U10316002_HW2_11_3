
public class testAccount {
	public static void main(String[] args){
		
		//new objects (account,checking account,savings account)
		account myAccount = new account(1122,20000);
		checkingAccounts myCheckingAccount = new checkingAccounts(1002,5000,600);
		savingsAccounts mySavingsAccount = new savingsAccounts(1003,4000);
		
		//set the value of annual interest rate
		myAccount.setAnnualInterestRate(4.5);
		myCheckingAccount.setAnnualInterestRate(4.5);
		mySavingsAccount.setAnnualInterestRate(4.5);
		
		//print results
		System.out.print(myAccount.toString()+"\n\n"+
		myCheckingAccount.toString()+"\n\n"+
		mySavingsAccount.toString());
		
		
	}
}
