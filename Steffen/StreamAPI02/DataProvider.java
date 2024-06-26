package Steffen.StreamAPI02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

  public static ArrayList<Footballer> getFootballers() {
    FootballClub vflWolfsburg = new FootballClub("VfL Wolfsburg", 3, 1145);
    FootballClub eintrachtFrankfurt = new FootballClub("Eintracht Frankfurt", 1, 1500);
    FootballClub chelseaFC = new FootballClub("Chelsea FC", -1, -1);
    FootballClub olympiqueLyon = new FootballClub("Olympique Lyon", -1, -1);
    FootballClub bayernMuenchen = new FootballClub("Bayern Muenchen", 4, 1058);

    return new ArrayList<>(
        List.of(
            new Footballer(
                "Merle Frohms",
                Position.GOALKEEPER,
                LocalDate.of(1995, 1, 28),
                173,
                vflWolfsburg,
                41,
                0),
            new Footballer(
                "Svenja Huth",
                Position.MIDFIELDER,
                LocalDate.of(1991, 1, 25),
                163,
                vflWolfsburg,
                81,
                14),
            new Footballer(
                "Kathrin Hendrich",
                Position.DEFENDER,
                LocalDate.of(1992, 4, 6),
                174,
                vflWolfsburg,
                59,
                5),
            new Footballer(
                "Sara Doorsoun",
                Position.DEFENDER,
                LocalDate.of(1991, 11, 17),
                170,
                eintrachtFrankfurt,
                46,
                1),
            new Footballer(
                "Felicitas Rauch",
                Position.DEFENDER,
                LocalDate.of(1996, 4, 30),
                170,
                vflWolfsburg,
                34,
                4),
            new Footballer(
                "Melanie Leupolz",
                Position.MIDFIELDER,
                LocalDate.of(1994, 4, 14),
                173,
                chelseaFC,
                79,
                13),
            new Footballer(
                "Sara Daebritz",
                Position.MIDFIELDER,
                LocalDate.of(1995, 2, 15),
                171,
                olympiqueLyon,
                98,
                17),
            new Footballer(
                "Lina Magull",
                Position.MIDFIELDER,
                LocalDate.of(1994, 8, 15),
                164,
                bayernMuenchen,
                73,
                22),
            new Footballer(
                "Jule Brand",
                Position.MIDFIELDER,
                LocalDate.of(2002, 10, 16),
                177,
                vflWolfsburg,
                33,
                7),
            new Footballer(
                "Klara Buehl",
                Position.STRIKER,
                LocalDate.of(2000, 12, 7),
                173,
                bayernMuenchen,
                36,
                15),
            new Footballer(
                "Alexandra Popp",
                Position.STRIKER,
                LocalDate.of(1991, 4, 6),
                174,
                vflWolfsburg,
                129,
                64)));
  }
}
