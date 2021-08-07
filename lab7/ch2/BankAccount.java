package lab7.ch2;

public class BankAccount {
    private String name;
    private double debit;

    public BankAccount(String name, double debit){
        this.name=name;
        this.debit=debit;
    }

    void withdraw(double amount){
        longDatabaseCall();
        debit = debit - amount;
    }

    void deposit(double amount){
        longDatabaseCall();
        debit = debit + amount;
    }

    void longDatabaseCall(){
        try{
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", debit=" + debit +
                '}';
    }
}