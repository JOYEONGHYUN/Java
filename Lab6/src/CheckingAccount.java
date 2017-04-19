public class CheckingAccount implements Valuable , Account{

	private double balance;
	private double creditLimit; // 한도액 
	private double interest;	 // 이자액     0.1
	private double loanInterest;// 대출이자  0.7
	private int mon;
	
	@Override
	public double estimateValue(int month) {
		// TODO Auto-generated method stub
		
		mon = month;
		passTime(mon);
		return balance;
	}
	
	@Override
	public double estimateValue() {
		// TODO Auto-generated method stub
		
		passTime(1);
		return balance;
	}
	
	@Override
	public String toString() {
		
		return "CheckingAccount_Balance:" + balance;
	}

	
	public CheckingAccount(double balance, double credit_limit, double interest, double loan_interest) {
	
		this.balance = balance;
		this.creditLimit = credit_limit; // 한도액
		this.interest = interest; // 이자
		this.loanInterest = loan_interest; // 마이너스 통장 이자
	};
	
	public void debit(double amount) throws Exception1{

		setBalance(balance-amount);
	}
	
	public void setBalance(double amount)
	{
		balance = amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	
	public Boolean isBankrupted()
	{
		if(getBalance()+creditLimit<0)
		{
		return true;
		}
		else return false;
	}

	
	public double getWithdrawableAccount() {
		// TODO Auto-generated method stub
		if(getBalance()+creditLimit<0)
		{
			return 0;
		}
		else
		return getBalance()+creditLimit;
	}

	@Override
	public void passTime(int month_period) {
		// TODO Auto-generated method stub
		if(getBalance() > 0) {
			setBalance( getBalance()*Math.pow((1+interest),month_period)); // 한도금액이 0 보다 크면 0.1 이자 
		}
		else
		{
			setBalance( getBalance()*Math.pow((1+loanInterest),month_period)); // 한도금액이 마이너스이면 0.7 이자
		}
	}
		
	@Override
	public void credit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void passTime() {
		// TODO Auto-generated method stub
		if(getBalance() > 0) {
			setBalance( getBalance()*Math.pow((1+interest),1)); // 한도금액이 0 보다 크면 0.1 이자 
		}
		else
		{
			setBalance( getBalance()*Math.pow((1+loanInterest),1)); // 한도금액이 마이너스이면 0.7 이자
		}	
	}

}