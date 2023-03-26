import java.util.ArrayList;
import java.util.List;

public class PusatKendali extends Robot implements Combine{

    List<Robot> robotKecil = new ArrayList<>();
    int jumlahRobot = 0;

    public PusatKendali(String name) {
        super(name, "Robot Besar", 0, 100000, 0);
    }

    @Override
    public void bergabung(Robot robot) {
        if (jumlahRobot < 5){
            robotKecil.add(robot);
            robot.setLocation(getLocation());
            setHealth(getHealth() + robot.getHealth());
            setPower(getPower() + robot.getPower());
            jumlahRobot++;
        } else {
            System.out.println("!! Robot sudah Penuh !!");
        }
    }

    @Override
    public void berpisah(Robot robot) {
        if (jumlahRobot == 0){
            System.out.println("!! Robot Kosong !!");
        } else {
            robotKecil.remove(robot);
            setHealth(getHealth() - robot.getHealth());
            setPower(getPower() - robot.getPower());
            jumlahRobot--;
        }
    }

    public void robotKecilSerang(Robot robot, Monster monster) {
        if (robotKecil.contains(robot)) {
            System.out.print("! Nyawa monster berkurang dari " + monster.getHealth());
            monster.setHealth(monster.getHealth() - robot.getPower());
            System.out.println(" menjadi " + monster.getHealth() + " !");
            robot.setDefend(false);
        } else {
            System.out.println("!! Serangan di batalkan !!");
        }
    }

    public void getRobots(){
        for (Robot robot : robotKecil){
            System.out.println(robot.getName());
        }
    }
}
