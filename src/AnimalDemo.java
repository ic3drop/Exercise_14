public class AnimalDemo {
    public static void main(String[] args) {
        HomeAnimal<Dog> dogHome = new HomeAnimal<>(new Dog());
        HomeAnimal<Cat> catHome = new HomeAnimal<>(new Cat());
        HomeAnimal<Shark> sharkHome = new HomeAnimal<>(new Shark());

        // Calling methods on Dog object
        dogHome.showClassType();
        dogHome.eatingBreakfast();
        dogHome.getAnimal().run();
        dogHome.getAnimal().speak();

        System.out.println();

        // Calling methods on Cat object
        catHome.showClassType();
        catHome.eatingBreakfast();
        catHome.getAnimal().run();
        catHome.getAnimal().speak();

        System.out.println();

        // Calling methods on Shark object
        sharkHome.showClassType();
        sharkHome.eatingBreakfast();
        sharkHome.getAnimal().run();
        sharkHome.getAnimal().speak();
    }
}
