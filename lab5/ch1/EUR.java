package lab5.ch1;

import lab5.ch1.Currency;

public class EUR extends Currency {
    {
        super.setName("European currency");
    }

    public EUR(){};

    public EUR(float value){

        super(value);
    }
}