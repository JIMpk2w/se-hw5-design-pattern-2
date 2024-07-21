/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class GumballSoldState implements State {
    GumballMachine gumballMachine;

    public GumballSoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertsQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
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
        gumballMachine.releaseBall();
        if(gumballMachine.getGumballCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getOutOfGumballsState());
        }
    }

    @Override
    public void choose(String flavor) {
        System.out.println("there are no gumballs");
    }
}
