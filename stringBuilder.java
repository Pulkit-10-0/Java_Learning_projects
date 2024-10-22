public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        System.out.println(sb.charAt(2));
        sb.setCharAt(2, 'h');
        System.out.println(sb);
    
    sb.insert(0,'s');
    System.out.println(sb);
    sb.delete(0,1);
    System.out.println(sb);

    sb.append('y');
    System.out.println(sb);


    // reversing a string !!!!!!!!!

    StringBuilder nsb = new StringBuilder("hello");
    for (int i =0; i < nsb.length()/2 ; i++) {
        int front = i;
        int back =nsb.length() -1-i;
        char frontchar = nsb.charAt(front);
        char backchar = nsb.charAt(back);

        nsb.setCharAt (front, backchar);
        nsb.setCharAt(back, frontchar);
        System.out.println(nsb);
    }

    
    }

}
