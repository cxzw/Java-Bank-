package banking5_3;

/*
 * 
 *1.CheckingAccount 类必须扩展 Account 类
 *2.该类必须包括一个关联属性，称作 protectedBy，表示透支保护。该属性的类型为 SavingAccount，缺省值必须是 null。除此之外该类没有其他的数据属性。
 *3.该类必须包括一个带有参数（balance）的公有构造器，该构造器必须通过调用 super(balance)将 balance 参数传递到父类构造器。
 *4. 修 改 构 造 器 为 CheckingAccount(double balance,SavingAccountprotect)构造器。该构造器必须通过调用 super（balance）将 balance 参数传递给父类构造器。
 *5. CheckingAccount 类必须覆盖 withdraw 方法。
 *	该类必须执行下面的检查：如果当前余额足够弥补取款 amount，则正常进行。如果不够弥补但是存在透支保护则尝试用储蓄账户来弥补这个差值（balance-amount）。
 *	如果后一个交易失败，则整个交易一定失败，但余额未受影响。
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
		
		//余额足够
		if(balance >= amt) {
			balance -= amt;
		}else {
			//透支保护足够
			if(protecteBy != null
					&& protecteBy.getBalance() >= (amt-balance)){
				protecteBy.withdraw(amt - balance);
				balance =0;
			}
			//余额不足.透支保护也不足
			else {
				return false;
			}
		}
		return true;
	}
}
