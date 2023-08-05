package 入門;

// if文による条件分岐　else if
public class Main8 {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 3 + 1);
		if (number == 1) {
			System.out.println("スキ！");		// 条件式が成立したときの処理
		} else if (number == 2) {
		    System.out.println("どちらでもない"); //条件式２が成立した時の処理
		} else {
			System.out.println("キライ");		// 条件式が成立しなかったときの処理
		}
        int number1 = (int)(Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		// ここにif文を追加する
		if (number1 == 1) {
		    System.out.println("おめでとう！");
		} else if (number1 == 2) {
		    System.out.println("あと少し！");
		} else {
		    System.out.println("よくがんばったね");
		}
	}
}
