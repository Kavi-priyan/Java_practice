package Tread;

public class MyThread extends Thread {
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		
		System.out.println(t.getName());
		
		
		
		
		t.setName("NullifyR");
		
		System.out.println(t.getName());
		
	}
	

	
	

}
