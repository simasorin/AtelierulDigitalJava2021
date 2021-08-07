package lab7;

public class Main {
    public static int v = 0;

    public static void main(String[] args) throws Exception {
        System.out.println("before="+v);
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                v++;
                System.out.println(":::");
            }
        };
        for(int i=0;i<500;i++){
            (new Thread(runnable)).start();
        }
        Thread.sleep(300);
        System.out.println("after="+v);
    }
}