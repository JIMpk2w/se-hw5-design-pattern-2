/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertsQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setCurrentFlavor("");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectsQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnsCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispenseGumball() {
        System.out.println("You need to pay first");
    }

    @Override
    public void choose(String flavor) {
        System.out.println("You need to insert a quarter first");
    }

    public String toString() {
        return "waiting for quarter";
    }
}
