package banking;



public class Customer {
	
	//��������˽�ж������ԣ�firstName��lastName �� account��		
	private String firstName;
	private String lastName;
	private Account account;
	
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
	
	//���� setAccount �������� account ���Ը�ֵ��
	public void setAccount(Account account) {
		this.account = account;
	}
	
	//���� getAccount �����Ի�ȡ account ���ԡ�
	public Account getAccount() {
		return account;
	}
}
