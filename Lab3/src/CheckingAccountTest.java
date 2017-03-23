import java.util.Scanner;

public class CheckingAccountTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double debit;
		double deposit;
		String err;
		
		CheckingAccount account1 = new CheckingAccount(100.0,-100,0.01,0.07);  // 참조자 생성
		CheckingAccount account2 = new CheckingAccount(100.0,-100,0.01,0.07);  // 참조자 생성
		
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // 계좌 내역 확인
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // 계좌 내역 확인
		 // 계좌 내역 확인
		System.out.print("Enter deposit amount for Account1 : ");
		deposit = input.nextDouble(); // 예급 할 금액 입력
		account1.credit(deposit);
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // 계좌 내역 확인
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // 계좌 내역 확인
		System.out.print("Enter withdrawal amount for account2 : ");
		debit = input.nextDouble(); // 예급 할 금액 입력
		err=account2.debit(debit);
		if(err!=null)
		{
			System.out.println(err); // 한도초과
		}
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // 계좌 내역 확인
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // 계좌 내역 확인
		
		System.out.println("next month!");
		account1.nextMonth();
		account2.nextMonth();
		
		System.out.printf("Account1 balance %.2f\n",account1.getBalance()); // 계좌 내역 확인
		System.out.printf("Account2 balance %.2f\n",account2.getBalance()); // 계좌 내역 확인
		
		input.close();
	}
}
