package lab5.ch1;

import lab5.ch1.Currency;

public class ExchangeDesk {

    public <F extends Currency,T extends  Currency>T convert(F from, Class<T> toClass, float rate) throws Exception {
        T result = null;

        float currentValue = from.getValue();
        result = toClass.getDeclaredConstructor().newInstance();
        result.setValue(currentValue * rate);

        return result;
    };
}