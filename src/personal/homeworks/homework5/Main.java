package personal.homeworks.homework5;

public class Main {
    public static void main(String[] args) {
        Car supra = new Supra(50, 15, "12312sdasd123213");
        supra.start();
        supra.shiftGear(6);
        supra.drive(100);
        supra.stop();
        System.out.println(supra.getAvailableFuel());

        System.out.println("");
        Car mustang = new Mustang(50,18,"213123jfksdf12312");
        mustang.start();
        mustang.shiftGear(6);
        mustang.drive(1);
        mustang.stop();
        System.out.println(mustang.getAvailableFuel());

        System.out.println("");
        Car kuga = new Kuga(50,18,"213123jfksdf12312");
        kuga.start();
        kuga.shiftGear(6);
        kuga.drive(1);
        kuga.stop();
        System.out.println(kuga.getAvailableFuel());

        System.out.println("");
        Car rav4 = new Rav4(50,18,"213123jfksdf12312");
        rav4.start();
        rav4.shiftGear(6);
        rav4.drive(1);
        rav4.stop();
        System.out.println(rav4.getAvailableFuel());










    }
}
