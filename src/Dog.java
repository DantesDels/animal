public class Dog extends Animal implements Pet {

    public Dog() {
        this.name = "Doglas";
    }

    @Override
    public void eat(){
        System.out.println("Bwarf Miam Miam");
    }

    @Override
    public void eat(int amount){
        System.out.println("Doglas is eating " + amount + " times");
    }

    @Override
    public void plays(){
        System.out.println("Dog plays with the Ball");
    }
}
