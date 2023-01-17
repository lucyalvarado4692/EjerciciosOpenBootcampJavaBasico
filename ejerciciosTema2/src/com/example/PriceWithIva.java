package com.example;

public class PriceWithIva {
    public static void main(String[] args) {
        double result = priceWithIva(999.99);
        System.out.println(result);
    }

    static double priceWithIva(double d) {

        double iva = d * 0.20;
        return d + iva;
    }

}
