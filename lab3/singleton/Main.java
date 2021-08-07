package lab3.singleton;

public class Main {
    public static void main(String[] args) {
        LazyInit li = LazyInit.getInstance();
        System.out.println(li);

        LazyInit li2 = LazyInit.getInstance();
        System.out.println(li2);

        LazyInit li3 = LazyInit.getInstance();
        System.out.println(li3);
    }
}