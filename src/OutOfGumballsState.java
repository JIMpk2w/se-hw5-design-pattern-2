/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class OutOfGumballsState implements State {
    GumballMachine gumballMachine;

    public OutOfGumballsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertsQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectsQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnsCrank() {
        System.out.println("You turned but there are no gumballs");
    }

    @Override
    public void dispenseGumball() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void choose(String flavor) {
        System.out.println("Out of gumball");
    }

    public String toString() {
        return "sold out";
    }
}
