package 入門;

// 標準入力
import java.util.*;

public class Main19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        String data = sc.next();
        System.out.println("hello " + data);
        String text = sc.next();
        System.out.println(text + "です");
        int number = sc.nextInt();
        System.out.println(number * 10 + 20);
        }
    }
}
