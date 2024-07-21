import java.util.Random;

/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertsQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectsQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnsCrank() {
        if (gumballMachine.getCurrentFlavor().equals("")) {
            System.out.println("You have to choose the flavor first");
        } else {
            System.out.println("You turned ...");
            int winner = randomWinner.nextInt(10);
            if ((winner == 0) && (gumballMachine.getGumballCount() > 1)) {
                gumballMachine.setState(gumballMachine.getWinnerState());
            } else {
                gumballMachine.setState(gumballMachine.getGumballSoldState());
            }
        }
    }

    @Override
    public void dispenseGumball() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void choose(String flavor) {
        for (String flavors : gumballMachine.getFlavors()) {
            if(flavors.equals(flavor)) {
                gumballMachine.setCurrentFlavor(flavor);
                System.out.println("You have chosen the flavor " + flavor);
            }
        }
    }

    public String toString() {
        return "waiting for turn";
    }
}
