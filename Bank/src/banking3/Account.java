package banking3;
/*
*�޸� Account ��
*�޸� deposit �������� true����ζ���д���ǳɹ��ģ���
*�޸� withdraw ��������������Ŀ�Ƿ���������amtС��balance, �������п۳������Ŀ������ true���������䷵��false��
*/
public class Account {
	private double balance;
	
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