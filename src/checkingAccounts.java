
public class checkingAccounts extends account{
	
	//declare limit to restriction the max
	double limit ;

	//no-arg constructor
	checkingAccounts() {
		
	}
	
	//constructor
	checkingAccounts(int id ,double balance ,double limit) {
		
		super(id,balance);
		
		this.limit = limit;
		
	}
	
	
	//method to withdraw money
	@Override
	public void withdraw(double moneyOut) {
		
		if(moneyOut<=(super.getBalance()+this.limit)){
			
			super.withdraw(moneyOut);
		}
		
		else {
			
			System.out.println("Sorry,you over the overdraft limit.");
			
		}
		
	}
	
	//method for printing informations
	@Override
	public String toString(){
		
		return ("This is a checking account.\n" + super.toString());
		
		
		
	}
	
}
