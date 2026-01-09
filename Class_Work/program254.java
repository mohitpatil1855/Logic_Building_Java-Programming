
import java.util.*;

class StringX {

    public String Update(String str) {

        char Arr[] = str.toCharArray();

        Arr[0] = '_';

        return new String(Arr);  //directly return the new string

    }
}

class program254 {

    public static void main(String A[]) {

        // String sRet = null;                      //not using
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        StringX strObj = new StringX();

        sobj = strObj.Update(sobj);       //using sobj instead of sRet        //not preferable

        System.out.println("Updated string is :" + sobj);

    }
}
