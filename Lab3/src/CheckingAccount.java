class CheckingAccount extends Account{

	private double creditLimit; // 한도액 
	private double interest;	 // 이자액     0.1
	private double loanInterest;// 대출이자  0.7
	
	public CheckingAccount(double balance, double credit_limit, double interest, double loan_interest) {
		super(balance); // 부모에 있는것들을 전부 상속받아야됨
		
		this.creditLimit = credit_limit; // 한도액
		this.interest = interest; // 이자
		this.loanInterest = loan_interest; // 마이너스 통장 이자
	};
	
	public void nextMonth(){
		if(getBalance() > 0) {
			setBalance( getBalance() * ( 1 + interest) ); // 한도금액이 0 보다 크면 0.1 이자 
		}
		else
		{
			setBalance( getBalance() * ( 1 + loanInterest) ); // 한도금액이 마이너스이면 0.7 이자
		}
	}
	
	
	@Override
	public String debit(double amount){
		if(creditLimit>getBalance()-amount)
		{
			return "Debit amount exceeded account balance";
		}
		else if ( (getBalance()-amount < 0) && ( creditLimit> (getBalance()-amount) ) )
		{
			return "Account' Balance < 0 ";
		}
		else
		{
		setBalance(getBalance()-amount);
		return null;
		}		
	}

}