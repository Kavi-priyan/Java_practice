package July16;

public class Prime extends Thread {
	
	int n;
	
	
	


	public Prime(int n) {
		super();
		this.n=n;
	}



	@Override
	public void run() {
		
		runner(n);
		
}
		

	
	
	
	public void runner(int n)
	{
	     
	    	 
	 		try {
	 			

	            if (isPrime(n)) {
	                System.out.print(n + " ");
	            }
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
	        }
	
	
	public boolean isPrime(int num) {
		
	    if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        
        for(int i=3;i <= Math.sqrt(num); i += 2) {
        	if(num%i==0) {
        		return false;
        	}
        }
        return true;
	
	}
	
	
	
	

}
