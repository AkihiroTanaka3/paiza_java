// 条件に合わせて処理を変える
import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
        int number = scan.nextInt();
        System.out.println(number);
        
            if (number == 10) {
                System.out.println("Welcome");
            } else if (number > 10) {
                System.out.println("Good morning");
            } else {
                System.out.println("Goodbye");
            }
            if (number > 100) {
                System.out.println(number);
            } else {
                System.out.println("100以下です");
            }
            if (number == 100) {
                System.out.println(number);
            } else if (number > 100) {
                System.out.println("100より大きい");
            } else {
                System.out.println("100より小さい");
            }
        }
    }
}
