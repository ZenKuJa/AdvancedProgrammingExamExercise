package Steffen.JavaStreamAPI01;

public class Exercise {

  public static void main(String[] args) {
    Queries queries = new Queries(DataProvider.getConsoles());
    //System.out.println(queries.getNumberOfConsolesFromNintendo());
    //System.out.println(queries.getTotalSoldUnitsInMillionsPerMaker());
    // make more queries as you wish
    
    DataProvider.getConsoles().forEach(console -> {System.out.println(console.maker());});
  }
}

