//replace first letter with '_'

import java.util.*;

class StringX {

    public String Update(String str) {

        char Arr[] = str.toCharArray();

        Arr[0] = '_';

        String temp = new String(Arr);   //create new temp string and store updated

        return temp;

    }
}

class program252 {

    public static void main(String A[]) {

        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        StringX strObj = new StringX();

        sRet = strObj.Update(sobj);

        System.out.println("Updated string is :" + sRet);

    }
}
