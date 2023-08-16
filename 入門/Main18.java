package 入門;

// whileによるループ処理

public class Main18 {
    public static void main(String[] args) {
        int i = 0; // カウンタ変数の初期化
        while (i <= 5) {
            System.out.println("hello world" + i); // 繰り返し処理
            i = i + 1; // カウンタ変数の更新
        }
        System.out.println("last " + i);

        int j = 0;
        while (j < 10) {
        System.out.println("ハローpaizaラーニング" + j);
        j = j + 1;
        }

        int k = 0;
        while(k < 16) {
            System.out.println(k);
            k = k + 1;
        }
    }
}

