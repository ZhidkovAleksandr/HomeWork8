package Task5;

import Task2_4.Device;

import java.util.Objects;

public class Animal {

    private String name;
    private int age;
    private boolean hasTail;

    public Animal(String aName, int aAge, boolean aHasTail){
        this.name       = aName;
        this.age        = aAge;
        this.hasTail    = aHasTail;
    }

    private String hasItTale(){
        return this.hasTail ? "так" : "ні";
    }

    @Override
    public String toString() {
        return "Ім'я: " + this.name + ", вік:" + this.age + ", хвіст:" + this.hasItTale();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal other = (Animal) obj;
        return this.age == other.age &&
                this.name.equals(other.name) && this.hasTail == other.hasTail;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hasTail);
    }

    public static void main(String[] args) {
        Animal Vaska = new Animal("Васька", 45, false);
        System.out.println(Vaska);
    }

}
