package banking7;
/*
*�޸� Account ��
*�޸� deposit �������� true����ζ���д���ǳɹ��ģ���
*�޸� withdraw ��������������Ŀ�Ƿ���������amtС��balance, �������п۳������Ŀ������ true���������䷵��false��
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

/*	�޸� Account ��
	4�� ��д withdraw ����ʹ��������ֵ���� void��.
	5�� �޸Ĵ����׳����쳣��ָ�����ʽ��㡱�Լ����������ǰ���۳���������
*/
	public void withdraw(double amt) {
		
		if(balance < amt) {
			throw new OverdraftException("�ʽ���", (amt - balance));
		}
		balance -= amt;
		
	}
}
