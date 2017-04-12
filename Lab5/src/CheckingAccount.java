public class CheckingAccount implements Valuable{

	private double balance;
	private double creditLimit; // �ѵ��� 
	private double interest;	 // ���ھ�     0.1
	private double loanInterest;// ��������  0.7
	private int mon;
	@Override
	public double EstimateValue(int month) {
		// TODO Auto-generated method stub
		
		mon = month;
		passTime(mon);
		return balance;
	}
	
	@Override
	public String toString() {
		
		return "CheckingAccount_Balance:" + balance;
	}

	
	
	public CheckingAccount(double balance, double credit_limit, double interest, double loan_interest) {
	
		this.balance = balance;
		this.creditLimit = credit_limit; // �ѵ���
		this.interest = interest; // ����
		this.loanInterest = loan_interest; // ���̳ʽ� ���� ����
	};
	
	public void debit(double amount) throws Exception{

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
	
	
	public String isBankrupt()
	{
		if(getBalance()+creditLimit<0)
		{
		return "went Bankrupt";
		}
		else return null;
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

	
	public void passTime(int month_period) {
		// TODO Auto-generated method stub
		if(getBalance() > 0) {
			setBalance( getBalance()*Math.pow((1+interest),month_period)); // �ѵ��ݾ��� 0 ���� ũ�� 0.1 ���� 
		}
		else
		{
			setBalance( getBalance()*Math.pow((1+loanInterest),month_period)); // �ѵ��ݾ��� ���̳ʽ��̸� 0.7 ����
		}
		
	}

}