package lab3.visitor;

public class Video implements Element{
    private String name;
    private float price;
    private float minutes;

    public Video(String name, float price, float minutes){
        this.name = name;
        this.price = price;
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getMinutes() {
        return minutes;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}