class CheckingAccount extends Account{

	private double creditLimit; // �ѵ��� 
	private double interest;	 // ���ھ�     0.1
	private double loanInterest;// ��������  0.7
	
	public CheckingAccount(double balance, double credit_limit, double interest, double loan_interest) {
		super(balance); // �θ� �ִ°͵��� ���� ��ӹ޾ƾߵ�
		
		this.creditLimit = credit_limit; // �ѵ���
		this.interest = interest; // ����
		this.loanInterest = loan_interest; // ���̳ʽ� ���� ����
	};
	
	public void nextMonth(){
		if(getBalance() > 0) {
			setBalance( getBalance() * ( 1 + interest) ); // �ѵ��ݾ��� 0 ���� ũ�� 0.1 ���� 
		}
		else
		{
			setBalance( getBalance() * ( 1 + loanInterest) ); // �ѵ��ݾ��� ���̳ʽ��̸� 0.7 ����
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