public class Account {

	private double balance; // ���°� ������ �ִ� ��
	public final String name; // �ѹ� ���س����� ���� �ٲ� �� ����
	
	public void credit(double balance) // ���¿� ���� ���� 
	{
		this.balance = this.balance + balance;
	}
	
	public void debit(double balance) // ���·κ��� ���� ��
	{		
		this.balance = this.balance - balance;
		if(balance<0)
		{
			System.out.printf("%s is Empty \n",name);
		}
		else
		System.out.printf("subtracting %.2f from %s\n",balance,name);
			
	}
	
	public double getBalance() // ������ ���� �ܾ��� �˷���
	{
		return balance;
	}
	
	protected void setBalance(double balance) // ������ �ܾ��� �����Ѵ�
	{
		this.balance = balance;
	}
	
	public Account(double balance, String name) // �ʱ� �ݾ��� �־��ִ� ������
	{
		this.balance = balance;
		this.name = name;
	}

}
