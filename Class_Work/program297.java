
import java.util.*;

class program297 {

    public static void main(String A[]) {

        Vector<String> vobj = new Vector<String>();           //passing <Wrapper class>  vector because it is generic

        vobj.add("c");
        vobj.add("C++");
        vobj.add("Java");
        vobj.add("Python");
        vobj.add("C#");
        vobj.add("Python");

        System.out.println(vobj);

        vobj.add(2, "AI_ML");

        System.out.println(vobj);

        System.out.println(vobj.capacity());      //check capacity

        System.out.println(vobj.contains("Java"));   //check element

        System.out.println(vobj.contains("DSA"));

        vobj.remove(6);

        System.out.println(vobj);
    }
}
