package 入門;

// 複数の条件を組み合わせる - AND

public class Main13 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10 + 1);
        // int number2 = 1;
        if (number1 <= 8 && number1 >= 3) {
            System.out.println(number1 + "スキ！"); //条件が成立した時
        } else {
            System.out.println(number1 + "キライ"); //条件が成立しなかった時
        }
        
        double rand = Math.random() * 100 + 1;
        int number3 = (int)rand;
        System.out.println(number3);
        if (number3 >= 30 && number3 <= 60) {
            System.out.println("あたり");
        } else {
            System.out.println("残念");
        }

        double rand2 = (Math.random() * 10) + 1;
        int number = (int) rand2;
        System.out.println("あなたの順位は" + number + "位です");

        //　ここにifを追加する
        if (number <= 5 && number >= 2) {
            System.out.println("あと少し");
        }
    }
}

