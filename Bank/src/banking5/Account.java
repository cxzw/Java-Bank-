package banking5;
/*
*修改 Account 类
*修改 deposit 方法返回 true（意味所有存款是成功的）。
*修改 withdraw 方法来检查提款数目是否大于余额。如果amt小于balance, 则从余额中扣除提款数目并返回 true，否则余额不变返回false。
*/
public class Account {
	protected double balance;
	
	public Account(double init_balance) {
		balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt) {
		balance += amt;
		return true;
	}

	public boolean withdraw(double amt) {
		
		if(balance < amt) {
			return false;
		}
		balance -= amt;
		
		return true;
	}
}
