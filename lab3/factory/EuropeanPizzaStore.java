package lab3.factory;

public class EuropeanPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type){
        Pizza pizza = null;

        switch(type){
            case "QuatroStagioni":
                pizza =  new QuatroStagioni();
                break;
            case "Margerita":
                pizza = new Margerita();
                break;
            default:
                pizza = new Margerita();
        }

        return pizza;
    }
}