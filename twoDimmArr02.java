import java.util.*;

public class twoDimmArr02 {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows = sc.nextInt();
        System.out.println("Enter no. of columns");
        int col = sc.nextInt();
        
        int [][] numbers  = new int [rows][col];
        for (int i =0 ; i<rows; i++) {
            for (int j=0; j<col; j++) {
                numbers [i][j] = sc.nextInt();
            }
        }
        System.out.println("loading the array ... ");

        for (int i =0; i<rows; i++) {
            for (int j =0; j<col; j++) {
                System.out.print(numbers[i][j] +" ");

            }
            System.out.println("");
        }

        System.out.println("enter the element you want to look for:");
       int  x = sc.nextInt();
        for (int i =0; i<rows; i++) {
            for (int j =0; j<col; j++)
            if (numbers[i][j] == x ){
                System.out.println("found " + x + "at location : " + i + "," +j );
            }
        }

    }
}
