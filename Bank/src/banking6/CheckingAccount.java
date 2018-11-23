package banking6;

/*
 * 1�� CheckingAccount �������չ Account ��
 *2�� ����������һ������Ϊ double �� overdraftProtection ���ԡ�
 *3�� ����������һ�����в�����balance���Ĺ��й��������ù���������ͨ������ super(balance)�� balance �������ݸ����๹������
 *4�� ������������һ����������������balance �� protect���Ĺ��й��������ù���������ͨ������ super(balance)������ overdragtProtection ���ԣ��� balance �������ݸ����๹������
 *5�� CheckingAccount ����븲�� withdraw �������˷�������ִ�����м�顣
 *	�����ǰ����㹻�ֲ�ȡ�� amount,���������С���������ֲ����Ǵ���͸֧ ������������ overdraftProtection ��ֵ���ֲ��ò�ֵ��balance-amount��. 
 *	����ֲ���͸֧����Ҫ�Ľ����ڵ�ǰ�ı�����������������ʧ�ܣ����� ��δ��Ӱ�졣
 */

public class CheckingAccount extends Account{
	
	private double overdraftProtection;

	public CheckingAccount(double init_balance) {
		super(init_balance);
	}

	public CheckingAccount(double init_balance, double overdraftProtection) {
		super(init_balance);
		this.overdraftProtection = overdraftProtection;
	}
	
	@Override
	public boolean withdraw(double amt) {
		
		//����㹻
		if(balance >= amt) {
			balance -= amt;
		}else {
			//͸֧�����㹻
			if(overdraftProtection >= (amt-balance)){
				overdraftProtection -= (amt - balance);
				balance =0;
			}
			//����.͸֧����Ҳ����
			else {
				return false;
			}
		}
		return true;
	}
}
