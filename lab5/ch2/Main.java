package lab5.ch2;

public class Main {
    public static void main(String[] args) {
        Running running1 = new Running();
        Running running2 = new Running();

        Pair pair1 = new Pair(running1, running2);

        Boot boot = new Boot();
//        Pair<Running> pair2 = new Pair<>(running1, boot);
//        Boot boot2 = pair2.getSecond();
    }
}