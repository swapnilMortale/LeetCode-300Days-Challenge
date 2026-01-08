package Collections_Dsa.ArrayList;

public class ArrayListDriver
{
        public static void main(String[] args)
        {
            ArrayList<Integer> intList = new ArrayList<>();

            intList.add(10);
            intList.add(20);
            intList.add(30);
            System.out.println(intList); // [10, 20, 30]

            intList.addFirst(5);
            intList.addLast(40);
            System.out.println(intList); // [5,10,20,30,40]

            intList.remove((Integer)20);
            System.out.println(intList); // [5,10,30,40]


            System.out.println("\n------------- STRING ------");
            ArrayList<String> strList = new ArrayList<>();

            strList.add("A");
            strList.add("B");
            strList.add("C");
            System.out.println(strList); // [A, B, C]

            strList.add(1, "X");
            System.out.println(strList); // [A, X, B, C]

            strList.remove("B");
            System.out.println(strList); // [A, X, C]

            System.out.println(strList.contain("C")); // true
            System.out.println(strList.indexOf("X")); // 1


            System.out.println("\n===== DOUBLE TEST =====");
            ArrayList<Double> dblList = new ArrayList<>();

            dblList.add(1.1);
            dblList.add(2.2);
            dblList.add(3.3);
            System.out.println(dblList); // [1.1, 2.2, 3.3]

            dblList.set(1, 9.9);
            System.out.println(dblList); // [1.1, 9.9, 3.3]

            System.out.println(dblList.reversed()); // [3.3, 9.9, 1.1]


            System.out.println("\n===== CHARACTER TEST =====");
            ArrayList<Character> charList = new ArrayList<>();

            charList.add('A');
            charList.add('B');
            charList.add('C');
            System.out.println(charList); // [A, B, C]

            charList.remove(1);
            System.out.println(charList); // [A, C]


            System.out.println("\n===== BOOLEAN TEST =====");
            ArrayList<Boolean> boolList = new ArrayList<>();

            boolList.add(true);
            boolList.add(false);
            boolList.add(true);
            System.out.println(boolList); // [true, false, true]

            boolList.remove(false);
            System.out.println(boolList); // [true, true]



            ArrayList<String> names = new ArrayList<>();
            names.add("A"); names.add("B"); names.add("C"); names.add("D");

            System.out.println(names.subList(1, 3)); // [B, C]

            ArrayList<String> extra = new ArrayList<>();
            extra.add("X"); extra.add("Y");

            names.addAll(extra);
            System.out.println(names); // [A,B,C,D,X,Y]

            names.removeAll(extra);
            System.out.println(names); // [A,B,C,D]

            ArrayList<String> keep = new ArrayList<>();
            keep.add("A");
            keep.add("C");

            names.retainAll(keep);
            System.out.println(names); // [A, C]


            ArrayList<Integer> itList = new ArrayList<>();
            itList.add(10);
            itList.add(20);
            itList.add(30);

            Iterator<Integer> itr = itList.iterator();
            while (itr.hasNext()) {
                System.out.print(itr.next() + " "); // 10 20 30
            }

            ArrayList<Integer> last = new ArrayList<>();
            last.add(1); last.add(2); last.add(3);

            Object[] arr = last.toArray();
            for (Object o : arr) System.out.print(o + " "); // 1 2 3

            last.clear();
            System.out.println("\n" + last); // []
        }
}
