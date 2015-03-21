import java.util.Date;



public class account {
	
	//declare variables
	private int id ;
	private double balance ;
	private double annualInterestRate ;
	private Date dateCreated;

	//no-arg constructor
	account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	//constructor
	account(int newId,double newBalance){
	
		id = newId;
		balance =newBalance ;
		dateCreated = new Date();
	
	}

	//accessor id
	public int getId() {
		return id;
	}

	//mutator id
	public void setId(int id) {
		this.id = id;
	}

	//accessor balance
	public double getBalance() {
		return balance;
	}

	//mutator balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	//accessor annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	//mutator annualInterestRate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//accessor dateCreated
	public Date getDateCreated(){
		
		return dateCreated;
		
	}
	
	//method for monthly interest rate
	public double getMonthlyInterestRate(){
		
		return annualInterestRate/12;
	}
	
	//method for monthly interest
	public double getMonthlyInterest(){
		
		double monthlyInterestRate = annualInterestRate/12/100;
		
		return balance*monthlyInterestRate;
		
		
	}
	
	//method for deposit
	public double deposit(double moneyIn){
		
		balance = balance + moneyIn;
		
		return balance;
		
	}
	
	//method to withdraw
	public void withdraw(double moneyOut) {
		
		balance = balance - moneyOut;
		
		System.out.print( balance);
	}
	
	//method to print the informations (id ,balance monthly ,date)
	@Override
	public String toString(){
		
		return ("The account's ID is " + getId() + "\nThe balance is "+ getBalance() + "\nThe monthly interest is " + getMonthlyInterest() + "\nThe date is " + getDateCreated() );
		
		
	}

}
