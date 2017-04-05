import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingAccount(100.0,0.05); 
		Scanner scan = new Scanner(System.in);
		
		double amount;
		
		System.out.printf("Account1 balance %.2f \t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount()); // ���� ���� Ȯ��
		System.out.printf("Enter withdrawal amount for Account1: ");
		amount = scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance %.2f \t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
		
		if(((CheckingAccount)account1).isBankrupt()!=null)
		{
			System.out.println("account1 "+((CheckingAccount)account1).isBankrupt());	
		}
		// �Ļ꿩�� Ȯ��
		
		account1.passTime(1);
		System.out.printf("Account1 balance %.2f \t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
		
		if(((CheckingAccount)account1).isBankrupt()!=null)
		{
			System.out.println("account1 "+((CheckingAccount)account1).isBankrupt());	
		}
		// �Ļ꿩�� Ȯ��
		account1.passTime(5);
		System.out.printf("Account1 balance %.2f \t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
		
		if(((CheckingAccount)account1).isBankrupt()!=null)
		{
			System.out.println("account1 "+((CheckingAccount)account1).isBankrupt());	
		}
		// �Ļ꿩�� Ȯ��
		
		// SavingAccount
		System.out.println();
		System.out.printf("Account2 balance %.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		
		System.out.println("6 Month Later!");
		account2.passTime(6);
		System.out.printf("Account2 balance %.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		
		System.out.println("next 6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance %.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance %.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance %.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		
		scan.close();
			}
}
