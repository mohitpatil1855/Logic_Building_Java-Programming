
import java.io.*;
import java.util.*;

class program73 {

    public static void main(String A[]) throws IOException {
        int iNo = 0;
        int i = 0;
        Scanner sobj = new Scanner(System.in);

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));  //checked exception

        System.out.println("Enter the Number: ");

        try {
            iNo = Integer.parseInt(bobj.readLine());
         
    }

    catch (IOException iobj) {

        }

        for (i = 1; i <= (iNo / 2); i++) {
            if ((iNo % i) == 0) {
                System.out.println(i);

            }
        }
    }
}
