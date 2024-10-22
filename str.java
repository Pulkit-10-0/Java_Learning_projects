import java.util.*;
public class str {
    public static void main(String[] args) {
        System.out.println("Input a string : ");
        
        Scanner sc = new Scanner(System.in);

        // By using sc.nextLine we can take input of two or more words together 
        // if we just use sc.next then only the first word (word before space) is taken as input

        String something = sc.nextLine();
        System.out.println("The input was: ");
        System.out.println(something);


        for (int i =0; i < something.length(); i++) {
            System.out.println(something.charAt(i));

        }


        String myStr1 = "aello";
String myStr2 = "zaaaahellozzzz";
System.out.println(myStr1.compareTo(myStr2));
    }
}
