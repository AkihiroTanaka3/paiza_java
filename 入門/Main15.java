package 入門;

// 条件の評価結果

public class Main15 {
    public static void main(String[] args) {
        int number = 1;
        boolean flag = number ==1;
        if (flag) {
            System.out.println("スキ！");
        } else {
            System.out.println("キライ");
        }
        System.out.println(flag);
    }
}


// Javaでは、「条件が成立したとき」と「成立しなかったとき」といった状態を専用のデータ型で表します。条件が成立したときの状態を「真」または「true」(トゥルー)と呼びます。そして、条件が成立しなかったときの状態を「偽」または「false」(フォールス)と呼びます。

// - 条件が成立したとき：真、true
// - 条件が成立しなかったとき：偽、false


// if文の条件は、論理演算です。たとえば、次のようなな条件は、number変数の値によって、条件が成立したり、成立しなかったりします。

// number変数が「1」の場合
// - number == 1 true
// - number <= 10 true
// - number >= 10 false
// - number < 10 true
// - number > 10 false

// number変数が「10」の場合
// - number == 1 false
// - number <= 10 true
// - number >= 10 true
// - number < 10 false
// - number > 10 false

// 論理演算は、評価の結果として、trueかfalseを返します。


