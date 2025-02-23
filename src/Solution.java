import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cat = scanner.nextLine();

        if(cat.equals("мяу")) {
            Cat.sayHello();
            Dog.sayHello();
            Dog.catchCat();
        }
    }

    public static class Cat {
        public static void sayHello() {
            System.out.println("Мяу");
        }
    }

    public static class Dog {
        public static void sayHello() {
            System.out.println("Гав");
        }

        public static void catchCat() {
            System.out.println("Кошка поймана");
        }
    }
}
