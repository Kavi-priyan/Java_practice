package Tread;

public class ProcessingThread  extends Thread {
	public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Processing data...");
            try { 
            	
            	Thread.sleep(1000); 
            	
            } 
            catch (InterruptedException e) {}
            
        }
    }

	


}
