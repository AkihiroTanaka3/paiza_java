package 入門;

// 配列を作成する

public class Main21 {
    public static void main(String[] args) {
        String player_1 = "勇者";
        String player_2 = "魔法使い";
        
        System.out.println(player_1);
        System.out.println(player_2);
        
        String[] team = {"戦士", "忍者", player_1};
        System.out.println(team[0]);
        System.out.println(team[1]);
        System.out.println(team[2]);

        String[] array = {"戦士","侍","僧侶","魔法使い"};
        // この下で、arrayを出力してみよう
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);

        // 指定の文字を配列にする
        String item[] = {"ロングソード", "ブレードソード", "エクスカリバー"};
        System.out.println(item[0]);
        System.out.println(item[1]);
        System.out.println(item[2]);
    }
}
