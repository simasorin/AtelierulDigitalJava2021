package lab7.ch2;

public class TransactionThread extends Thread{
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount){
        this.name=name;
        this.from=from;
        this.to=to;
        this.amount=amount;
    }

    public void run(){
        transfer(from,to,amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount){
        synchronized (from) {
            from.withdraw(amount);
            synchronized (to) {
                to.deposit(amount);
            }
        }
    }
}