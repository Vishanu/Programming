package practicejava.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class FindingTheLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(20);

        System.out.println(al);
        int x = Collections.max(al);
        int y = Collections.min(al);
        System.out.println(x);
        System.out.println(y);

        boolean value = al.contains(10);
        System.out.println(value);

        Collections.sort(al);
        System.out.println(al);


        //descending order
        // Collections.reverse(al);
        // System.out.println(al);

        //OR

        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);

    }
}
