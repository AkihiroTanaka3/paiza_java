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
	}
}
