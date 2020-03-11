
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Kgaugelo Ramaramela
 * @version 1.0..0
 * @since 8 MArch 2020$
 */
public class DataDemo {

    private static void add() {

        List<Integer> bello = new ArrayList<>();
        bello.add(1);
        bello.add(2);
        bello.add(3);
        bello.add(3);
        bello.add(null);
        System.out.println("bellon : "+bello);

        bello.remove(3);
        System.out.println("bellon : "+bello);

        bello.add(0,99);
        System.out.println("bellon : "+bello);

        bello.set(0,9);
        System.out.println("bellon : "+bello);

        //Bulk opperations
        Collection<Integer> bello1 = new ArrayList<>();
        bello1.add(9);
        bello1.add(2);

        bello.removeAll(bello1);
        System.out.println("bellon : "+bello);

        bello1.add(1);

        bello.retainAll(bello1);
        System.out.println("bellon : "+bello);

        bello.addAll(bello1);
        System.out.println("bellon : "+bello);

        System.out.println("bello.set(2,4) : "+bello.set(2,4));


        //Search
        System.out.println("bello.contains(1) : "+bello.contains(1));
        System.out.println("bello.indexOf(1) : "+bello.indexOf(1));
        System.out.println("bello.lastIndexOf(1) : "+bello.lastIndexOf(1));
        System.out.println("bello : "+bello);

        //Range View
        List<Integer> bello2 = bello.subList(2,3);
        bello2.set(0,6);
        System.out.println("bello : "+bello);
        bello2.add(0,7);
        System.out.println("bello : "+bello);
        bello.set(2,8);
        System.out.println("bello2 : "+bello2);
//        bello.add(0,5);
//        System.out.println("bello2 : "+bello2);



    }

    public static void main(String[] args) {
        add();
    }

}
