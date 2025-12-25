package Tread;

public class Thread1 {
public static void main(String[] args) {
	MyThread t1=new MyThread();
	t1.start();
	
	for (int i = 0; i < 10; i++) {
		System.out.println("                Side wind");
		
	}
}
}
