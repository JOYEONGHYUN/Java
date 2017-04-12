public class SavingAccount extends Account{

	private double interest;	 // ���ھ�     0.5
	private double creditLimit = 50; // �ѵ��� 
	private int month = 0;
	private int year = 1;
	public SavingAccount(double balance, double interest) {
		super(balance); // �θ� �ִ°͵��� ���� ��ӹ޾ƾߵ�		
		this.interest = interest; // ����
	};
		
	@Override
	public void debit(double amount)throws Exception1{
		if(amount < 0) {
			throw new Exception1("java.lang.Exception: �����Է�!");
		}
		else if(creditLimit < amount){
			throw new Exception1("java.lang.Exception: Debit amount exceeded account balance.");
		}
		// ���� ��Ȳ �߻��� ������ �̷������ �ʴ´�.
		
		else if(month < 12)
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