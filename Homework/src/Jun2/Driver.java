package Jun2;

public class Driver {
	
	public static void main(String[] args) {
		Device d=new Phone();
		new Phone().mode();
		
		Camera c=(Camera)d;
		
		c.powerOn();
		c.takePhoto();
		
		System.out.println(d==c);
		
		MusicPlayer m=(MusicPlayer)d;
		
		m.playMusic();
		m.stopMusic();
		
		m.deviceInfo();
	}

}
