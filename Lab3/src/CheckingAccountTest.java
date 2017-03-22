import java.util.Scanner;

public class CheckingAccountTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String ac1 = "account1";
		String ac2 = "account2";
		
		double debit2;
		double deposit1;
		
		CheckingAccount account1 = new CheckingAccount(100.0, ac1,-100,0.01,0.07);  // ������ ����
		CheckingAccount account2 = new CheckingAccount(100.0, ac2,-100,0.01,0.07);  // ������ ����
		
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // ���� ���� Ȯ��
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // ���� ���� Ȯ��
		 // ���� ���� Ȯ��
		System.out.print("Enter deposit amount for Account1 : ");
		deposit1 = input.nextDouble(); // ���� �� �ݾ� �Է�
		account1.credit(deposit1);
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // ���� ���� Ȯ��
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // ���� ���� Ȯ��
		System.out.print("Enter withdrawal amount for account2 : ");
		debit2 = input.nextDouble(); // ���� �� �ݾ� �Է�
		account2.debit(debit2);
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // ���� ���� Ȯ��
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // ���� ���� Ȯ��
		
		System.out.println("next month!");
		account1.nextMonth();
		account2.nextMonth();
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // ���� ���� Ȯ��
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // ���� ���� Ȯ��
		
	}
}
