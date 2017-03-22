import java.util.Scanner;

public class Account {

	private double money;
	public final String name;
	
	public void credit(double saveMoney) // ���¿� ���� ���� 
	{
		money = money + saveMoney;
	}
	
	public void debit(double useMoney) // ���·κ��� ���� ��
	{		
		money = money - useMoney;
		if(money<0)
		{
			System.out.printf("%s is Empty \n",name);
		}
		else
		System.out.printf("subtracting %.2f from %s\n",money,name);
			
	}
	
	public void balance() // ������ ���� �ܾ��� �˷���
	{
		if(money<0)
		{
			System.out.printf("%s balance: $%.2f\n",name,0.00);
		}
		else
		System.out.printf("%s balance: $%.2f\n",name,money);
	}
	
	public Account(double money, String name) // �ʱ� �ݾ��� �־��ִ� ������
	{
		this.money = money;
		this.name = name;
	}

}
