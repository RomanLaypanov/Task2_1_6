public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.sayHello();
        dog.sayHello();
        dog.catchCat(cat);
    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу");
        }
    }

    public static class Dog {

        public void sayHello() {
            System.out.println("Гав");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");

            Cat cat1 = new Cat();
            Dog dog1 = new Dog();

            dog1.sayHello();
            cat1.sayHello();
        }
    }
}
