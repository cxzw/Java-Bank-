package banking5_3;

/*
 * 1.����ϰ 5_�� 1 �޸ģ�ԭ���� Customer �����һ������ account �Ĺ������ԣ����ø����Կ���һ�� Account ����
 * 	    ��д����࣬ʹ����������������ԣ�savingAccount �� checkingAccount�����������Ե�ȱʡֵ�� null
 *2.�����������ʷ�����getSaving �� getChecking�������������ֱ𷵻ش����֧Ʊ������
 *3. ���������෴�ķ�����SetSaving �� setChecking�������������ֱ�Ϊ
 *	savingAccount �� checkingAccount �������������Ը�ֵ��
 */

public class Customer {
	
	//��������˽�ж������ԣ�firstName��lastName �� account��		
	private String firstName;
	private String lastName;
	
	private SavingAccount savingsAccount;
	private CheckingAccount checkingAccount;
	
	//����һ�����й����������������������������������ԵĲ�����f �� l��
	public Customer(String f,String l) {
		firstName = f;
		lastName = l;
		
	}
	//�����������д�ȡ�������ʸö������ԣ����� getFirstName �� getLastName������Ӧ�����ԡ�
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public SavingAccount getSavingsAccount() {
		return savingsAccount;
	}
	public void setSavingsAccount(SavingAccount savingAccount) {
		this.savingsAccount = savingAccount;
	}
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(CheckingAccount checkingAccount2) {
		this.checkingAccount = checkingAccount2;
	}

	
}
