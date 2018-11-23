package banking8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	
	//��������˽�ж������ԣ�firstName��lastName �� account��		
	private String firstName;
	private String lastName;
	
//	private Account [] accounts;
//	private int numberOfAccounts;
	
	
	private List<Account> accounts;
	//����һ�����й����������������������������������ԵĲ�����f �� l��
	public Customer(String f,String l) {
		firstName = f;
		lastName = l;
		
//		accounts = new Account[2];
		accounts = new ArrayList<>();
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
//		accounts[numberOfAccounts++] = account;
		accounts.add(account);
	}
	
	//���� getAccount �����Ի�ȡ account ���ԡ�
	public Account getAccount(int index) {
//		return accounts[index];
		return accounts.get(index);
	}
	public int getNumOfAccounts() {
//		return numberOfAccounts;
		return accounts.size();
	}
	public Iterator<Account> getAccounts(){
		return accounts.iterator();
	}
}
