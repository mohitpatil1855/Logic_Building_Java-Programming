
import java.util.*;

class program299 {

    public static void main(String A[]) {

        ArrayList<String> aObj = new ArrayList<String>();           //passing <Wrapper class>  ArrayList because it is generic

        aObj.add("c");
        aObj.add("C++");
        aObj.add("Java");
        aObj.add("Python");
        aObj.add("C#");
        aObj.add("Python");

        System.out.println(aObj);

        aObj.add(2, "AI_ML");

        System.out.println(aObj);

        System.out.println(aObj.contains("Java"));   //check element

        System.out.println(aObj.contains("DSA"));

        aObj.remove(6);

        System.out.println(aObj);

        Iterator iobj = aObj.iterator();

        while (iobj.hasNext()) {
            System.out.println(iobj.next());
        }

        aObj.clear();
    }
}
