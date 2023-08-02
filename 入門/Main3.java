package 入門;

// 数の表示とサイコロ
public class Main3 {
	public static void main(String[] args) {
		double rand = Math.random() * 100 + 1;
		System.out.println(rand);
		int number = (int)rand; //型変換
// 		System.out.println(number);
		System.out.println("スライムが" + number + "匹あらわれた");
	}
}

