package lab3.decorator;

public class Milk extends Topping {
    public Milk(Beverage mainBeverage) {
        super(" Milk ", 2, mainBeverage);
    }
}