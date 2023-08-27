package 入門;

// クラスを作成する

public class Main24 {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.walk();
    }
}
    
class Player { 
    public void walk() {
        System.out.println("勇者は荒野を歩いていた。");
    }
}

