package AnimalRescue;

public class FosterParent {
    String name = "Mary";
    String gender = "female";
    int age = 6;
    String prefers = "dogs";
    double moneyAmount = 100;

    public void adopt(String dogName){
        System.out.println("I want " + dogName + " !");
    }
    public void hugs(){
        System.out.println("What a cute puppy !");
    }
    public void feed(){
        System.out.println("Are you hungry ?");
    }
}
