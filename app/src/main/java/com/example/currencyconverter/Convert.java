package com.example.currencyconverter;

public class Convert {
    public static double usdBDT(double usdB){
        usdB = usdB* 107;
        return usdB;
    }
    public static double bdtUSD(double bdtU){
        bdtU = bdtU/107;
        return bdtU;

    }
    public static double inrUSD(double inrU){
        inrU = inrU/87;
        return inrU;

    }
}
