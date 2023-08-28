package 入門;

// クラスを作成する

public class Main24 {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.walk();
        // この下でGreetingオブジェクトをつくり、メソッドを呼び出す
        Greeting greeting1 = new Greeting();
        greeting1.sayHello();
        Greeting greeting2 = new Greeting();
        greeting2.sayHello("java");
        Greeting greeting3 = new Greeting();
        greeting3.sayHello("paiza");
    }
}
    
class Player { 
    public void walk() {
        System.out.println("勇者は荒野を歩いていた。");
    }
}

class Greeting {
    public void sayHello() {
        System.out.println("hello paiza");
    }
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}

