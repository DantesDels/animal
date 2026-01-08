public abstract class Animal {
    protected String name;
    protected int age;
    protected String sound;

    private String secret;

    public void makeSound() {
        System.out.println(sound);
    }

    public static void display() {
        System.out.println("All animals make sounds.");
    }

    public abstract void eat();

    public abstract void eat(int amount);

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }

    public String getName() {
        return name;
    }
}