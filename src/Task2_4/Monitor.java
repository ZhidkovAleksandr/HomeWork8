package Task2_4;

import java.util.Objects;

public class Monitor extends Device{
    private int resolutionX, resolutionY;

    public Monitor(String aManufacturer, String aSerialNumber, float aPrice, int aResolutionX, int aResolutionY) {
        super(aManufacturer, aSerialNumber, aPrice);
        this.resolutionX = aResolutionX;
        this.resolutionY = aResolutionY;

    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": manufacturer ="+ super.getManufacturer()
                + ", price="+super.getPrice() + ", serialNumber="+super.getSerialNumber()
                + ", X="+this.resolutionX + ", Y="+ this.resolutionY;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor other = (Monitor) obj;
        return super.equals(obj) &&
                this.resolutionX == other.resolutionX && this.resolutionY == other.resolutionY;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(resolutionX, resolutionY);
    }
}
