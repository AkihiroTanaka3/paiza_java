package 入門;

// 値段を計算する
public class Main5 {
	public static void main(String[] args) {
		int apple_price = (int)(Math.random() * 3 + 1) * 100; // リンゴの単価
		int apple_num = (int)(Math.random() * 10 + 1); // リンゴを買う数
		System.out.println("リンゴの単価:" + apple_price + "円");
		System.out.println("リンゴを買う数:" + apple_num + "個");
		
		int total = apple_price * apple_num;
		System.out.println("合計金額:" + total + "円");

        int number =(int)(Math.random() * 10 + 1);	// 匹数 1 ～ 10
        System.out.println("体重100キロのスライムが、" + number + "匹あらわれた。");
        // 合計体重 =匹数 × 100
        int total1 = number * 100;
        System.out.println("スライムの合計体重は、" + total1 + "キロです。");
	}
}

