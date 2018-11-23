package banking8;
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

/*	修改 Account 类
	4． 重写 withdraw 方法使它不返回值（即 void）.
	5． 修改代码抛出新异常，指明“资金不足”以及不足数额（当前余额扣除请求的数额）
*/
	public void withdraw(double amt) {
		
		if(balance < amt) {
			throw new OverdraftException("资金不足", (amt - balance));
		}
		balance -= amt;
		
	}
}
