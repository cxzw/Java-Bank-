package banking7;

/*1�� �� banking.domain ���н���һ�������� OverdraftException. �����
	��չ Exception �ࡣ
2�� ���һ�� double ���͵�˽������ deficit.����һ�����з��ʷ���getDeficit
3�� ���һ�������������Ĺ��й�������deficit ������ʼ�� deficit ����*/

public class OverdraftException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6215151487716765560L;

	private double deficit;
	
	public double getDeficit() {
		return deficit;
	}

	public OverdraftException(String msg, double deficit) {
		super(msg);
		this.deficit = deficit;
	}
	
	
	
}
