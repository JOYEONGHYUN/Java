public interface Account{

	public abstract void credit(double amount);	
	public abstract void debit(double amount) throws Exception1;
	/** @brief 계좌의 남은 잔액을 알려줌
	 * @return 잔액
	 */
	public abstract double getBalance();
	public abstract void setBalance(double balance);
	public abstract double getWithdrawableAccount(); // 출금 가능한 금액을 찾는다.
	public abstract void passTime(int month_period);  // 기간을 인자로 받아 해당기간이 지난후 이자를 게싼해 준다.
	public abstract void passTime();
	public abstract double estimateValue(int i);
	public abstract double estimateValue();


}
