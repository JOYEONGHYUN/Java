public interface Account{

	public abstract void credit(double amount);	
	public abstract void debit(double amount) throws Exception1;
	/** @brief ������ ���� �ܾ��� �˷���
	 * @return �ܾ�
	 */
	public abstract double getBalance();
	public abstract void setBalance(double balance);
	public abstract double getWithdrawableAccount(); // ��� ������ �ݾ��� ã�´�.
	public abstract void passTime(int month_period);  // �Ⱓ�� ���ڷ� �޾� �ش�Ⱓ�� ������ ���ڸ� �Խ��� �ش�.
	public abstract void passTime();
	public abstract double estimateValue(int i);
	public abstract double estimateValue();


}
