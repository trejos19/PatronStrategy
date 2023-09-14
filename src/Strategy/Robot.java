package Strategy;

public class Robot {
    private RobotBehavior behavior;
    private String name;

    public Robot(){
        
    }
    public RobotBehavior getbehavior(){
        return behavior;
    }

    public void setbehavior(RobotBehavior behavior){
        this.behavior= behavior;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void move(){
        int command = behavior.moveCommand();
        System.out.println(name + ": "+"move Command:"+ command + ". " + behavior.toString());
    }
}
