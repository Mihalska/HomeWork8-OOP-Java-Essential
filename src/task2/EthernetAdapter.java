package task2;

public class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(int speed, String mac) {
        super("Samsung", 120, "AB1234567CD" );
        this.speed = speed;
        this.mac = mac;
    }
    @Override
    public  String toString() {
        return String.format("Device: manufacturer = %s,price = %d,serialNumber =%s, X=%d,Y=%s", getManufacturer() ,(int)getPrice() , getSerialNumber(), speed , mac  );
    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter ethernetAdapter = (EthernetAdapter) obj;
        if (speed != ethernetAdapter.speed) return false;
        if (getPrice() != ethernetAdapter.getPrice()) return false;
        if (getManufacturer() != null && getManufacturer().equals(ethernetAdapter.getManufacturer() ) ) return true ;
        if (getSerialNumber() != null && getSerialNumber() .equals(ethernetAdapter.getSerialNumber() ) ) return true ;
        if (mac != null && mac .equals(ethernetAdapter.mac  ) ) return true ;
        return true ;
        }

        @Override
        public int hashCode () {
            final int prime = 31;
            int result = 1;
            result = prime * result + speed  ;
            result = prime * result +Float.floatToIntBits(getPrice() );
            result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
            result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber() .hashCode());
            result = prime * result + ((mac == null ) ? 0 : mac.hashCode() );
            return result ;
        }




}
