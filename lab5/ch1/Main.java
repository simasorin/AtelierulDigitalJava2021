package lab5.ch1;

public class Main {
    public static void main(String[] args) throws Exception{
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        RON fromRon = new RON(10);
        USD toUsd = exchangeDesk.convert(fromRon, USD.class,4);
        System.out.println(toUsd);

        EUR toEur = exchangeDesk.convert(fromRon,EUR.class,5);
        System.out.println(toEur);
    }
}