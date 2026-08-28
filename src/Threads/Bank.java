package Threads;

class Bank {

    int balance = 1000;

    synchronized void withdraw(int amount) {

        System.out.println(
            Thread.currentThread().getName() +
            " is trying to withdraw " + amount
        );

        if (balance >= amount) {

            System.out.println(
                Thread.currentThread().getName() +
                " is withdrawing"
            );

            balance = balance - amount;

            System.out.println("Remaining balance = " + balance);

        } else {

            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args) {

        Bank b = new Bank();

        Thread t1 = new Thread(() -> {
            b.withdraw(700);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            b.withdraw(700);
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
