package Collections_Framework;

import java.util.*;

class Smartphone implements Comparable<Smartphone>
{
    String brand;
     String model;
     double price;
     int ram;
     int storage;
     boolean has5G;
     float screenSize;
     long imeiNumber;
     char grade;
     Date releaseDate;


    public Smartphone(String brand, String model, double price, int ram, int storage,
                      boolean has5G, float screenSize, long imeiNumber, char grade, Date releaseDate)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.storage = storage;
        this.has5G = has5G;
        this.screenSize = screenSize;
        this.imeiNumber = imeiNumber;
        this.grade = grade;
        this.releaseDate = releaseDate;
    }

    public int compareTo(Smartphone other)
    {
        if (this.price > other.price)
        {
            return  1 ;
        }
        else if (this.price < other.price)
        {
            return -1 ;
        }
        return  0 ;
    }

    @Override
    public String toString() {
        return "[" + brand + "," + model + "," + price + "," + ram + "," + storage + "," + has5G + "," + screenSize + "," + imeiNumber + "," + grade + "," + releaseDate + "]";
    }


}
