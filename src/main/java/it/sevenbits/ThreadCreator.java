package it.sevenbits;

public class ThreadCreator {

    public Thread createThread(Account account, long value) {
        return new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is running!");
                while (!Thread.interrupted()) {
                    synchronized (account) {
                        account.addToBalance(value);
                    }
                }
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
            }
        });
    }
}
