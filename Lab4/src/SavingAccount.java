public class SavingAccount extends Account{

	private double interest;	 // 이자액     0.5
	private int month = 0;
	private int year = 1;
	public SavingAccount(double balance, double interest) {
		super(balance); // 부모에 있는것들을 전부 상속받아야됨		
		this.interest = interest; // 이자
	};
		
	@Override
	public void debit(double amount){
		
		if(month < 12)
		{
			System.out.println("아직 출금 할 수 없습니다.");
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