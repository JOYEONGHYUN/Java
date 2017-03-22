
class CheckingAccount extends Account{

	private double credit_limit; // 한도액 
	private double interest;	 // 이자액     0.1
	private double loan_interest;// 대출이자  0.7
	
	public CheckingAccount(double balance, String name, double credit_limit, double interest, double loan_interest) {
		super(balance, name); // 부모에 있는것들을 전부 상속받아야됨
		
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
		setBalance(balance);
		
	};
	
	public void nextMonth()
	{
		if(getBalance()>0)
		{
			setBalance(getBalance()+getBalance()*interest);
		}
		else
		{
			setBalance(getBalance()+getBalance()*loan_interest);
		}
	}
	
	
	@Override
	public void debit(double balance)
	{
		setBalance(getBalance()-balance);
	}
	
	
	
}