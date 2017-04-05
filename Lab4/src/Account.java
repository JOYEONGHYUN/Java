public abstract class Account {

	private double balance;
	public Account(double balance){
		this.balance = balance;	
	}
	public void credit(double amount){
		balance = balance + amount; // ���¿� ���� ���� 
	}
	public void debit(double amount){		
		
			this.balance = this.balance - amount;
	}
	/** @brief ������ ���� �ܾ��� �˷���
	 * @return �ܾ�
	 */
	public double getBalance() {
		return balance;
	}
	protected void setBalance(double balance){
		 // ������ �ܾ��� �����Ѵ�
		this.balance = balance;
	}
	public abstract double getWithdrawableAccount(); // ��� ������ �ݾ��� ã�´�.
	public abstract void passTime(int month_period);  // �Ⱓ�� ���ڷ� �޾� �ش�Ⱓ�� ������ ���ڸ� �Խ��� �ش�.


}
