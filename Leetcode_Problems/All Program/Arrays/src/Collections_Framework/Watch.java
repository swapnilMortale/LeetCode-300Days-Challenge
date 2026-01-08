package Collections_Framework;

import java.util.Comparator;

public class Watch implements Comparable<Watch>
{
    String brand ;
    String model ;
    double prise ;
    String color ;


    public Watch()
    {

    }

    public Watch(String brand, String model, double prise, String color) {
        this.brand = brand;
        this.model = model;
        this.prise = prise;
        this.color = color;
    }

    @Override
    public int compareTo(Watch o) {
        return 0;
    }

    public String toString()
    {
        return "["+brand+", "+model+", "+prise+", "+color+"]";
    }



}
