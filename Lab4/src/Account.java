public abstract class Account {

	private double balance;
	public Account(double balance){
		this.balance = balance;	
	}
	public void credit(double amount){
		balance = balance + amount; // 계좌에 돈을 넣음 
	}
	public void debit(double amount){		
		
			this.balance = this.balance - amount;
	}
	/** @brief 계좌의 남은 잔액을 알려줌
	 * @return 잔액
	 */
	public double getBalance() {
		return balance;
	}
	protected void setBalance(double balance){
		 // 계좌의 잔액을 수정한다
		this.balance = balance;
	}
	public abstract double getWithdrawableAccount(); // 출금 가능한 금액을 찾는다.
	public abstract void passTime(int month_period);  // 기간을 인자로 받아 해당기간이 지난후 이자를 게싼해 준다.


}
