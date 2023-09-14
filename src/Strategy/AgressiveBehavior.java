package Strategy;

public class AgressiveBehavior implements RobotBehavior {

    @Override
    public int moveCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "Agressive Behaviour" + "if find another Robot attack it";
    }
    
}
