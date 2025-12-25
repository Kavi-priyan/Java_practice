package Tread;

public class Square implements Runnable{
	int rumble=0;
	int res=1;
	Square(int rumble){
		this.rumble=rumble;
		
	}

	@Override
	public void run() {
		rumble=res*res;
		
		try {
			
			System.out.println(res);
			Thread.sleep(1000);
		} catch (Exception e) {
e.printStackTrace();
		}
		
	}

}
