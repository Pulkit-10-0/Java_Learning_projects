
import java.util.Scanner;

/*  function syntax ------ < ReturnType FunctionName( Type arg1, Type arg2 .......) {
        operations }                        */


public class func1 {
    public static void printMyName(String name ) {
        System.out.println("your name is: "+name);
        return;
    }
    public static void main(String[] args) {
        System.out.println("enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
 
        printMyName(name);
            
        




    }
}
