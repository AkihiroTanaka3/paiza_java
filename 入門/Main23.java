package 入門;

// メソッドを作る

public class Main23 {
    public static void main(String[] args) {
        System.out.println("hello world");
        sayHello();
        sayHello("java");
        sayHello("abc");
    }
    
    public static void sayHello() {
        System.out.println("hello paiza");
    }
    public static void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
