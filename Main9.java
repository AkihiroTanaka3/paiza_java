// 文字列の一致を判定する
import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
        String name = scan.next();
        System.out.println("Hello " + name);
        
            if (name.equals("Java")) {
                System.out.println("Welcom");
            } else if (name.equals("JAVA")) {
                System.out.println("Good morning");
            } else {
                System.out.println("Goodbye");
            }
            if (name.equals("Hello")) {
            System.out.println("こんにちは");
            }
        }
    }
    
}
