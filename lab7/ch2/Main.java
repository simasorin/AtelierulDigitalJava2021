package lab7.ch2;

public class Main {
    public static void main(String[] args) throws Exception{
        BankAccount from = new BankAccount("BA1",23000);
        BankAccount to = new BankAccount("BA2",3000);

        TransactionThread ta1 = new TransactionThread("tr1",from,to,4000);
        TransactionThread ta2 = new TransactionThread("tr1",from,to,4000);

        ta1.start();
        ta2.start();

        ta1.join();
        ta2.join();

        System.out.println("after:");
        System.out.println(from);
        System.out.println(to);
    }
}