package task2;

public class Monitor extends Device {
    int resolutionX = 1280;
    int resolutionY = 1024;

    Monitor(int resolutionX, int resolutionY) {
        super("Samsung", 120, "AB1234567CD");
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return String.format("Device: manufacturer = %s,price = %d,serialNumber =%s, X=%d,Y=%d", getManufacturer(), (int) getPrice(), getSerialNumber(), resolutionX , resolutionY );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor monitor = (Monitor) obj;
       if (resolutionX  != monitor.resolutionX ) return false;
       if (resolutionY != monitor.resolutionY ) return false ;
       if (getPrice() != monitor .getPrice()) return false;
       if (getManufacturer() != null && getManufacturer().equals(monitor .getManufacturer() ) ) return true ;
       if (getSerialNumber() != null && getSerialNumber() .equals(monitor .getSerialNumber() ) ) return true ;
     return true;
}
    @Override
    public int hashCode () {
    final int prime = 31;
     int result = 1;
     result = prime * result + resolutionX ;
     result = prime * result + resolutionY ;
     result = prime * result + Float.floatToIntBits(getPrice()) ;
     result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
     result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber() .hashCode());


   return result ;
    }

}
