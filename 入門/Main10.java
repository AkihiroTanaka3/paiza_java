package 入門;

// おみくじを作る
// 比較演算子  ==  >  <   >=  <=  !=
// 大吉  中吉  小吉  凶  大凶
public class Main10 {
	public static void main(String[] args) {
        int omikuji = (int)(Math.random() * 10 + 1);
        // System.out.println(omikuji);
        if (omikuji == 1) {
            System.out.println("大吉");
        } else if (omikuji == 2) {
            System.out.println("中吉");
        } else if (omikuji <= 4) {
            System.out.println("小吉"); //3,4
        } else if (omikuji <= 7) {
            System.out.println("凶"); //5,6,7
        } else {
            System.out.println("大凶");
        }

        int omikuji2 = (int)(Math.random() * 100 + 1);  // randomメソッドについては次のチャプターで説明します
		if (omikuji2 > 30) {
			System.out.println("omikujiの中身は" + omikuji2 + "なので大吉");
		} else {
			System.out.println("omikujiの中身は" + omikuji2 + "なので大凶");
		}
	}
}

