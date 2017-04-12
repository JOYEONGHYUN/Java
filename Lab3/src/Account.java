public class Account {

	private double balance;
	
	public Account(double balance){
		this.balance = balance;	
	}
	
	public void credit(double amount){
		balance = balance + amount; // ∞Ë¡¬ø° µ∑¿ª ≥÷¿Ω 
	}
	public String debit(double amount){		
		if(this.balance - amount < 0) {	// ∞Ë¡¬∑Œ∫Œ≈Õ µ∑¿ª ª≠
			return "Debit amount exceeded account balance";
		} else {
			this.balance = this.balance - amount;
			return null;
		}
	}

	/** @brief ∞Ë¡¬¿« ≥≤¿∫ ¿‹æ◊¿ª æÀ∑¡¡‹
	 * @return ¿‹æ◊
	 */
	public double getBalance() {
		return balance;
	}
	
	protected void setBalance(double balance){
		 // ∞Ë¡¬¿« ¿‹æ◊¿ª ºˆ¡§«—¥Ÿ
		this.balance = balance;
	}

}
