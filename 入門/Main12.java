package 入門;

// 西暦年から平成年を求める
import java.util.Calendar;
public class Main12 {
	public static void main(String[] args) {
	    Calendar calendar = Calendar.getInstance();
	    int seireki = calendar.get(Calendar.YEAR);
        // int seireki = 2000;
        System.out.print("西暦" + seireki + "年は、");
        
        // 平成年から西暦年を求めるには、平成年に「1988」を足します
        // 　例)
        // 　平成1年に「1988」を足すと、1989 > 平成1年は1989年
        // 　平成2年に「1988」を足すと、1990 > 平成2年は1990年
        // 　平成3年に「1988」を足すと、1990 > 平成3年は1991年
        // 　平成12年に「1988」を足すと、2000 > 平成12年は2000年
        // 　平成27年に「1988」を足すと、2015 > 平成27年は2015年
        // 西暦年から平成年を求めるには、これとは逆に、西暦年から「1988」を引きます。
        // 　例)
        // 　西暦1989年から「1988」を引くと、1 > 1989年は平成1年
        // 　西暦1990年から「1988」を引くと、2 > 1990年は平成2年
        // 　西暦1991年から「1988」を引くと、3 > 1991年は平成3年
        // 　西暦2000年から「1988」を引くと、12 > 2000年は平成12年
        // 　西暦2015年から「1988」を引くと、27 > 2015年は平成27年
        int heisei = seireki - 1988;
        System.out.println("平成" + heisei + "年です。");

        // 西暦年から昭和年を求める
		int seireki1 = (int)(Math.random() * 63 + 1926);
		System.out.print("西暦" + seireki1 + "年は");

		// 昭和年を計算
		int showa = seireki1 - 1925;
		System.out.println("昭和" + showa + "年です。");

	}
}

