/**
 * hellopattern
 */
public class hellopattern {
    public static void main(String[] args) {
        String s = "Hello";
        for (int i = 0; i <= s.length(); i++) {
            System.out.println(s.substring(0, i));
        }
    }
}