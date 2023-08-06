package 入門;

// if文による条件分岐　比較演算子
public class Main9 {
	public static void main(String[] args) {
		int time = (int)(Math.random() * 24 + 1);
		    System.out.print(time + "時です。");
		if (time < 12) {
		    System.out.println("午前中");
		} else if (time == 12) {
		    System.out.println("正午");
		} else if (time > 12) {
		    System.out.println("午後");
		}

        int age = (int)(Math.random() * 5 + 18);
		System.out.print(age + "才は");
		// ここにif文を追加する
		if (age < 20) {
		    System.out.println("飲酒不可");
		} else if (age >= 20) {
		    System.out.println("飲酒可能");
		}

        int place = (int)(Math.random() * 12+ 1);
		System.out.print(place + "位");
		// ここにif文を追加する
		if (place < 7) {
			System.out.println("入賞");
		} else {
			System.out.println("入賞圏外");
		}
	}
}
