// 条件に一致したら処理を実行する
import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int number = scan.nextInt();
            System.out.println(number);
            
            if (number == 10) {
                System.out.println("Welcome");
            }
        }
    }
}
