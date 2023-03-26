public class Support extends Robot{

    private int heal = 500;

    public Support (String name){
        super(name, "Support", 1500, 1500, 75);
    }

    public void healRobot(Robot robot) {
        if (robot.getMaxHealth() > robot.getHealth()) {
            robot.setHealth(robot.getHealth() + heal);
        }

        if (robot.getMaxHealth() > robot.getHealth()) {
            robot.setHealth(robot.getMaxHealth());
        }

        setDefend(false);
    }

    public void heal() {
        if (getMaxHealth() > getHealth()) {
            setHealth(getHealth() + heal);
        }
        if (getMaxHealth() > getHealth()) {
            setHealth(getMaxHealth());
        }
        setDefend(false);
    }
}
