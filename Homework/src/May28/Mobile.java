package May28;

public class Mobile extends Product{
	
	private int displaySize;
	public int getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(int displaySize) {
		this.displaySize = displaySize;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public int getROM() {
		return ROM;
	}

	public void setROM(int rOM) {
		ROM = rOM;
	}

	private int RAM;
	private int ROM;
	
	public String displayDetails()
	{
		return RAM+"\n"+ROM+"\n"+displaySize;
	}
}
