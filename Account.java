
/**
 * Name: Nabilah Binti Mohd Sani
 * 
 * Section 2 - Question 1
 *
 */
class Account implements java.io.Serializable {
	
	Account self = new Account();
	
	private String id;
	private String name;
	private double amount;
	private double amount1;
	private double balance;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmount1() {
		return amount1;
	}
	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void _init_ (Account self, String name, double balance) {
		self.id = "123";
		self.name = "James" ;
		self.balance = 0.00;
	}
	
	public double deposit (Account self, double amount) {
		self.amount = 150.55;
		return self.amount;
	}
	
	public double withdraw (Account self, double amount1) {
		self.amount1 = 45.35;
		return self.amount1;
		
	}
	
	public String _str_ (Account self) {
		self.balance = self.amount - self.amount1;
		return("f " + self.name + "'s account. Balance: " + self.balance);
	}
	
	/**
	 * Name: Nabilah Binti Mohd Sani
	 * 
	 * Section 2 - Question 2
	 *
	 */
	class Devaccount extends Account {
		
		private double current_balance;
		private double transfer;
		
		public double getCurrent_balance() {
			return current_balance;
		}

		public void setCurrent_balance(double current_balance) {
			this.current_balance = current_balance;
		}

		public double getTransfer() {
			return transfer;
		}

		public void setTransfer(double transfer) {
			this.transfer = transfer;
		}

		@Override
		public double getBalance() {
			return super.getBalance();
		}
		
		public double setBalance() {
			return balance;
		}
		
		public double transfer_money (Double transfer, double balance) {
			current_balance = balance - transfer;
			return current_balance;
			
		}
	}
}
