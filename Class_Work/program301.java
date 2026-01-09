
import java.util.*;

class program301 {

    public static void main(String A[]) {

        Hashtable<String, Integer> hobj = new Hashtable<String, Integer>();

        hobj.put("PPA", 25000);
        hobj.put("LSP", 30000);
        hobj.put("Python", 35000);
        hobj.put("LB", 28000);

        System.out.println(hobj);

        System.out.println(hobj.get("LB"));

    }
}
