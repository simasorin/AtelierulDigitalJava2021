package lab7.ch1;

public class RabbitRunnable implements Runnable {
    private int nr;
    public RabbitRunnable(int nr){
        this.nr=nr;
    }

    public void run(){
        System.out.println("Rabbit number:"+nr+"is running");
    }
}