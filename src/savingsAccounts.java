
public class savingsAccounts extends account{

	//no-arg constructor
	savingsAccounts() {
	
	}
	
	//constructor
	savingsAccounts(int id ,double balance) {
		
		super(id,balance);
		
	}
	
	//method to withdraw money
	@Override
	public void withdraw(double moneyOut) {
	
		if(moneyOut<=super.getBalance()){
		
			super.withdraw(moneyOut);
	
		}else{
			
			System.out.println("Sorry ,you can't overdraw.");
			
		}
		
	}
	
	//method to print the informations
	@Override
	public String toString(){
			
			return ("This is a saving account.\n" + super.toString());
			
			
			
		}
	
	
	
	
	
	
}
