package Generics;


//Wenn ich was anderes als Integer printen möchte wäre das arsch
public class IntegerPrinter{
    Integer thingToPrint;

    public IntegerPrinter(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
    
    public void print(){
        System.out.println(thingToPrint);
    }
}