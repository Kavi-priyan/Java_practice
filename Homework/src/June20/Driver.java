package June20;

public class Driver {
	 public static void main(String[] args) {
	        Cpu cpu = new Cpu();
	        cpu.systemName = "Intel Core i7";
	        cpu.cpuId = 101;

	        Computer computer = new Computer("Dell", 75000.0, cpu);
	        computer.displayCpuSpecs(); 
	    }

}
