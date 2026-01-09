//change capital to small

import java.util.*;

class StringX {

    public String toLowerX(String str) {
        int iCnt = 0;

        char Arr[] = str.toCharArray();

        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            if (Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z') {
                Arr[iCnt] = (char) (Arr[iCnt] + 32);      //type casting with char
            }
        }
        return new String(Arr);  //directly return the new string

    }
}

class program255 {

    public static void main(String A[]) {

        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        StringX strObj = new StringX();

        sRet = strObj.toLowerX(sobj);

        System.out.println("Updated string is :" + sRet);

    }
}
