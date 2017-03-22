import java.util.Scanner;

public class Account {

	private double money;
	public final String name;
	
	public void credit(double saveMoney) // 계좌에 돈을 넣음 
	{
		money = money + saveMoney;
	}
	
	public void debit(double useMoney) // 계좌로부터 돈을 뺌
	{		
		money = money - useMoney;
		if(money<0)
		{
			System.out.printf("%s is Empty \n",name);
		}
		else
		System.out.printf("subtracting %.2f from %s\n",money,name);
			
	}
	
	public void balance() // 계좌의 남은 잔액을 알려줌
	{
		if(money<0)
		{
			System.out.printf("%s balance: $%.2f\n",name,0.00);
		}
		else
		System.out.printf("%s balance: $%.2f\n",name,money);
	}
	
	public Account(double money, String name) // 초기 금액을 넣어주는 생성자
	{
		this.money = money;
		this.name = name;
	}

}
