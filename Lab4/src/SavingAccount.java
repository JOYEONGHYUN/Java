public class SavingAccount extends Account{

	private double interest;	 // ���ھ�     0.5
	private int month = 0;
	private int year = 1;
	public SavingAccount(double balance, double interest) {
		super(balance); // �θ� �ִ°͵��� ���� ��ӹ޾ƾߵ�		
		this.interest = interest; // ����
	};
		
	@Override
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

	
	
	@Override
	public double getWithdrawableAccount() {
		// TODO Auto-generated method stub
		if(month < 12)
		{
		 return 0;
		}
		else
		return getBalance();
	}

	@Override
	public void passTime(int month_period) {
		// TODO Auto-generated method stub
		{
			month = month + month_period;
			if(month >= 12*year)
			{
				year = year + 1;
			setBalance( getBalance() * Math.pow((1+interest),12) ); 
			}
		}
	}

}