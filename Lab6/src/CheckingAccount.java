public class CheckingAccount implements Valuable , Account{

	private double balance;
	private double creditLimit; // �ѵ��� 
	private double interest;	 // ���ھ�     0.1
	private double loanInterest;// ��������  0.7
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
		this.creditLimit = credit_limit; // �ѵ���
		this.interest = interest; // ����
		this.loanInterest = loan_interest; // ���̳ʽ� ���� ����
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
			setBalance( getBalance()*Math.pow((1+interest),month_period)); // �ѵ��ݾ��� 0 ���� ũ�� 0.1 ���� 
		}
		else
		{
			setBalance( getBalance()*Math.pow((1+loanInterest),month_period)); // �ѵ��ݾ��� ���̳ʽ��̸� 0.7 ����
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
			setBalance( getBalance()*Math.pow((1+interest),1)); // �ѵ��ݾ��� 0 ���� ũ�� 0.1 ���� 
		}
		else
		{
			setBalance( getBalance()*Math.pow((1+loanInterest),1)); // �ѵ��ݾ��� ���̳ʽ��̸� 0.7 ����
		}	
	}

}