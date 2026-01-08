import java.util.ArrayList;
import java.util.List;

public class Owner {

    private String name;
    private List<Animal> animals;

    public Owner() {
        this.name = "Paul";
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void showAnimals() {
        System.out.println(name + "'s animals :");
        for (Animal pet : animals) {
            System.out.println("- " + pet.getName());
        }
    }
}
