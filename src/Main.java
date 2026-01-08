import java.net.URI;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Dog dog = new Dog();
        cow.makeSound(); // instance methode
        Animal.display(); // static methode
        cow.eat();
        dog.eat();
        dog.eat(12);
        cow.eat(32);
        dog.setSecret("Dog said DOOM.");
        // URL : https://www.youtube.com/watch?v=hriqT9QRqmk
        System.out.println(dog.getSecret());
        dog.play();
    }
}