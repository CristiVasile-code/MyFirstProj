package AnimalRescue;

public class Food {
    String foodName = "Krantz";
    String type = "dry food";
    double cost = 5;
    int hungerLevel = 2;

    public int hunger(int hunger){
        return hunger = hunger - hungerLevel ;
    }
}
