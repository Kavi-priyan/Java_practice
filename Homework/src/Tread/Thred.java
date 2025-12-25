package Tread;

public class Thred {
	
	public static void main(String[] args) {
		Thread t1=Thread.currentThread();
		System.out.println(t1.threadId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println("----------------------");
		
		display();
	}

	private static void display() {
		Thread t2=Thread.currentThread();
		System.out.println(t2.threadId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		
	}
	
	

}
