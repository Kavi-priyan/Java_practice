package June20.Openai;
class Patent {
    int patentNum;
    String ownership;

    Patent(int patentNum, String ownership) {
        this.patentNum = patentNum;
        this.ownership = ownership;
    }

    void patentDetails() {
        System.out.println("Patent Number: " + patentNum);
        System.out.println("Ownership: " + ownership);
    }
}
