package lab3.decorator;

public abstract class Topping extends Beverage {
    private Beverage mainBeverage;

    public Topping(String description, int cost, Beverage mainBeverage) {
        super(description, cost);
        this.mainBeverage = mainBeverage;
    }

    public int getCost(){
        return super.getCost() + mainBeverage.getCost();
    }

    public String getDescription(){
        return super.getDescription() + " " + mainBeverage.getDescription();
    }
}