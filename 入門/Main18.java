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

        int i1 = 3;    // カウンタ変数の初期化
        while (i1 <= 10) {
            System.out.println("hello world " + i1);    // 繰り返し処理
            i1 = i1 + 2;    // カウンタ変数の更新
        }
        System.out.println ("last " + i1);

        int i2 = 2;
        while(i2 <= 10) {
            System.out.println(i2);
            i2 = i2 + 2;
        }
    }
}

