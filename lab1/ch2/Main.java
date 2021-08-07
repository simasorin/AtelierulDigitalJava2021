package lab1.ch2;

public class Main {
    public static void main(String[] args) {
        FooBarQix foo = new FooBarQix();
        for(int i=0;i<=100;i++)
            System.out.println(i+" "+foo.compute(i));
    }
}