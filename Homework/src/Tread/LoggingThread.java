package Tread;
class LoggingThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Logging...");
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
        }
    }
}
