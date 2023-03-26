import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Robot> robotKecil = new ArrayList<>();
        List<Monster> monsters = new ArrayList<>();
        PusatKendali pusatKendali = new PusatKendali("Pemimpin");

        robotKecil.add(new Melee("Robot Merah"));
        robotKecil.add(new Melee("Robot Hitam"));
        robotKecil.add(new Range("Robot Pink"));
        robotKecil.add(new Range("Robot Kuning"));
        robotKecil.add(new Support("Robot Biru"));

        monsters.add(new Monster());
        monsters.add(new Monster());
        monsters.add(new Monster());

        System.out.println(robotKecil.get(0).getLocation());

        robotKecil.get(0).move(true);
        System.out.println(robotKecil.get(0).getLocation());

        if (robotKecil.get(0) instanceof Melee){
            ((Melee) robotKecil.get(0)).dash(true);
        }

        System.out.println(robotKecil.get(0).getLocation());

        System.out.println();

        // coba attack melee diluar jangkauan
        System.out.println("Lokasi robot " + monsters.get(0).getLocation());
        if (robotKecil.get(0) instanceof Melee){
            System.out.println("Lokasi robot " + robotKecil.get(0).getLocation());
            robotKecil.get(0).attack(monsters.get(0));
        }
        System.out.println();

        // coba attack melee didalam jangkauan
        System.out.println("Lokasi robot " + monsters.get(0).getLocation());
        if (robotKecil.get(1) instanceof Melee){
            System.out.println("Lokasi robot " + robotKecil.get(0).getLocation());
            robotKecil.get(1).attack(monsters.get(0));
        }
        System.out.println();

        // coba attack range
        if (robotKecil.get(2) instanceof Range){
            robotKecil.get(2).move(true);
            System.out.println("Lokasi robot sekarang " + robotKecil.get(2).getLocation());
            robotKecil.get(2).attack(monsters.get(0));
        }
        System.out.println();

        // coba menggabung robot

        pusatKendali.bergabung(robotKecil.get(0));
        pusatKendali.bergabung(robotKecil.get(1));
        pusatKendali.bergabung(robotKecil.get(2));
        pusatKendali.bergabung(robotKecil.get(3));
        pusatKendali.bergabung(robotKecil.get(4));
        pusatKendali.getRobots();

        System.out.println("Attack robot besar");
        pusatKendali.attack(monsters.get(0));
        System.out.println();

        pusatKendali.berpisah(robotKecil.get(4));
        pusatKendali.berpisah(robotKecil.get(3));
        pusatKendali.berpisah(robotKecil.get(2));
        pusatKendali.getRobots();
        System.out.println();

        // coba menyerang dengan robot kecil saat bergabung
        pusatKendali.robotKecilSerang(robotKecil.get(1), monsters.get(2));

    }

}