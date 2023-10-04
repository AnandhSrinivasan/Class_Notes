package examples;

import java.util.ArrayList;
import java.util.Iterator;

public class Q2_Array_Elements {

    public static void main(String[] args) {
        ArrayList<Integer> value = new ArrayList<>();

        value.add(1);
        value.add(2);
        //value.add(3);
        //value.add(4);
        //value.add(5);
        //value.add(6);
        System.out.println("Using an for loop method:");
        for (Integer val : value) {
            System.out.println(value);
            }
        System.out.println("\nUsing an Iterator method:");
        Iterator<Integer> iterator = value.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
