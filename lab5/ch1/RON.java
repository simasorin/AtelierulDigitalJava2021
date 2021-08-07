package lab5.ch1;

import lab5.ch1.Currency;

public class RON extends Currency {
    {
        super.setName("Romanian LEU");
    }

    public RON(){};

    public RON(float value) {
        super(value);
    }
}