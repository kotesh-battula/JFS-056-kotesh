package Threads;
class Test {
    public static void main(String[] args) throws Exception {

        Object obj = new Object();

        Thread t = new Thread(() -> {
            synchronized (obj) {
                try {
                    System.out.println("Waiting...");
                    obj.wait();

                    System.out.println("I can continue");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        t.start();

        Thread.sleep(1000);

        synchronized (obj) {
            obj.notify();
        }
    }
}
