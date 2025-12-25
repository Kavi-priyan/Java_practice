package Jun2;

public interface Device {
	
	 int VERSION = 0;
	 
	 public void powerOn();
	 
	 default void deviceInfo() {
		 System.out.println(VERSION);
	 }

}
