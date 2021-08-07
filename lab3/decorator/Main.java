package lab3.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator");
        Beverage coffee = new Coffee();
        coffee = new Milk(coffee);
        coffee = new Chocolate((coffee));

        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

    }
}