package banking5_3;
/*
 * 
 *���� SavingAccount �࣬����̳� Account ��
 *����������һ������Ϊ double �� interestRate ����
 *������������������������balance �� interest_rate���Ĺ��й���������
 *����������ͨ������ super(balance)�� balance �������ݸ����๹������
 */
public class SavingAccount extends Account{
	
	private double interestRate;

	public SavingAccount(double init_balance, double interestRate) {
		super(init_balance);
		this.interestRate = interestRate;
	}
	
	

}
