package June20;
class Computer {
    String brand;
    double price;
    Cpu cpu;

    Computer(String brand, double price, Cpu cpu) {
        this.brand = brand;
        this.price = price;
        this.cpu = cpu;
    }

    void displayCpuSpecs() {
        cpu.cpuSpecification();
    }
}
