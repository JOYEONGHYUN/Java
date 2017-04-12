import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	// 객체에 대한 메모리가 힙에 할당되고, input(객체참조변수)는 객체에 대한 주소를 가진다.
		
		double debit; // 출금 필드
		String err; // 에러메세지 필드
		
		Account account1 = new Account(50.00);  // 참조자 생성  : Balance
		Account account2 = new Account(0.00);  // 참조자 생성    : Balance
		
		System.out.printf("account1 balance: $ %.2lf\n",account1.balance()); // 계좌 내역 확인
		System.out.printf("account2 balance: $ %.2lf\n",account2.balance());
		
		System.out.print("Enter withdrawal amount for account1: ");
		debit = input.nextDouble(); // 출금할 금액 입력
		System.out.print("\n");
		
		err = account1.debit(debit);
		if(err!=null)
		{
			System.err.println("Account1 "+err); // 계좌에 금액이 없으면 오류 메세지
		}
		else{
			System.out.println("account1 balance");
		}
		
		System.out.printf("account1 balance: $ %.2lf\n",account1.balance()); // 계좌 내역 확인
		System.out.printf("account2 balance: $ %.2lf\n",account2.balance()); // 계좌 내역 확인
		System.out.print("\n");
		
		System.out.print("Enter withdrawal amount for account2: ");
		debit = input.nextDouble(); // 꺼낼 돈
		err = account2.debit(debit);
		if(err!=null)
		{
			System.out.println("account2 balance");
			System.out.println(err); // 계좌에 금액이 없으면 오류 메세지
		}
		else{
			System.out.println("account2 balance");
		}
		
		System.out.printf("account1 balance: $ %.2lf\n",account1.balance()); // 계좌 내역 확인
		System.out.printf("account2 balance: $ %.2lf\n",account2.balance()); // 계좌 내역 확인

		input.close(); // 사용이 완료된 리소스를 메모리에서 소멸시켜준다. Scanner 다썼으니까 참조자로 쓴 리소스 소멸시켜줌
	}

	
}
