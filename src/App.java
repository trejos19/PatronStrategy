import Strategy.AgressiveBehavior;
import Strategy.DefensiveBehavior;
import Strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        Robot roboto = new Robot();
        roboto.setName("Mr Roboto");
        roboto.setbehavior(new AgressiveBehavior());
        roboto.move();

        Robot wally = new Robot();
        wally.setName("Wallye");
        wally.setbehavior(new DefensiveBehavior());
        wally.move();
    }
}
