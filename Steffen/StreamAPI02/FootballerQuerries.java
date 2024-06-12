package Steffen.StreamAPI02;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.swing.text.html.Option;

public record FootballerQuerries(List<Footballer> footballers) {

    public int getTotalOfAllGoalsByMidfielders(){

        
        return footballers.stream()
            .filter(footballer -> footballer.position().equals(Position.MIDFIELDER))
            .mapToInt(footballer -> footballer.numberOfGoals())
            .sum();
    }

    public Optional<Footballer> getNameOfVfLWolfsburgFootballerWithMostPlayedGames(){

        Predicate<Footballer> isFromWolfsburg = footballer ->
            footballer.footballClub().equals(new FootballClub("VfL Wolfsburg", 3, 1145));
        
        Comparator<Footballer> sortNumberOfGamesAscending =
            (footballer1, footballer2) -> Integer.valueOf(footballer1.numberOfGames()).compareTo(footballer2.numberOfGames());

        Comparator<Footballer> sortNumberOfGoalsAscending =
            (footballer1, footballer2) -> Integer.valueOf(footballer1.numberOfGoals()).compareTo(Integer.valueOf(footballer2.numberOfGoals()));
        
        
        return footballers.stream()
            .filter(isFromWolfsburg)
            .max(sortNumberOfGamesAscending);
    }

    public List<FootballClub> getNamesOfAllFootballClubs(){
        return footballers.stream()
            .map(footballer -> footballer.footballClub())
            .distinct()
            .collect(Collectors.toList());
    }

}
