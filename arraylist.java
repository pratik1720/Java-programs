import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);
        l2.add(20);
        l2.add(56);
        l2.add(40);
        l2.add(22);
        l1.add(3);
        l1.add(1);
        l1.add(4);
        l1.add(6);
        l1.add(3);
        l1.add(9);
        l1.addAll(l2);
       // l1.clear();
       System.out.println(l1.indexOf(1));
       System.out.println(l1.lastIndexOf(3));
       System.out.println(l1.contains(7));
       l1.set(0, 17);
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(" ");
        }

    }
}
