import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	// ��ü�� ���� �޸𸮰� ���� �Ҵ�ǰ�, input(��ü��������)�� ��ü�� ���� �ּҸ� ������.
		
		double debit; // ��� �ʵ�
		String err; // �����޼��� �ʵ�
		
		Account account1 = new Account(50.00);  // ������ ����  : Balance
		Account account2 = new Account(0.00);  // ������ ����    : Balance
		
		System.out.printf("account1 balance: $ %.2lf\n",account1.balance()); // ���� ���� Ȯ��
		System.out.printf("account2 balance: $ %.2lf\n",account2.balance());
		
		System.out.print("Enter withdrawal amount for account1: ");
		debit = input.nextDouble(); // ����� �ݾ� �Է�
		System.out.print("\n");
		
		err = account1.debit(debit);
		if(err!=null)
		{
			System.err.println("Account1 "+err); // ���¿� �ݾ��� ������ ���� �޼���
		}
		else{
			System.out.println("account1 balance");
		}
		
		System.out.printf("account1 balance: $ %.2lf\n",account1.balance()); // ���� ���� Ȯ��
		System.out.printf("account2 balance: $ %.2lf\n",account2.balance()); // ���� ���� Ȯ��
		System.out.print("\n");
		
		System.out.print("Enter withdrawal amount for account2: ");
		debit = input.nextDouble(); // ���� ��
		err = account2.debit(debit);
		if(err!=null)
		{
			System.out.println("account2 balance");
			System.out.println(err); // ���¿� �ݾ��� ������ ���� �޼���
		}
		else{
			System.out.println("account2 balance");
		}
		
		System.out.printf("account1 balance: $ %.2lf\n",account1.balance()); // ���� ���� Ȯ��
		System.out.printf("account2 balance: $ %.2lf\n",account2.balance()); // ���� ���� Ȯ��

		input.close(); // ����� �Ϸ�� ���ҽ��� �޸𸮿��� �Ҹ�����ش�. Scanner �ٽ����ϱ� �����ڷ� �� ���ҽ� �Ҹ������
	}

	
}
