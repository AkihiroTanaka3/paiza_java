package 入門;

// 2次元配列を作成する

public class Main22 {
    public static void main(String[] args) {
        String player = "忍者";
        String[] teamA = {player, "戦士", "魔法使い"};
        System.out.print(teamA[0] + ", ");
        System.out.print(teamA[1] + ", ");
        System.out.print(teamA[2]);
        System.out.println("");
        System.out.println("---");
        
        String[] teamB = {teamA[0], teamA[1], teamA[2]};
        System.out.print(teamB[0] + ", ");
        System.out.print(teamB[1] + ", ");
        System.out.print(teamB[2]);
        System.out.println("");
        System.out.println("---");
        
        String[] teamC = {"勇者", "戦士", "魔法使い"};
        String[] teamD = {"盗賊", "忍者", "商人"};
        String[] teamE = {"スライム", "ドラゴン", "魔王"};
        
        String[][] teams = {teamC, teamD, teamE};
        System.out.print(teams[1][0] + ", ");
        System.out.print(teams[2][1] + ", ");
        System.out.print(teams[0][0]);
        System.out.println("");
        System.out.println("---");

        String[] item1 = {"木の棒", "こん棒"};
        String[] item2 = {"おにぎり", "おにぎり"};
        String[] item3 = {"毒消し", "薬草"};

        // item1 ~ 3を、basket配列に代入してください。

        String[][] basket = {item1, item2, item3};
        System.out.println(basket[0][0]);
        System.out.println(basket[0][1]);
        System.out.println(basket[1][0]);
        System.out.println(basket[1][1]);
        System.out.println(basket[2][0]);
        System.out.println(basket[2][1]);
    }
}