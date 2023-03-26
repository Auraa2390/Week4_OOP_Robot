public class Robot {
    private String type;
    private int maxHealth;
    private String name;
    private int health;
    private int power;
    private int location;
    private boolean defend = false;

    public Robot(String name, String type, int health, int maxHealth, int power){
        this.name = name;
        this.type = type;
        this.health = health;
        this.maxHealth = maxHealth;
        this.power = power;
    }

    public void move(boolean maju){
        if (maju){
            location += 1;
        } else {
            location -= 1;
        }
        defend = false;
    }

    public void attack(Monster monster){
        if (monster.getHealth() <= 0){
            System.out.println("!! Monster Sudah Mati !!");
        } else {
            System.out.print("! Nyawa monster berkurang dari " + monster.getHealth());
            monster.setHealth(monster.getHealth() - power);
            System.out.println(" menjadi " + monster.getHealth() + " !");
            defend = false;
        }

        if (monster.getHealth() <= 0) {
            System.out.println("!! Monster Mati !!");
        }
    }

    public void defend(){
        defend = true;
    }

    public void heal(){
        if (health <= maxHealth){
            health = health + 50;
        } else if (health >= maxHealth){
            health = maxHealth;
        }
        defend = false;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }

    public int getLocation(){
        return location;
    }

    public void setLocation(int location){
        this.location = location;
    }

    public boolean isDefend(){
        return defend;
    }

    public void setDefend(boolean defend){
        this.defend = defend;
    }
}
