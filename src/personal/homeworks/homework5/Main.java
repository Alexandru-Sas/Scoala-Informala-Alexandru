package personal.homeworks.homework5;

public class Main {
    public static void main(String[] args) {

        System.out.println("");
        Car kuga = new Kuga(50,18,"213123jfksdf12312");
        kuga.start();
        kuga.shiftGear(6);
        kuga.drive(1);
        kuga.shiftGear(5);
        kuga.drive(2);
        kuga.stop();
        kuga.start();

        System.out.println("");
        Car mustang = new Mustang(50,20, "123123dfsdf234214");
        mustang.start();
        mustang.shiftGear(1);
        mustang.drive(1);
        mustang.shiftGear(2);
        mustang.drive(2);
        mustang.shiftGear(3);
        mustang.drive(1);
        mustang.shiftGear(4);
        mustang.drive(2);
        mustang.shiftGear(5);
        mustang.drive(1);
        mustang.shiftGear(6);
        mustang.drive(1);
        mustang.drive(50);
        mustang.stop();
        mustang.start();












    }
}
