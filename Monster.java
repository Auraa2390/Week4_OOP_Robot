public class Monster {
    int health = 500;
    int power = 100;
    boolean stun;
    int location = 0;

    public void attack(Robot robot){
        if(health >= 0){
            if (robot.getLocation() == location){
                if (stun){
                    stun = false;
                    System.out.println("!! Monster sedang Terstun !!");
                    return;
                } else {
                    System.out.println("!! Nyawa robot dari " + robot.getHealth());
                    if (robot.isDefend()){
                        robot.setHealth(robot.getHealth() - (power / 2));
                    } else {
                        robot.setHealth(robot.getHealth() - power);
                    }
                    System.out.print(" berkurang menjadi " + robot.getHealth());
                }
            }
        } else {
            System.out.println("!! Monster Sudah Mati !!");
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isStun() {
        return stun;
    }

    public void setStun(boolean stun) {
        this.stun = stun;
    }

    public int getLocation(){
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
