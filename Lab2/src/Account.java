public class Account {

	private double balance;
	
	public void credit(double balance) // 계좌에 돈을 넣음 
	{
		this.balance = this.balance + balance;
	}
	
	public String debit(double balance) // 계좌로부터 돈을 뺌
	{		
		if(this.balance - balance<0)
		{
			System.out.print("subtracting "+balance+" from " );
			return "Debit amount exceeded account balance";
		}
		else
		{
			this.balance = this.balance - balance;
			System.out.print("subtracting "+balance+" from " );
			return null;
		}
	}
	
	public double balance() // 계좌의 남은 잔액을 알려줌
	{
			//System.out.printf("%.2lf",balance); // 왜 안될까?
			return balance;
	}
	
	public Account(double balance) // 초기 금액을 넣어주는 생성자
	{
		this.balance = balance;
	}

}