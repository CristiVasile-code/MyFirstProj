package AnimalRescue;

public class AnimalRescue {
    public static void main(String[] args) {
    Dog Buddy = new Dog();
    FosterParent Mary = new FosterParent();
    Food food = new Food();
    Vet doctor = new Vet();

        //System.out.println(Buddy.name);
        System.out.println(Mary.name);
        Mary.adopt(Buddy.name);
        Buddy.bark();
        System.out.println(Buddy.hunger);
        System.out.println(food.hunger(Buddy.hunger));
        System.out.println(doctor.Heal(Buddy.healthLevels));
    }
}
