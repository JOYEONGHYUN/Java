public class Account {

	private double balance;
	
	public void credit(double balance) // ���¿� ���� ���� 
	{
		this.balance = this.balance + balance;
	}
	
	public String debit(double balance) // ���·κ��� ���� ��
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
	
	public double balance() // ������ ���� �ܾ��� �˷���
	{
			//System.out.printf("%.2lf",balance); // �� �ȵɱ�?
			return balance;
	}
	
	public Account(double balance) // �ʱ� �ݾ��� �־��ִ� ������
	{
		this.balance = balance;
	}

}