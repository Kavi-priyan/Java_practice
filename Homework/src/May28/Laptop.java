package May28;

public class Laptop extends Product{
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getBatteryCap() {
		return batteryCap;
	}
	public void setBatteryCap(int batteryCap) {
		this.batteryCap = batteryCap;
	}
	private int version;
	private int batteryCap;
	
	
	
		public String displayDetails()
		{
			return version+"\n"
					+ " "+batteryCap;
		}
	}


