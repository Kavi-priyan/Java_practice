package Jun2;


class Phone implements Camera,MusicPlayer{
	 Phone(){
		 System.out.println("phone created");
	 }
	 
	 public Phone mode() {
		
		return new Phone();
	 }
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
		System.out.println("Power On");
	}
	
     
	public void playMusic() {
		System.out.println("Playing Mutha mazhai (Chinmayi version)");
		
	}
	
	public void stopMusic() {
		System.out.println("Player stopped");
		
	}


	@Override
	public void takePhoto() {
		System.out.println("Smile");
		
	}


	@Override
	public void recordPhoto() {
		System.out.println("Fun panrom");
		
	}

	

}
