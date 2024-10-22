public class loop {
public static void main(String[] args) {

    System.out.println("First Loop");
    for (int i =0; i<=10; i++) {
        System.out.println(i);
    }
    System.out.println("nested loop ");
    for (int i=1;i<=2; i++) {
        System.out.println("outer:" + i);
        for (int j =1; j<=3; j++){
            System.out.println("inner" + j );
        }
    }
    
}    
}
