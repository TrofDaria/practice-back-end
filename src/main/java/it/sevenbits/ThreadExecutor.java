package it.sevenbits;

public class ThreadExecutor {

    public void showAccountFilling(long millis) {
        Account account = new Account(0);

        ThreadCreator threadCreator = new ThreadCreator();
        Thread t1 = threadCreator.createThread(account, 1);
        Thread t2 = threadCreator.createThread(account, -1);
        Thread t3 = threadCreator.createThread(account, -1);

        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        stopThread(t1);
        stopThread(t2);
        stopThread(t3);
        System.out.println(account.toString());
    }

    private void stopThread(Thread thread){
        while (thread.isAlive()){
            thread.interrupt();
        }
    }
}
