package lab3.factory;

public class Pizza {
    private String name;
    private String daugh;
    private String topping;

    public Pizza(String name, String daugh, String topping) {
        this.name = name;
        this.daugh = daugh;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", daugh='" + daugh + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }

    public void bake(){
        System.out.println("Bake pizza " + name );
    }


    public void cut(){
        System.out.println("Cut pizza " + name );
    }

    public void box(){
        System.out.println("Box pizza " + name );
    }
}