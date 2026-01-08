public class Dog extends Animal {

    public Dog() {
        this.name = "Doglas";
    }

    @Override
    public void eat(){
        System.out.println("Bwarf Miam Miam");
    }

    @Override
    public void eat(int amount){
        System.out.println("Doglas is eating" + amount + "times");
    }
}
