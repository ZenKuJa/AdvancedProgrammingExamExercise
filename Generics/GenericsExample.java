package Generics;

import java.util.ArrayList;

public class GenericsExample{

    public static void main(String[] args) {
        IntegerPrinter intPrinter = new IntegerPrinter(42);
        intPrinter.print();

        GenericPrinter<Integer> genIntPrinter = new GenericPrinter<>(43);
        genIntPrinter.print();

        GenericPrinter<String> genStrPrinter = new GenericPrinter<>("Neo");
        genStrPrinter.print();

        ArrayList<Integer> myIntArrayList = new ArrayList<>();
        myIntArrayList.add(10);
        myIntArrayList.add(112);
        //myIntArrayList.add("Christian"); <- funktioniert nicht


        ArrayList<Cat> myCats = new ArrayList<>();
        myCats.add(new Cat("Isabella", 6));

        AnimalPrinter<Animal> catPrinter = new AnimalPrinter<>(myCats.get(0));
        catPrinter.print();

        catPrinter.setAnimal(new Dog("Matheo", 4));
        catPrinter.print();

        shout("Bibi", "BeautyPalace");
        shout(38, "Euro");
        shout(69L, 420);
        shout(420.69, "Haha Funny Number");
    }

    private static <T, V> T shout (T thingToShout, V otherThingToShout){
        System.err.println(thingToShout+ " "+ otherThingToShout + "!!!!!!!!!!!!!!!!!!!");
        return thingToShout;
    }
}