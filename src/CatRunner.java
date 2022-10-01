public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("James", 4, 55.4);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Emily",8,45.3);
        cat2.introduce();
        cat2.printCatInfo();

    }
}
