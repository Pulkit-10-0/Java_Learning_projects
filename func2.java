
import java.util.Scanner;

public class func2 {
    public static int calculateSum(int a, int b ){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print(calculateSum( a,b));

    }
}
