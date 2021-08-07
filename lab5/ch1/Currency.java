package lab5.ch1;

public abstract class Currency {
    private String name;
    private float value;

    public Currency(){};

    public Currency(float value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}