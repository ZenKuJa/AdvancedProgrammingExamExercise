package Steffen.StreamAPI02;

import Steffen.JavaStreamAPI01.Queries;

public class Exercise {

  public static void main(String[] args) {

    FootballerQuerries queries = new FootballerQuerries(DataProvider.getFootballers());
    System.out.println(queries.getTotalOfAllGoalsByMidfielders());
    System.out.println(queries.getNameOfVfLWolfsburgFootballerWithMostPlayedGames());

    System.out.println(queries.getNamesOfAllFootballClubs().forEach(footballClub -> footballClub.name()));
    // implement exercise here
  }
}
