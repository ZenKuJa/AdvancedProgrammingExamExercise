package Steffen.Generics01;
public class Exercise{

  public static  void main(String[] args) {
    Crate myCrate = new Crate();

    try {
      myCrate.insertBottle(new BeerBottle(), 1);
      myCrate.insertBottle(new BeerBottle(), 2);
      myCrate.insertBottle(new WineBottle(), 3);
      myCrate.insertBottle(new WineBottle(), 6);

      if (myCrate.takeBottle(1) instanceof BeerBottle beerBottle){
        beerBottle.chugALug();
      }
    } catch (Exception e) {
      // TODO Auto-generated catch block
      System.out.println(e.getMessage());
    }
  }
}
