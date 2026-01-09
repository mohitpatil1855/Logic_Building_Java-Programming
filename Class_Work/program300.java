
import java.util.*;

class program300 {

    public static void main(String A[]) {

        LinkedList<Double> lObj = new LinkedList<Double>();           //passing <Wrapper class>  ArrayList because it is generic

        lObj.add(10.5);
        lObj.add(8.54);
        lObj.add(45.58);
        lObj.add(89.57);
        lObj.add(61.25);

        System.out.println(lObj);

        lObj.addFirst(10.0);
        lObj.addLast(100.0);

        lObj.remove(2);

        System.out.println(lObj);

        Iterator iobj = lObj.iterator();

        while (iobj.hasNext()) {
            System.out.println(iobj.next());
        }

        lObj.clear();
    }
}
