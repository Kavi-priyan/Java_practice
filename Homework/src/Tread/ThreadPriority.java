package Tread;

public class ThreadPriority {
	
	   public static void main(String[] args) {
	        LoggingThread log = new LoggingThread();
	        ProcessingThread process = new ProcessingThread();
	        Thread log1 = new Thread(()->{
	        	
	        	for(int i = 1; i <= 10; i++) {
	            System.out.println("Logging "+i+" in main...");
	            try { Thread.sleep(2000); } catch (InterruptedException e) {}
	            
	        }});

	        log.setPriority(Thread.MIN_PRIORITY);        // Background task
	        process.setPriority(Thread.MAX_PRIORITY);    // Critical task

	        log.start();
	        process.start();
	        log1.start();	    
	        
	   
	   
	   }
	   
	   
	   
	   
	   
	   
	   

}
