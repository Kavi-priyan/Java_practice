package June20.TVK;
class State {
    String stateName;
    double stateIncome;
    Cm cm; 

    State(String stateName, double stateIncome, Cm cm) {
        this.stateName = stateName;
        this.stateIncome = stateIncome;
        this.cm = cm;
    }

    void displayCmDetails() {
        cm.cmDetails();
    }
}
