package lab3.factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Pattern");
        AmericanPizzaStore americanPizzaStore =
                new AmericanPizzaStore();
        EuropeanPizzaStore europeanPizzaStore =
                new EuropeanPizzaStore();

        System.out.println(
                americanPizzaStore.orderPizza("ChickenPizza"));
        System.out.println(
                europeanPizzaStore.orderPizza("Margerita"));

    }
}