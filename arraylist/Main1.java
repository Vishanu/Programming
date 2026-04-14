package arraylist;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(1.1);
        al.add("vishnu");
        System.out.println(al);

        System.out.println(al.get(1));

        //Update
        // al.set(index, al)
        al.set(1,11.11);
        al.remove(1);

        System.out.println(al);
    }
}
