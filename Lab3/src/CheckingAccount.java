
class CheckingAccount extends Account{

	private double credit_limit; // �ѵ��� 
	private double interest;	 // ���ھ�     0.1
	private double loan_interest;// ��������  0.7
	
	public CheckingAccount(double balance, String name, double credit_limit, double interest, double loan_interest) {
		super(balance, name); // �θ� �ִ°͵��� ���� ��ӹ޾ƾߵ�
		
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