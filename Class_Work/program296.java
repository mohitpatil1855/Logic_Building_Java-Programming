
import java.util.*;

class program295 {

    public static void main(String A[]) {

        Vector<Integer> vobj = new Vector<Integer>();           //passing <Wrapper class>  vector because it is generic

        vobj.add(11);
        vobj.add(21);
        vobj.add(51);
        vobj.add(101);
        vobj.add(111);

        System.out.println(vobj);  //[11, 21, 51, 101, 111]

        vobj.add(2, 10);

        System.out.println(vobj);  //[11, 21, 10, 51, 101, 111]

        System.out.println(vobj.capacity());      //check capacity

        System.out.println(vobj.contains(101));   //check element

        System.out.println(vobj.contains(102));

    }
}
