import java.util.Scanner;

public class AccountTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st Account Money : ");
		double money1 = input.nextDouble();
		System.out.print("Enter 2st Account Money : ");
		double money2 = input.nextDouble();
		String ac1 = "account1";
		String ac2 = "account2";
		double debit1;
		double debit2;
		
		Account account1 = new Account(money1, ac1);  // ������ ����
		Account account2 = new Account(money2, ac2);  // ������ ����
		
		account1.balance(); // ���� ���� Ȯ��
		account2.balance(); // ���� ���� Ȯ��
		
		System.out.print("Enter withdrawal amount for account1 : ");
		
		debit1 = input.nextDouble(); // ���� ��
		account1.debit(debit1);
		
		account1.balance(); // ���� ���� Ȯ��
		account2.balance(); // ���� ���� Ȯ��
		
		System.out.print("Enter withdrawal amount for account2 : ");
		debit2 = input.nextDouble(); // ���� ��
		account2.debit(debit2);
		
		account1.balance();
		account2.balance();
		
	}
}
