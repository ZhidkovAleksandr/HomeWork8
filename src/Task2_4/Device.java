package Task2_4;

import java.util.Objects;

public class Device {

    private String manufacturer, serialNumber;
    private float price;

    public Device(String aManufacturer, String aSerialNumber, float aPrice){

        this.manufacturer = aManufacturer;
        this.serialNumber = aSerialNumber;
        this.price        = aPrice;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": manufacturer ="+ this.manufacturer
                + ", price="+this.price + ", serialNumber="+this.serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device other = (Device) obj;
        return price == other.price &&
                manufacturer.equals(other.manufacturer) && serialNumber.equals(other.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, serialNumber, price);
    }
}
