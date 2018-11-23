package banking5_3;

/*
 * 
 *1.CheckingAccount �������չ Account ��
 *2.����������һ���������ԣ����� protectedBy����ʾ͸֧�����������Ե�����Ϊ SavingAccount��ȱʡֵ������ null������֮�����û���������������ԡ�
 *3.����������һ�����в�����balance���Ĺ��й��������ù���������ͨ������ super(balance)�� balance �������ݵ����๹������
 *4. �� �� �� �� �� Ϊ CheckingAccount(double balance,SavingAccountprotect)���������ù���������ͨ������ super��balance���� balance �������ݸ����๹������
 *5. CheckingAccount ����븲�� withdraw ������
 *	�������ִ������ļ�飺�����ǰ����㹻�ֲ�ȡ�� amount�����������С���������ֲ����Ǵ���͸֧���������ô����˻����ֲ������ֵ��balance-amount����
 *	�����һ������ʧ�ܣ�����������һ��ʧ�ܣ������δ��Ӱ�졣
 */

public class CheckingAccount extends Account{
	
	private SavingAccount protecteBy;
	

	public CheckingAccount(double init_balance, SavingAccount protecteBy) {
		super(init_balance);
		this.protecteBy = protecteBy;
	}


	public CheckingAccount(double init_balance) {
		super(init_balance);
	}

	
	
	@Override
	public boolean withdraw(double amt) {
		
		//����㹻
		if(balance >= amt) {
			balance -= amt;
		}else {
			//͸֧�����㹻
			if(protecteBy != null
					&& protecteBy.getBalance() >= (amt-balance)){
				protecteBy.withdraw(amt - balance);
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
