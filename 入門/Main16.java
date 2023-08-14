package 入門;

// データ型

public class Main16 {
    public static void main(String[] args) {
         System.out.println(10/3);
         System.out.println(10/3.0);
         
         double number1 = 3.14;
         System.out.println(number1);
         System.out.println((int)number1);
         
         int number2 =3;
         System.out.println(number2);
         System.out.println((double)number2);
         
         String text = "123";
         System.out.println(text);
         System.out.println(Integer.parseInt(text) * 10);
         System.out.println(Double.parseDouble(text) * 10);
    }
}

