package Threads;
class BankAccount {

    int balance = 0;

    synchronized void withdraw(int amount) {

        System.out.println("Withdraw thread started...");

        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting...");
            
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance = balance - amount;
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Withdraw successful!");
        System.out.println("Remaining balance: " + balance);
    }

    synchronized void deposit(int amount) {

        System.out.println("Depositing " + amount);

        balance = balance + amount;

        System.out.println("Balance: " + balance);

        notify();
    }
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread withdrawThread = new Thread(() -> {
            account.withdraw(1000);
        });

        Thread depositThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.deposit(1000);
        });

        withdrawThread.start();
        depositThread.start();
    }
}