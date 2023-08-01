// 複数のデータを受け取る
import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
        int count = scan.nextInt();
        System.out.println(count + "回");
        
        for (int i = 0; i < count; i ++) {
            String name = scan.next();
            System.out.println("Hello " + name);
            }
        }
    }
}

