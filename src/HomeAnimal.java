class HomeAnimal<T extends Animal & Dog.Run & Dog.Speak> {
    private T animal;

    public HomeAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void showClassType() {
        System.out.println("Type: " + animal.getClass().getSimpleName());
    }

    public void eatingBreakfast() {
        System.out.println(animal.getClass().getSimpleName() + " is eating breakfast");
    }
}

