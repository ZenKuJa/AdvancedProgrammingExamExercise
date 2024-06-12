package Steffen.JavaStreamAPI01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ConsoleQueries{

    List<Console> consoles;

    public ConsoleQueries(ArrayList<Console> consoles){
        this.consoles = consoles;
    }

    public List<String> getAllCurrentConsoleNames(){
        
        return consoles.stream()
            .filter(console -> console.lifespan() == -1)
            .map(console -> console.title())
            .toList();
    }

    public List<Console> getAllConsolesByLifespan(){

        Comparator<Console> lifeSpanAscending = 
            (console1, console2) -> Integer.compare(console1.lifespan(), console2.lifespan());

        return consoles.stream()
            .sorted(lifeSpanAscending)
            .collect(Collectors.toList());
    }

    public boolean isAnyConsoleWithMoreThan150MillionSoldUnits(){
        return consoles.stream()
            .anyMatch(console -> console.soldUnitsInMillions() > 150);

    }

    public boolean isAllConsolesWithMoreThan50MillionSoldUnits(){
        return consoles.stream()
            .allMatch(console -> console.soldUnitsInMillions() > 50);
    }

    public long getNumberOfConsolesFromNintendo(){
        return consoles.stream()
            .filter(console -> console.maker().equals(Maker.NINTENDO))
            .count();
    }
}
