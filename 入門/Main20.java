package 入門;

// 標準入力とループ処理
import java.util.*;

public class Main20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int count = sc.nextInt();
        // System.out.println("データ個数 " + count);
        
            String data;
            for (int i = 0; i < count; i++) {
                data = sc.next();
                System.out.println(data + "は、スライムを攻撃した");
            }
        }
    }
}