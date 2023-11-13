package Task2_4;

import java.util.Objects;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;
    public EthernetAdapter(String aManufacturer, String aSerialNumber, float aPrice, int aSpeed, String aMac) {
        super(aManufacturer, aSerialNumber, aPrice);
        this.speed = aSpeed;
        this.mac   = aMac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "manufacturer ="+ super.getManufacturer()
                + ", price="+super.getPrice() + ", serialNumber="+super.getSerialNumber()
                + ", speed="+this.speed + ", mac="+ this.mac;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter other = (EthernetAdapter) obj;
        return super.equals(obj) &&
                this.speed == other.speed && this.mac.equals(other.mac);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(speed, mac);
    }
}
