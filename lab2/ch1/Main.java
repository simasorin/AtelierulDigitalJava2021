package lab2.ch1;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Fighter1", 100, 30);
        Fighter f2 = new Fighter("Fighter2",100, 40);
        BoxingMatch boxingMatch = new BoxingMatch(f1,f2);
        System.out.println("Winner = " + boxingMatch.fight());
    }
}