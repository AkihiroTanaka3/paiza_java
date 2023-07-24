// 整数を受け取る
import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String text = scan.nextLine(); // 改行を含む文字列を読み込むためnext()からnextLine()に変更
            System.out.println(text);
            int number = scan.nextInt();
            System.out.println(number * 10);
            System.out.println("おこづかい" + number + "円");
            System.out.println("リンゴが" + number + "個");
        }
    }
}

