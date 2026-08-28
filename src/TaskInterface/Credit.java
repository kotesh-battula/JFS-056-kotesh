package TaskInterface;

public class Credit implements Payment{
	int balance;
	public Credit(int balance)
	{
		this.balance=balance;
	}
	public void showBalance()
	{
		System.out.println("Balance is "+balance);
	}
	public int addMoney(int i)
	{
		return balance+i;
	}
	public int withDraw(int i)
	{
		return balance-i;
	}
}
