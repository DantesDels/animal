public class Cow extends Animal {

    public Cow() {
        this.name = "Cow";
        this.age = 45;
        this.sound = "Meuh";
    }

    @Override
    public void eat() {
        System.out.println("MeuhMiam Bleurgh");
    }

    @Override
    public void eat(int amount){
        System.out.println("MeuhMeuh is eating " + amount + " things");
    }
}
