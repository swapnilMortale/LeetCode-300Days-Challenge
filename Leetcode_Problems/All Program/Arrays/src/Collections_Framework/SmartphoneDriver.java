package Collections_Framework;

import java.util.*;

public class SmartphoneDriver
{
    public static void main(String[] args)
    {
        ArrayList<Smartphone> smartphones = new ArrayList<>();

        smartphones.add(new Smartphone("Samsung", "Galaxy S23", 999.99, 8, 256, true, 6.1f, 123456789012345L, 'A', new Date()));
        smartphones.add(new Smartphone("Apple", "iPhone 15", 1199.99, 6, 128, true, 6.1f, 987654321098765L, 'A', new Date()));
        smartphones.add(new Smartphone("Samsung", "Galaxy S23", 999.99, 8, 256, true, 6.1f, 123456789012345L, 'A', new Date()));
        smartphones.add(new Smartphone("Google", "Pixel 8", 699.99, 8, 128, true, 6.2f, 555555555555555L, 'B', new Date()));
        smartphones.add(new Smartphone("Apple", "iPhone 15", 1199.99, 6, 128, true, 6.1f, 987654321098765L, 'A', new Date()));
        smartphones.add(new Smartphone("OnePlus", "Nord 3", 449.99, 12, 256, true, 6.7f, 111111111111111L, 'B', new Date()));
        smartphones.add(new Smartphone("Xiaomi", "Redmi Note 12", 299.99, 6, 64, false, 6.5f, 999999999999999L, 'C', new Date()));
        smartphones.add(new Smartphone("Realme", "GT Neo 3", 399.99, 8, 128, true, 6.7f, 666666666666666L, 'B', new Date()));
        smartphones.add(new Smartphone("Oppo", "Reno 8 Pro", 549.99, 12, 256, true, 6.7f, 777777777777777L, 'A', new Date()));
        smartphones.add(new Smartphone("Vivo", "V25 Pro", 479.99, 8, 256, true, 6.56f, 888888888888888L, 'B', new Date()));
        smartphones.add(new Smartphone("Nothing", "Phone 2", 599.99, 12, 256, true, 6.7f, 121212121212121L, 'A', new Date()));
        smartphones.add(new Smartphone("Motorola", "Edge 30 Ultra", 749.99, 12, 512, true, 6.67f, 131313131313131L, 'A', new Date()));
        smartphones.add(new Smartphone("Nokia", "G60", 299.99, 6, 128, true, 6.58f, 141414141414141L, 'C', new Date()));
        smartphones.add(new Smartphone("Honor", "Magic 5 Pro", 899.99, 12, 512, true, 6.81f, 151515151515151L, 'A', new Date()));
        smartphones.add(new Smartphone("Asus", "ROG Phone 7", 999.99, 16, 512, true, 6.78f, 161616161616161L, 'A', new Date()));
        smartphones.add(new Smartphone("Sony", "Xperia 1 V", 1299.99, 12, 256, true, 6.5f, 171717171717171L, 'A', new Date()));
        smartphones.add(new Smartphone("LG", "Wing", 799.99, 8, 256, true, 6.8f, 181818181818181L, 'B', new Date()));
        smartphones.add(new Smartphone("HTC", "U23 Pro", 499.99, 8, 256, true, 6.7f, 191919191919191L, 'B', new Date()));
        smartphones.add(new Smartphone("BlackBerry", "Key2", 649.99, 6, 128, true, 4.5f, 202020202020202L, 'C', new Date()));
        smartphones.add(new Smartphone("CAT", "S62 Pro", 599.99, 6, 128, true, 5.7f, 212121212121212L, 'B', new Date()));
        smartphones.add(new Smartphone("Google", "Pixel 8 Pro", 999.99, 12, 512, true, 6.7f, 303030303030303L, 'A', new Date()));
        smartphones.add(new Smartphone("OnePlus", "11 Pro", 899.99, 16, 512, true, 6.7f, 313131313131313L, 'A', new Date()));

        System.out.println("Higest Price of Mobile is :"+ Collections.max(smartphones));

//        for (Object sm : smartphones)
//        {
//            System.out.println(sm);
//        }

        //Search an Smartphone Xiaomi and store both position and phone
        int position = -1;
        Smartphone xiaomiPhone = null;

        for (int i = 0; i < smartphones.size(); i++)
        {
            if (smartphones.get(i).brand.equals("Xiaomi"))
            {
                position = i;
                xiaomiPhone = smartphones.get(i);
                break;
            }
        }

        if (position != -1) {
            System.out.println("Xiaomi Mobile Found at position : " + position + " - " + xiaomiPhone);
        } else {
            System.out.println("Xiaomi mobile not found!");
        }

        System.out.println("=========================================================");


        // Reverse ArrayList
        ListIterator<Smartphone> iterator = smartphones.listIterator(smartphones.size());
        while (iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }

        System.out.println("=========================================================");

        // Remove Duplicates

        for (int i = 0; i < smartphones.size(); i++)
        {
            for (int j = i+1; j < smartphones.size(); j++)
            {
                if (smartphones.get(i).brand.equals(smartphones.get(j).brand))
                {
                    smartphones.remove(j) ;
                    j-- ;
                }
            }
        }
        ListIterator<Smartphone> iterator1 = smartphones.listIterator(smartphones.size());
        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }
        System.out.println("---------------------------------------------------------------------------------");

        //Sort the ArrayList (Manual Sort)
        for (int i = 0; i < smartphones.size(); i++)
        {
            for (int j = 0; j < smartphones.size() - 1 - i; j++)
            {
                if (smartphones.get(j).price > smartphones.get(j+1).price)
                {
                    Smartphone temp = smartphones.get(j);
                    smartphones.set(j, smartphones.get(j+1));
                    smartphones.set(j+1, temp);
                }
            }
        }
//        System.out.println(smartphones);

        System.out.println("=------------------------=-=-=---------------------==-=-==--=--=---=-=--=-=-=-=-=--==-");



        ArrayList<Smartphone> smartphones1 = new ArrayList<>() ;

        smartphones1.add(new Smartphone("Fairphone", "Fairphone 4", 649.99, 8, 256, true, 6.3f, 222222222222222L, 'B', new Date()));
        smartphones1.add(new Smartphone("Tecno", "Camon 19 Pro", 349.99, 8, 256, true, 6.8f, 232323232323232L, 'C', new Date()));
        smartphones1.add(new Smartphone("Infinix", "Zero Ultra", 449.99, 8, 256, true, 6.8f, 242424242424242L, 'B', new Date()));
        smartphones1.add(new Smartphone("Micromax", "IN Note 2", 199.99, 4, 64, false, 6.43f, 252525252525252L, 'C', new Date()));
        smartphones1.add(new Smartphone("Lava", "Agni 2", 249.99, 8, 128, true, 6.78f, 262626262626262L, 'C', new Date()));
        smartphones1.add(new Smartphone("Xiaomi", "Mi 13 Ultra", 1199.99, 16, 1024, true, 6.73f, 272727272727272L, 'A', new Date()));
        smartphones1.add(new Smartphone("Samsung", "Galaxy Z Fold5", 1799.99, 12, 1024, true, 7.6f, 282828282828282L, 'A', new Date()));
        smartphones1.add(new Smartphone("Apple", "iPhone 15 Pro Max", 1599.99, 8, 1024, true, 6.7f, 292929292929292L, 'A', new Date()));

        //        Merge Two ArrayLists
        ArrayList<Smartphone> list = new ArrayList<>() ;
        list.addAll(smartphones);
        list.addAll(smartphones1) ;


        // Compare Two ArrayLists

        for (int i = 0; i < smartphones.size(); i++)
        {
            for (int j = 0; j < smartphones1.size(); j++)
            {
                if (smartphones.get(i).brand.equals(smartphones1.get(j).brand))
                {
                    System.out.println(smartphones.get(i));
                }
            }
        }

        System.out.println("====================================================================================");
        //Get Second Largest Number
        Smartphone first = null , second = null ;
        for (Smartphone phone : smartphones) {
            if (first == null || phone.price > first.price)
            {
                second = first ;
                first = phone ;
            }
            else if ((second == null || phone.price > second.price) && phone.price != first.price)
            {
                second = phone;
            }
        }
        System.out.println("Second Max is : "+second);

        // Rotate ArrayList

        System.out.println("--------------------------------------------------------------------------------");

        for (Smartphone smartphone : smartphones)
        {
            System.out.println(smartphone);
        }
        System.out.println("==============================================================================================");
        for (int i = 0; i < 3; i++)
        {
            Smartphone temp = smartphones.remove(0) ;
            smartphones.add(temp);
        }
        for (Smartphone s : smartphones)
        {
            System.out.println(s);
        }

        System.out.println("__________________________________________________________________________________________");

        //

        ListIterator<Smartphone> smartphoneListIterator = smartphones.listIterator(smartphones.size()) ;
        while (smartphoneListIterator.hasPrevious())
        {
            System.out.println(smartphoneListIterator.previous());
        }


    }
}
