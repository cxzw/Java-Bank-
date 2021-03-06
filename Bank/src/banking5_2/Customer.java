package banking5_2;



public class Customer {
	
	//声明三个私有对象属性：firstName、lastName 和 account。		
	private String firstName;
	private String lastName;
	
	private Account [] accounts;
	private int numberOfAccounts;
	
	
	//声明一个公有构造器，这个构造器带有两个代表对象属性的参数（f 和 l）
	public Customer(String f,String l) {
		firstName = f;
		lastName = l;
		
		accounts = new Account[2];
	}
	//声明两个公有存取器来访问该对象属性，方法 getFirstName 和 getLastName返回相应的属性。
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	//声明 setAccount 方法来对 account 属性赋值。
	public void addAccount(Account account) {
		accounts[numberOfAccounts++] = account;
	}
	
	//声明 getAccount 方法以获取 account 属性。
	public Account getAccount(int index) {
		return accounts[index];
	}
	public int getNumOfAccounts() {
		return numberOfAccounts;
	}
}
