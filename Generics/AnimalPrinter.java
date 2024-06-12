package Generics;

public class AnimalPrinter <T extends Animal>{
    T animal;

    public AnimalPrinter(T animal) {
        this.animal = animal;
    }

    public void print(){
        System.out.println(animal.getName());
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
