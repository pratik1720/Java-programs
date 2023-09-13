import java.util.*;
public class arraydeqye {
  public static void main(String[] args) {
    ArrayDeque<Integer> d1=new ArrayDeque();
    d1.add(22);
    d1.add(42);
    d1.add(292);
    System.out.println(d1.getFirst());
    System.out.println(d1.getLast());

  }  
}
