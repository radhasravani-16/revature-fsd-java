
public class Account {

	public static void main(String[] args) {
			private String accountNumber;
			private double balance;
			private Transaction[] transactions;
			public Account(String accountNumber, double balance, Transaction[] transactions) {
				super();
				this.accountNumber = accountNumber;
				this.balance = 
		public static void main(String atgs[])
			{
				Transaction transaction1 = new Transaction('W', 2000);
				Transaction transaction2 = new Transaction('W', 20000);
				Transaction transaction3 = new Transaction('W', 500);
				Transaction transaction4 = new Transaction('W', 15500);
				Transaction transaction5 = new Transaction('W', 10000);
				
				//float[] scores = { 48, 55, 78, 25, 22 };
				Transaction[] transactionArray = { transaction1, transaction2, transaction3, transaction4, transaction5 };
				Account account = new Account("01302343794", 5000.0, transactionArray);
				account.printStatement();
			}

		}


	}

}
