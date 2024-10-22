
import java.util.*;
public class switch_code {
    public static void main(String[] args) {
        System.out.println("Enter  a number from 1-3:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1:System.out.println("Hello!");
            break;
            case 2: System.out.println("Namaste!");
            break;
            case 3:System.out.println("Bonjour!");
            break;
            default: System.out.println("not a valid input!");
        }
        sc.close();
        
    }
}
