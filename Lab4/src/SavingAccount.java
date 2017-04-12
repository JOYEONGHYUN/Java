public class SavingAccount extends Account{

	private double interest;	 // 이자액     0.5
	private double creditLimit = 50; // 한도액 
	private int month = 0;
	private int year = 1;
	public SavingAccount(double balance, double interest) {
		super(balance); // 부모에 있는것들을 전부 상속받아야됨		
		this.interest = interest; // 이자
	};
		
	@Override
	public void debit(double amount)throws Exception1{
		if(amount < 0) {
			throw new Exception1("java.lang.Exception: 음수입력!");
		}
		else if(creditLimit < amount){
			throw new Exception1("java.lang.Exception: Debit amount exceeded account balance.");
		}
		// 예외 상황 발생시 인출은 이루어지지 않는다.
		
		else if(month < 12)
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