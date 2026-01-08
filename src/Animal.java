public abstract class Animal {
    protected String name;
    protected int age;
    protected String sound;

    public void makeSound() {
        System.out.println(sound);
    }

    public static void display() {
        System.out.println("All animals make sounds.");
    }

    public abstract void eat();

    public abstract void eat(int amount);
}