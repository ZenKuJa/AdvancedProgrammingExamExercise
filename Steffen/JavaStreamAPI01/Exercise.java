package Steffen.JavaStreamAPI01;

public class Exercise {

  public static void main(String[] args) {
    ConsoleQueries queries = new ConsoleQueries(DataProvider.getConsoles());
    System.out.println(queries.getNumberOfConsolesFromNintendo());
    // make more queries as you wish
  }
}
