public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;

    private String AgeRange;

    // constructor
    public Cat(String catName, int catAge, double catWeight) {
        name = catName;
        age = catAge;
        weight = catWeight;
    }

    // method that introduces the Cat
    public void introduce() {
        if (age < 7) {
            AgeRange = " and I am a younger cat.";
        } else {
            AgeRange = " and I am a older cat.";
        }
        System.out.println("Hello my name is " + name + AgeRange);
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}
