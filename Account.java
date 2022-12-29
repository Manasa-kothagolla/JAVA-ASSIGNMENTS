package manasaCareerTuner;
public class Account {
	private long AccountNumber;
	private double balance;
	private String AccountHolder;

	public Account(long accountNumber, double balance, String accountHolder) {
		super();
		this.AccountNumber = accountNumber;
		this.balance = balance;
		this.AccountHolder = accountHolder;
	}

	public void deposit(double X) {
		balance = balance + X;
	}

	public void withdraw(double y) {
		balance = balance - y;

	}

	public long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.AccountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountHolder() {
		return AccountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.AccountHolder = accountHolder;
	}

class Person {
		private String name;
		private float age;

		public Person(String name, float age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getAge() {
			return age;
		}

		public void setAge(float age) {
			this.age = age;
		}

	}
}
