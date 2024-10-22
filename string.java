public class string {
    
    public static void main(String[] args) {
        String txt = "hello this is a test string";
        System.out.println("length of string:" + txt.length());
        System.out.println("string in upper case: " + txt.toUpperCase());
        System.out.println("string in lower case:" + txt.toLowerCase());
    
    // Finding a Character in a String 
    String Htxt = "this is a new test string";
    System.out.println(Htxt.indexOf("new"));

    // concat 

    String one = "hello";
    String two = "world";
    String result = one.concat(" ").concat(two);
    System.out.println(result);

    System.out.println(one.contains("ll"));
        System.out.println(one.compareTo(one));
        System.out.println(one.equals(two));
    }
}


