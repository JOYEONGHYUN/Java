public class CheckingAccount extends Account{

	private double creditLimit; // �ѵ��� 
	private double interest;	 // ���ھ�     0.1
	private double loanInterest;// ��������  0.7

	public CheckingAccount(double balance, double credit_limit, double interest, double loan_interest) {
		super(balance); // �θ� �ִ°͵��� ���� ��ӹ޾ƾߵ�
		
		this.creditLimit = credit_limit; // �ѵ���
		this.interest = interest; // ����
		this.loanInterest = loan_interest; // ���̳ʽ� ���� ����
	};
	
	@Override
	public void debit(double amount){

		setBalance(getBalance()-amount);
	}
	
	public String isBankrupt()
	{
		if(getBalance()+creditLimit<0)
		{
		return "went Bankrupt";
		}
		else return null;
	}

	@Override
	public double getWithdrawableAccount() {
		// TODO Auto-generated method stub
		if(getBalance()+creditLimit<0)
		{
			return 0;
		}
		else
		return getBalance()+creditLimit;
	}

	@Override
	public void passTime(int month_period) {
		// TODO Auto-generated method stub
		if(getBalance() > 0) {
			setBalance( getBalance()*Math.pow((1+interest),month_period)); // �ѵ��ݾ��� 0 ���� ũ�� 0.1 ���� 
		}
		else
		{
			setBalance( getBalance()*Math.pow((1+loanInterest),month_period)); // �ѵ��ݾ��� ���̳ʽ��̸� 0.7 ����
		}
		
	}

}