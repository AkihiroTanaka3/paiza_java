package 入門;

// 標準入力とループ処理
import java.util.*;

public class Main20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int count1 = sc.nextInt();
        // System.out.println("データ個数 " + count);
        int count = sc.nextInt();

            for (int j = 0; j < count1; j++) {
            System.out.println("スライムがあらわれた");
            }
            System.out.println("スライムの数は" + count1 + "匹です");
        
            String data;
            for (int i = 0; i < count; i++) {
                data = sc.next();
                System.out.println(data + "は、スライムを攻撃した");
            }

            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            
            for (int i = number1; i <= number2; i++) {
                System.out.println(i);
            }
        }
    }
}