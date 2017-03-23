
class CheckingAccount extends Account{

	private double credit_limit; // �ѵ��� 
	private double interest;	 // ���ھ�     0.1
	private double loan_interest;// ��������  0.7
	
	public CheckingAccount(double balance, double credit_limit, double interest, double loan_interest) {
		super(balance); // �θ� �ִ°͵��� ���� ��ӹ޾ƾߵ�
		
		this.credit_limit = credit_limit; // �ѵ���
		this.interest = interest; // ����
		this.loan_interest = loan_interest; // ���̳ʽ� ���� ����
		setBalance(balance);		
	};
	
	public void nextMonth()
	{
		if(getBalance()>0)
		{
			setBalance( getBalance() + getBalance()*interest); // �ѵ��ݾ��� 0 ���� ũ�� 0.1 ���� 
		}
		else
		{
			setBalance( getBalance() + (getBalance()*loan_interest) ); // �ѵ��ݾ��� ���̳ʽ��̸� 0.7 ����
		}
	}
	
	
	@Override
	public String debit(double balance)
	{
		if(credit_limit>getBalance()-balance)
		{
			return "Debit amount exceeded account balance";
		}
		else if ( (getBalance()-balance < 0) && ( credit_limit> (getBalance()-balance) ) )
		{
			return "Account' Balance < 0 ";
		}
		else
		{
		setBalance(getBalance()-balance);
		return null;
		}		
	}

}