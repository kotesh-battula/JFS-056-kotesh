package TaskInterface;

public class UPI implements Payment {
	int balance;
	public UPI(int balance)
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
