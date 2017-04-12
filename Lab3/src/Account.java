public class Account {

	private double balance;
	
	public Account(double balance){
		this.balance = balance;	
	}
	
	public void credit(double amount){
		balance = balance + amount; // ���¿� ���� ���� 
	}
	public String debit(double amount){		
		if(this.balance - amount < 0) {	// ���·κ��� ���� ��
			return "Debit amount exceeded account balance";
		} else {
			this.balance = this.balance - amount;
			return null;
		}
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

}
