public class Range extends Robot {
    public Range(String name){
        super(name, "Range", 750, 750, 200);
    }

    public void distract(Monster monster){
        monster.setStun(true);
    }

    @Override
    public void attack(Monster monster){
        if((monster.getLocation() - getLocation()) < 2){
            super.attack(monster);
        }
    }
}
