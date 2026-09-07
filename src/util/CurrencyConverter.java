package util;

public class CurrencyConverter {

    public static final double IOF_PERCENTAGE = 0.06;

    public static double dollarConverterWithIof(double dollarPrice, double dollarQuantity){
        return dollarPrice * dollarQuantity * (1.0 + IOF_PERCENTAGE);
    }

}
