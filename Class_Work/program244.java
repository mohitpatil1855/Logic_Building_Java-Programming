import java.util.*;

class StringX 
{

    public void Display(String str) 
    {
        int iCnt = 0;

        for (iCnt = 0; iCnt < str.length(); iCnt++) {
            System.out.println(str.charAt(iCnt));
        }
    }
}

class program244 {

    public static void main(String A[]) {

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();     //sobj is the String.. which is the object of String class

        StringX strObj = new StringX();

        strObj.Display(sobj);   //passing the Hash code(0X100) which refers to string
    }
}
