package banking8;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
	//Ϊ Bank �� �� �� �� �� �� �� �� customers(Customer��������� ) ��
	//numberOfCustomers(������������һ�� customers ��������) 

	private java.util.List<Customer> customers;
		
	//��ӹ��й��������Ժ��ʵ����ߴ磨���ٴ��� 5����ʼ�� customers ���顣
	public Bank() {
		customers = new ArrayList<>();
	}
	
	private static Bank bank = new Bank();
	
	public static Bank getBank() {
		return bank;
	}
	
	/*
	 *��� addCustomer �������÷����������ղ������գ�����
	 *����һ���µ�Customer����Ȼ������ŵ� customer �����С�
	 *������� numberofCustomers���Ե�ֵ�� 1�� 
	 */
	public void addCustomer(String f,String l) {
		/*Customer customer = new Customer(f, l);
		customers[numberOfCustomers] = customer; 
		numberOfCustomers++;*/
		
		customers.add(new Customer(f, l));
	}
	
	//��� getNumOfCustomers ���ʷ����������� numberofCustomers ��ֵ��
	public int getNumOfCustomers() {
//		return numberOfCustomers;
		return customers.size();
	}
	
	//��� getCustomer�������������������index������صĿͻ���
	public Customer getCustomer(int index) {
//		return customers[index];
		return customers.get(index);
	}
	
	public Iterator<Customer> getcustomers(){
		return customers.iterator();
	}
}
