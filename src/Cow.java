public class Cow extends Animal implements Pet {

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

    @Override
    public void plays(){
        System.out.println("Cow says 'Ouaf Ouaf'");
        System.out.println("Because of that, cow dies from a stroke");
    }
}
