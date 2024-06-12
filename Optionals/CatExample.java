package Optionals;

import java.util.Optional;

import javax.swing.text.html.Option;

public class CatExample{

    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("christian");

        if (optionalCat.isPresent()){
            System.out.println(optionalCat.get().getAge());
        } else {
            System.out.println(0);
        }

        Cat myCat = optionalCat.orElse(new Cat("UNKNOWN", 0));

        optionalCat.map(Cat::getAge) //leeres optinal wenn keine Katze drin
            .orElse(0);//wenn die katze da ist aber kein age hat
    }

    private static Optional<Cat> findCatByName(String name){
        Cat cat = new Cat(name, 4);
        
        return Optional.ofNullable(cat);
    }
}