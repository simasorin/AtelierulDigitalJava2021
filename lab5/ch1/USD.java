package lab5.ch1;

import lab5.ch1.Currency;

public class USD extends Currency {
    {
        super.setName("American dolar");
    }

    public USD(){};

    public USD(float value) {
        super(value);
    }
}