package task2;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor(2,2) ;
        EthernetAdapter ethernetAdapter = new EthernetAdapter(2,"2");
        System.out.println(monitor.hashCode() );
        System.out.println(ethernetAdapter.hashCode() );
        System.out.println(monitor );
        System.out.println(ethernetAdapter );
        System.out.println(monitor.equals(ethernetAdapter ) );
    }
}
