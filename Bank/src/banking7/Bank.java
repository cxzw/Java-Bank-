package banking7;

public class Bank {
	//Ϊ Bank �� �� �� �� �� �� �� �� customers(Customer��������� ) ��
	//numberOfCustomers(������������һ�� customers ��������) 
	private Customer [] customers;
	private int numberOfCustomers;
		
	//��ӹ��й��������Ժ��ʵ����ߴ磨���ٴ��� 5����ʼ�� customers ���顣
	public Bank() {
		customers = new Customer[10];
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
		Customer customer = new Customer(f, l);
		customers[numberOfCustomers] = customer; 
		numberOfCustomers++;
	}
	
	//��� getNumOfCustomers ���ʷ����������� numberofCustomers ��ֵ��
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	//��� getCustomer�������������������index������صĿͻ���
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
}
