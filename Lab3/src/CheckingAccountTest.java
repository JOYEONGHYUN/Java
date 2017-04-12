import java.util.Scanner;

public class CheckingAccountTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double debit;
		double deposit;
		String err;
		
		CheckingAccount account1 = new CheckingAccount(100.0,-100,0.01,0.07);  // ������ ����
		CheckingAccount account2 = new CheckingAccount(100.0,-100,0.01,0.07);  // ������ ����
		
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // ���� ���� Ȯ��
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // ���� ���� Ȯ��
		 // ���� ���� Ȯ��
		System.out.print("Enter deposit amount for Account1 : ");
		deposit = input.nextDouble(); // ���� �� �ݾ� �Է�
		account1.credit(deposit);
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // ���� ���� Ȯ��
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // ���� ���� Ȯ��
		System.out.print("Enter withdrawal amount for account2 : ");
		debit = input.nextDouble(); // ���� �� �ݾ� �Է�
		err=account2.debit(debit);
		if(err!=null)
		{
			System.out.println(err); // �ѵ��ʰ�
		}
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // ���� ���� Ȯ��
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // ���� ���� Ȯ��
		
		System.out.println("next month!");
		account1.nextMonth();
		account2.nextMonth();
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // ���� ���� Ȯ��
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // ���� ���� Ȯ��
		
		input.close(); // ������ �÷��Ͱ� �����鼭�� �̰��� ����ϴ� ������ ���α׷��� ���������� �۵��ϴ� ���߿� ����ؼ� ���������� ��������� �����µ�, �̶� �� ������ ���𰡰� �ٸ� ���μ����� ���� �� ���ֱ� ������ �̸� �̸� �ݾ��༭ �׷� �浹�� ������Ų��.
	}
}
