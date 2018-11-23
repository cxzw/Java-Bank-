package banking6;



public class Customer {
	
	//��������˽�ж������ԣ�firstName��lastName �� account��		
	private String firstName;
	private String lastName;
	
	private Account [] accounts;
	private int numberOfAccounts;
	
	
	//����һ�����й����������������������������������ԵĲ�����f �� l��
	public Customer(String f,String l) {
		firstName = f;
		lastName = l;
		
		accounts = new Account[2];
	}
	//�����������д�ȡ�������ʸö������ԣ����� getFirstName �� getLastName������Ӧ�����ԡ�
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	//���� setAccount �������� account ���Ը�ֵ��
	public void addAccount(Account account) {
		accounts[numberOfAccounts++] = account;
	}
	
	//���� getAccount �����Ի�ȡ account ���ԡ�
	public Account getAccount(int index) {
		return accounts[index];
	}
	public int getNumOfAccounts() {
		return numberOfAccounts;
	}
}
