public class SavingAccount implements Valuable{

	private double balance;
	private double interest;	 // ���ھ�     0.5
	private int month = 0;
	private int year = 1;
	public SavingAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest; // ����
	};
		
	@Override
	public double EstimateValue(int month) {
		// TODO Auto-generated method stub
		passTime(month);
		return balance;
	}

	@Override
	public String toString() {
		return "SavingAccount_Balance:" + balance;
	}

	
	public void debit(double amount){
		
		if(month < 12)
		{
			System.out.println("���� ��� �� �� �����ϴ�.");
		}
		else
		{
		setBalance(getBalance()-amount);
		}
	}
	
	public void setBalance(double amount)
	{
		balance = amount;
	}
	
	public double getBalance()
	{
		return balance;
	}

	
	public double getWithdrawableAccount() {
		// TODO Auto-generated method stub
		if(month < 12)
		{
		 return 0;
		}
		else
		return getBalance();
	}

	public void passTime(int month_period) {
		// TODO Auto-generated method stub
		{
			month = month + month_period;
			setBalance( getBalance() * Math.pow((1+interest),12) ); 
		}
	}

}