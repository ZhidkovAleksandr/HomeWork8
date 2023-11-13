package Task2_4;

public class Main {
    public static void main(String[] args) {
        Device firstDev = new Device("Samsung", "AB1234567CD", 120);
        Monitor firstMonitor = new Monitor("Samsung","AB1234567CD", 120, 1280, 1024);

        Monitor secondMonitor = new Monitor("Samsung","AB1234567CD", 120, 1280, 1024);
        Monitor thirdMonitor = new Monitor("LG","EF1234567CD", 120, 1280, 1024);

        Device secondDev = new Device("Samsung", "AB1234567CD", 120);

        EthernetAdapter someAdapter = new EthernetAdapter("ASUS", "XY12785", 24, 100, "468AVHC7");

        System.out.println(firstDev.equals(secondDev));
        System.out.println(firstMonitor.equals(secondMonitor));
        System.out.println(firstMonitor.equals(thirdMonitor));

        System.out.println(firstDev);
        System.out.println(firstMonitor);
        System.out.println(someAdapter);

        System.out.println(firstDev.hashCode());
        System.out.println(firstMonitor.hashCode());
        System.out.println(someAdapter.hashCode());

    }
}