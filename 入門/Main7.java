package 入門;

// if文による条件分岐
public class Main7 {
	public static void main(String[] args) {
	    // int number = 1;
        int number = (int)(Math.random() * 2 + 1);
        if (number == 1) {
            System.out.println(number + "スキ！"); // 条件式が成立した時の処理
        } else {
            System.out.println(number + "キライ！"); //条件が成立しなかった時の処理
        }
        int number1 =(int)(Math.random() * 3 + 1);
		System.out.println("あなたの順位は" + number1 + "位です");
		// ここにif文を追加する
        if (number1 == 1){
            System.out.println("おめでとう！");
        }
	}
}

