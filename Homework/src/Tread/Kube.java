package Tread;

public class Kube extends Thread {

	int num;
	int res;
	
	Kube(int num){
		this.num=num;
	}
	
	@Override
	public void run() {
		res=num*num*num;
	try {
			
			System.out.println(res);
			Thread.sleep(1000);
		} catch (Exception e) {
e.printStackTrace();
		
		System.out.println(res);
		
	}

}}
