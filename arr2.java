import java.util.*;
public class arr2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i =0; i< size; i++){
            System.out.println("insert:");

        numbers[i] = sc.nextInt();
        }
        System.out.println("");

        System.out.println("Loading the array... ");
        for (int i =0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
