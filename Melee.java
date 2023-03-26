public class Melee extends Robot{

    public Melee(String name){
        super(name, "Melee", 1250, 1250, 150);
    }

    public void dash(Boolean maju){
        if (maju) {
            setLocation(getLocation() + 2);
        } else {
            setLocation(getLocation() - 2);
        }
    }

    @Override
    public void attack(Monster monster){
        if (getLocation() == monster.getLocation()) {
            super.attack(monster);
        } else {
            System.out.println("!! Monster diluar jangkauan !!");
        }
    }
}
