package June20.Openai;

public class App {
    String name;
    int sim;
    Patent patent;

    App(String name, int sim, Patent patent) {
        this.name = name;
        this.sim = sim;
        this.patent = patent;
    }

    void showPatent() {
        System.out.println("App Name: " + name);
        System.out.println("Sim: " + sim);
        patent.patentDetails();
        System.out.println("---------------------");
    }
}