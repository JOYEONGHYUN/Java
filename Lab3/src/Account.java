public class Account {

	private double balance; // 계좌가 가지고 있는 금
	public final String name; // 한번 정해놓으면 절대 바꿀 수 없음
	
	public void credit(double balance) // 계좌에 돈을 넣음 
	{
		this.balance = this.balance + balance;
	}
	
	public void debit(double balance) // 계좌로부터 돈을 뺌
	{		
		this.balance = this.balance - balance;
		if(balance<0)
		{
			System.out.printf("%s is Empty \n",name);
		}
		else
		System.out.printf("subtracting %.2f from %s\n",balance,name);
			
	}
	
	public double getBalance() // 계좌의 남은 잔액을 알려줌
	{
		return balance;
	}
	
	protected void setBalance(double balance) // 계좌의 잔액을 수정한다
	{
		this.balance = balance;
	}
	
	public Account(double balance, String name) // 초기 금액을 넣어주는 생성자
	{
		this.balance = balance;
		this.name = name;
	}

}
