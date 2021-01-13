package com.ashunevich.conversionlibrary;

import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class UnitConverter {
    private static void conversionMultiplier(TextView resultValue, double value, double multiplier){
        NumberFormat formatter = new DecimalFormat("###.#######################");
        resultValue.setText(String.valueOf(formatter.format(value * multiplier)));
    }

    public static void ConvertValues(String unitConvertFrom, String unitConvertTo , Double valueToConvert, TextView resultValue) {
        final double NineDivFive = 9.0/5.0;
        final double FiveDivNine = 5.0/9.0;
        /*
        final double PI = Math.PI;
        double radDiam = enteredValue/2;
        double radCirc = enteredValue/(2*PI);
        double radArea = Math.sqrt(enteredValue/PI);
        double radSphArea = Math.sqrt(enteredValue/4*PI);
        double radSphVolume = Math.pow(((enteredValue/PI)*(3.0/4.0)),1.0/3.0);
        */
        NumberFormat formatter = new DecimalFormat("###.#######################");
        //0.000000000000386102158
        switch (unitConvertFrom) {
            // area
            case "Square millimeter":
                switch (unitConvertTo) {
                    case "Square millimeter": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Square centimeter": conversionMultiplier(resultValue, valueToConvert,0.01);break;
                    case "Square meter": conversionMultiplier(resultValue, valueToConvert, 0.000001);break;
                    case "Square kilometer": conversionMultiplier(resultValue, valueToConvert,0.000000000001);break;
                    case "Hectare": conversionMultiplier(resultValue, valueToConvert, 0.0000000001);break;
                    case "Square mile": conversionMultiplier(resultValue, valueToConvert,0.0000000000003861021585);break;
                    case "Acre": conversionMultiplier(resultValue, valueToConvert, 0.0000000002471053814);break;
                    case "Square yard": conversionMultiplier(resultValue, valueToConvert, 0.000001196);break;
                    case "Square feet": conversionMultiplier(resultValue, valueToConvert,0.0000107639);break;
                    case "Square inch": conversionMultiplier(resultValue, valueToConvert, 0.0015500031);break;
                }
                break;
            case "Square centimeter":
                switch (unitConvertTo) {
                    case "Square millimeter": conversionMultiplier(resultValue, valueToConvert, 100);break;
                    case "Square centimeter": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Square meter": conversionMultiplier(resultValue, valueToConvert, 0.0001);break;
                    case "Square kilometer": conversionMultiplier(resultValue, valueToConvert, 0.0000000001);break;
                    case "Hectare": conversionMultiplier(resultValue, valueToConvert, 0.00000001);break;
                    case "Square mile": conversionMultiplier(resultValue, valueToConvert, 0.00000000003861021585);break;
                    case "Acre": conversionMultiplier(resultValue, valueToConvert, 0.00000002471053814);break;
                    case "Square yard": conversionMultiplier(resultValue, valueToConvert, 0.000119599);break;
                    case "Square feet": conversionMultiplier(resultValue, valueToConvert, 0.001076391);break;
                    case "Square inch": conversionMultiplier(resultValue, valueToConvert, 0.15500031);break;
                }
                break;
            case "Square meter":
                switch (unitConvertTo) {
                    case "Square millimeter": conversionMultiplier(resultValue, valueToConvert, 1000000.0);break;
                    case "Square centimeter": conversionMultiplier(resultValue, valueToConvert, 10000.0);break;
                    case "Square meter": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Square kilometer": conversionMultiplier(resultValue, valueToConvert, 0.000001);break;
                    case "Hectare": conversionMultiplier(resultValue, valueToConvert, 0.0001);break;
                    case "Square mile": conversionMultiplier(resultValue, valueToConvert, 0.0000003861021585);break;
                    case "Acre": conversionMultiplier(resultValue, valueToConvert, 0.0002471054);break;
                    case "Square yard": conversionMultiplier(resultValue, valueToConvert, 1.1959900463);break;
                    case "Square feet": conversionMultiplier(resultValue, valueToConvert, 10.763910417);break;
                    case "Square inch": conversionMultiplier(resultValue, valueToConvert, 1550.0031);break;
                }
                break;
            case "Square kilometer":
                switch (unitConvertTo) {
                    case "Square millimeter": conversionMultiplier(resultValue, valueToConvert, 1000000000000.0);break;
                    case "Square centimeter": conversionMultiplier(resultValue, valueToConvert, 10000000000.0);break;
                    case "Square meter": conversionMultiplier(resultValue, valueToConvert, 1000000.0);break;
                    case "Square kilometer": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Hectare": conversionMultiplier(resultValue, valueToConvert, 100.0);break;
                    case "Square mile": conversionMultiplier(resultValue, valueToConvert, 0.3861021585);break;
                    case "Acre": conversionMultiplier(resultValue, valueToConvert, 247.10538147);break;
                    case "Square yard": conversionMultiplier(resultValue, valueToConvert, 1195990.0463);break;
                    case "Square feet": conversionMultiplier(resultValue, valueToConvert, 10763910.417);break;
                    case "Square inch": conversionMultiplier(resultValue, valueToConvert, 1550003100);break;
                }
                break;
            case "Hectare":
                switch (unitConvertTo) {
                    case "Square millimeter": conversionMultiplier(resultValue, valueToConvert, 10000000000.0);break;
                    case "Square centimeter": conversionMultiplier(resultValue, valueToConvert, 100000000);break;
                    case "Square meter": conversionMultiplier(resultValue, valueToConvert, 10000);break;
                    case "Square kilometer": conversionMultiplier(resultValue, valueToConvert, 0.01);break;
                    case "Hectare": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Square mile": conversionMultiplier(resultValue, valueToConvert, 0.0038610216);break;
                    case "Acre": conversionMultiplier(resultValue, valueToConvert, 2.4710538147);break;
                    case "Square yard": conversionMultiplier(resultValue, valueToConvert, 11959.900463);break;
                    case "Square feet": conversionMultiplier(resultValue, valueToConvert, 107639.10417);break;
                    case "Square inch": conversionMultiplier(resultValue, valueToConvert, 15500031);break;
                }
                break;
            case "Square mile":
                switch (unitConvertTo) {
                    case "Square millimeter": conversionMultiplier(resultValue, valueToConvert, 2589988110336.0);break;
                    case "Square centimeter": conversionMultiplier(resultValue, valueToConvert, 25899881103.0);break;
                    case "Square meter": conversionMultiplier(resultValue, valueToConvert, 2589988.1103);break;
                    case "Square kilometer": conversionMultiplier(resultValue, valueToConvert, 2.5899881103);break;
                    case "Hectare": conversionMultiplier(resultValue, valueToConvert, 258.99881103);break;
                    case "Square mile": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Acre": conversionMultiplier(resultValue, valueToConvert, 640);break;
                    case "Square yard": conversionMultiplier(resultValue, valueToConvert, 3097600);break;
                    case "Square feet": conversionMultiplier(resultValue, valueToConvert, 27878400);break;
                    case "Square inch": conversionMultiplier(resultValue, valueToConvert, 4014489600.0);break;
                }
                break;
            case "Acre":
                switch (unitConvertTo) {
                    case "Square millimeter": conversionMultiplier(resultValue, valueToConvert, 4046856422.4);break;
                    case "Square centimeter": conversionMultiplier(resultValue, valueToConvert, 40468564.224);break;
                    case "Square meter": conversionMultiplier(resultValue, valueToConvert, 4046.8564224);break;
                    case "Square kilometer": conversionMultiplier(resultValue, valueToConvert, 0.0040468564);break;
                    case "Hectare": conversionMultiplier(resultValue, valueToConvert, 0.4046856422);break;
                    case "Square mile": conversionMultiplier(resultValue, valueToConvert, 0.0015625);break;
                    case "Acre": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Square yard": conversionMultiplier(resultValue, valueToConvert, 4840);break;
                    case "Square feet": conversionMultiplier(resultValue, valueToConvert, 43560);break;
                    case "Square inch": conversionMultiplier(resultValue, valueToConvert, 6272640);break;
                }
                break;
            case "Square yard":
                switch (unitConvertTo) {
                    case "Square millimeter": conversionMultiplier(resultValue, valueToConvert, 836127.36);break;
                    case "Square centimeter": conversionMultiplier(resultValue, valueToConvert, 8361.2736);break;
                    case "Square meter": conversionMultiplier(resultValue, valueToConvert, 0.83612736);break;
                    case "Square kilometer": conversionMultiplier(resultValue, valueToConvert, 0.0000008361273599);break;
                    case "Hectare": conversionMultiplier(resultValue, valueToConvert, 0.0000836127);break;
                    case "Square mile": conversionMultiplier(resultValue, valueToConvert, 0.0000003228305785);break;
                    case "Acre": conversionMultiplier(resultValue, valueToConvert, 0.0002066116);break;
                    case "Square yard": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Square feet": conversionMultiplier(resultValue, valueToConvert, 9);break;
                    case "Square inch": conversionMultiplier(resultValue, valueToConvert, 1296);break;
                }
                break;
            case "Square feet":
                switch (unitConvertTo) {
                    case "Square millimeter": conversionMultiplier(resultValue, valueToConvert, 92903.04);break;
                    case "Square centimeter": conversionMultiplier(resultValue, valueToConvert, 929.0304);break;
                    case "Square meter": conversionMultiplier(resultValue, valueToConvert, 0.09290304);break;
                    case "Square kilometer": conversionMultiplier(resultValue, valueToConvert, 0.00000009290303999);break;
                    case "Hectare": conversionMultiplier(resultValue, valueToConvert, 0.0000092903);break;
                    case "Square mile": conversionMultiplier(resultValue, valueToConvert, 0.000000387006427);break;
                    case "Acre": conversionMultiplier(resultValue, valueToConvert, 0.0000229568);break;
                    case "Square yard": conversionMultiplier(resultValue, valueToConvert, 0.1111111111);break;
                    case "Square feet": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Square inch": conversionMultiplier(resultValue, valueToConvert, 144);break;
                }
            case "Square inch":
                switch (unitConvertTo) {
                    case "Square millimeter": conversionMultiplier(resultValue, valueToConvert, 645.16);break;
                    case "Square centimeter": conversionMultiplier(resultValue, valueToConvert, 6.4516);break;
                    case "Square meter": conversionMultiplier(resultValue, valueToConvert, 0.00064516);break;
                    case "Square kilometer": conversionMultiplier(resultValue, valueToConvert, 0.00000000064516);break;
                    case "Hectare": conversionMultiplier(resultValue, valueToConvert, 0.000000064516);break;
                    case "Square mile": conversionMultiplier(resultValue, valueToConvert, 0.000000000290976686);break;
                    case "Acre": conversionMultiplier(resultValue, valueToConvert, 0.0000001594225079);break;
                    case "Square yard": conversionMultiplier(resultValue, valueToConvert, 0.0007716049);break;
                    case "Square feet": conversionMultiplier(resultValue, valueToConvert, 0.0069444444);break;
                    case "Дюйм квадратний": conversionMultiplier(resultValue, valueToConvert,1);break;
                }
            case "Mlilinewton":
                switch (unitConvertTo) {
                    case "Mlilinewton":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Newton":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Kilonewton":conversionMultiplier(resultValue, valueToConvert, 0.000001);break;
                    case "Ton-force(metric)":conversionMultiplier(resultValue, valueToConvert, 0.000000101);break;
                    case "Gram-force":conversionMultiplier(resultValue, valueToConvert, 0.1019);break;
                    case "Kilogram-force":conversionMultiplier(resultValue, valueToConvert, 0.000101);break;
                    case "Pond":conversionMultiplier(resultValue, valueToConvert, 0.1019);break; //equals to gram-force
                    case "Pound-force":conversionMultiplier(resultValue, valueToConvert, 0.00022);break;
                    case "Ounce-force":conversionMultiplier(resultValue, valueToConvert, 0.00359);break;
                    case "Ton-force (long)":conversionMultiplier(resultValue, valueToConvert, 0.000000100);break;
                    case "Poundal":conversionMultiplier(resultValue, valueToConvert, 0.00723);break;
                }
                break;
            case "Newton":
                switch (unitConvertTo) {
                    case "Mlilinewton":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Newton":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Kilonewton":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Ton-force(metric)":conversionMultiplier(resultValue, valueToConvert, 0.000101);break;
                    case "Gram-force":conversionMultiplier(resultValue, valueToConvert, 101.971);break;
                    case "Kilogram-force":conversionMultiplier(resultValue, valueToConvert, 0.10197);break;
                    case "Pond":conversionMultiplier(resultValue, valueToConvert, 101.971);break; //equals to gram-force
                    case "Pound-force":conversionMultiplier(resultValue, valueToConvert, 0.22480);break;
                    case "Ounce-force":conversionMultiplier(resultValue, valueToConvert, 3.5969);break;
                    case "Ton-force (long)":conversionMultiplier(resultValue, valueToConvert, 0.000100);break;
                    case "Poundal":conversionMultiplier(resultValue, valueToConvert, 7.233);break;
                }
                break;
            case "Kilonewton":
                switch (unitConvertTo) {
                    case "Mlilinewton":conversionMultiplier(resultValue, valueToConvert, 1000000.0);break;
                    case "Newton":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Kilonewton":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Ton-force(metric)":conversionMultiplier(resultValue, valueToConvert, 0.101);break;
                    case "Gram-force":conversionMultiplier(resultValue, valueToConvert, 101971.6);break;
                    case "Kilogram-force":conversionMultiplier(resultValue, valueToConvert, 101.971);break;
                    case "Pond":conversionMultiplier(resultValue, valueToConvert, 101971.6);break; //equals to gram-force
                    case "Pound-force":conversionMultiplier(resultValue, valueToConvert, 224.81);break;
                    case "Ounce-force":conversionMultiplier(resultValue, valueToConvert, 3596.94);break;
                    case "Ton-force (long)":conversionMultiplier(resultValue, valueToConvert, 0.100);break;
                    case "Poundal":conversionMultiplier(resultValue, valueToConvert, 7233.01);break;
                }
                break;
            case "Ton-force(metric)":
                switch (unitConvertTo) {
                    case "Mlilinewton":conversionMultiplier(resultValue, valueToConvert, 9806650);break;
                    case "Newton":conversionMultiplier(resultValue, valueToConvert, 9806.65);break;
                    case "Kilonewton":conversionMultiplier(resultValue, valueToConvert, 9.80665);break;
                    case "Ton-force(metric)":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Gram-force":conversionMultiplier(resultValue, valueToConvert, 1000000.0);break;
                    case "Kilogram-force":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Pond":conversionMultiplier(resultValue, valueToConvert, 1000000.0);break;//equals to gram-force
                    case "Pound-force":conversionMultiplier(resultValue, valueToConvert, 2204.62);break;
                    case "Ounce-force":conversionMultiplier(resultValue, valueToConvert, 35273.96);break;
                    case "Ton-force (long)":conversionMultiplier(resultValue, valueToConvert, 0.9842);break;
                    case "Poundal":conversionMultiplier(resultValue, valueToConvert, 70931.63);break;
                }
                break;
            case "Gram-force":
                switch (unitConvertTo) {
                    case "Mlilinewton":conversionMultiplier(resultValue, valueToConvert, 9.8066);break;
                    case "Newton":conversionMultiplier(resultValue, valueToConvert, 0.009806);break;
                    case "Kilonewton":conversionMultiplier(resultValue, valueToConvert, 0.0000098067);break;
                    case "Ton-force(metric)":conversionMultiplier(resultValue, valueToConvert, 0.000001);break;
                    case "Gram-force":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Kilogram-force":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Pond":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Pound-force":conversionMultiplier(resultValue, valueToConvert, 0.002204);break;
                    case "Ounce-force":conversionMultiplier(resultValue, valueToConvert, 0.03527);break;
                    case "Ton-force (long)":conversionMultiplier(resultValue, valueToConvert, 0.0000009842065276);break;
                    case "Poundal":conversionMultiplier(resultValue, valueToConvert, 0.07093);break;
                }
                break;
            case "Kilogram-force":
                switch (unitConvertTo) {
                    case "Mlilinewton":conversionMultiplier(resultValue, valueToConvert, 9806.65);break;
                    case "Newton":conversionMultiplier(resultValue, valueToConvert, 9.80665);break;
                    case "Kilonewton":conversionMultiplier(resultValue, valueToConvert, 0.0098066);break;
                    case "Ton-force(metric)":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Gram-force":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Kilogram-force":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Pond":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Pound-force":conversionMultiplier(resultValue, valueToConvert, 2.20);break;
                    case "Ounce-force":conversionMultiplier(resultValue, valueToConvert, 35.273);break;
                    case "Ton-force (long)":conversionMultiplier(resultValue, valueToConvert, 0.0009842);break;
                    case "Poundal":conversionMultiplier(resultValue, valueToConvert, 70.931);break;
                }
                break;
            case "Pond":
                switch (unitConvertTo) {
                    case "Mlilinewton":conversionMultiplier(resultValue, valueToConvert, 9.80665);break;
                    case "Newton":conversionMultiplier(resultValue, valueToConvert, 0.00980);break;
                    case "Kilonewton":conversionMultiplier(resultValue, valueToConvert, 0.0000098);break;
                    case "Ton-force(metric)":conversionMultiplier(resultValue, valueToConvert, 0.000001);break;
                    case "Gram-force":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Kilogram-force":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Pond":conversionMultiplier(resultValue, valueToConvert,1.0);break;
                    case "Pound-force":conversionMultiplier(resultValue, valueToConvert, 0.002204);break;
                    case "Ounce-force":conversionMultiplier(resultValue, valueToConvert, 0.03527);break;
                    case "Ton-force (long)":conversionMultiplier(resultValue, valueToConvert, 0.0000009842065276);break;
                    case "Poundal":conversionMultiplier(resultValue, valueToConvert, 0.07093);break;
                }
                break;
            case "Pound-force":
                switch (unitConvertTo) {
                    case "Mlilinewton":conversionMultiplier(resultValue, valueToConvert, 4448.221);break;
                    case "Newton":conversionMultiplier(resultValue, valueToConvert, 4.448);break;
                    case "Kilonewton":conversionMultiplier(resultValue, valueToConvert, 0.00444);break;
                    case "Ton-force(metric)":conversionMultiplier(resultValue, valueToConvert, 0.00045);break;
                    case "Gram-force":conversionMultiplier(resultValue, valueToConvert, 453.59);break;
                    case "Kilogram-force":conversionMultiplier(resultValue, valueToConvert, 0.45359);break;
                    case "Pond":conversionMultiplier(resultValue, valueToConvert, 453.59);break;
                    case "Pound-force":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Ounce-force":conversionMultiplier(resultValue, valueToConvert, 16);break;
                    case "Ton-force (long)":conversionMultiplier(resultValue, valueToConvert, 0.0004464);break;
                    case "Poundal":conversionMultiplier(resultValue, valueToConvert, 32.174);break;
                }
                break;
            case "Ounce-force":
                switch (unitConvertTo) {
                    case "Mlilinewton":conversionMultiplier(resultValue, valueToConvert, 278.013);break;
                    case "Newton":conversionMultiplier(resultValue, valueToConvert, 0.27801);break;
                    case "Kilonewton":conversionMultiplier(resultValue, valueToConvert, 0.0002780);break;
                    case "Ton-force(metric)":conversionMultiplier(resultValue, valueToConvert, 0.0000283);break;
                    case "Gram-force":conversionMultiplier(resultValue, valueToConvert, 28.349);break;
                    case "Kilogram-force":conversionMultiplier(resultValue, valueToConvert, 0.02834);break;
                    case "Pond":conversionMultiplier(resultValue, valueToConvert, 28.349);break;
                    case "Pound-force":conversionMultiplier(resultValue, valueToConvert, 0.0625);break;
                    case "Ounce-force":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Ton-force (long)":conversionMultiplier(resultValue, valueToConvert, 0.0000279);break;
                    case "Poundal":conversionMultiplier(resultValue, valueToConvert, 2.010);break;
                }
                break;
            case "Ton-force (long)":
                switch (unitConvertTo) {
                    case "Mlilinewton":conversionMultiplier(resultValue, valueToConvert, 9964016.41);break;
                    case "Newton":conversionMultiplier(resultValue, valueToConvert, 9964.01);break;
                    case "Kilonewton":conversionMultiplier(resultValue, valueToConvert, 9.9640);break;
                    case "Ton-force(metric)":conversionMultiplier(resultValue, valueToConvert, 1.016);break;
                    case "Gram-force":conversionMultiplier(resultValue, valueToConvert, 1016046.90);break;
                    case "Kilogram-force":conversionMultiplier(resultValue, valueToConvert, 1016.046);break;
                    case "Pond":conversionMultiplier(resultValue, valueToConvert, 1016046.90);break;
                    case "Pound-force":conversionMultiplier(resultValue, valueToConvert, 2240.0);break;
                    case "Ounce-force":conversionMultiplier(resultValue, valueToConvert, 35840.0);break;
                    case "Ton-force (long)":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Poundal":conversionMultiplier(resultValue, valueToConvert, 72069.86);break;
                }
                break;
            case "Poundal":
                switch (unitConvertTo) {
                    case "Mlilinewton":conversionMultiplier(resultValue, valueToConvert, 138.25);break;
                    case "Newton":conversionMultiplier(resultValue, valueToConvert, 0.13825);break;
                    case "Kilonewton":conversionMultiplier(resultValue, valueToConvert, 0.000138);break;
                    case "Ton-force(metric)":conversionMultiplier(resultValue, valueToConvert, 0.0000140);break;
                    case "Gram-force":conversionMultiplier(resultValue, valueToConvert, 14.09);break;
                    case "Kilogram-force":conversionMultiplier(resultValue, valueToConvert, 0.01409);break;
                    case "Pond":conversionMultiplier(resultValue, valueToConvert, 14.09);break;
                    case "Pound-force":conversionMultiplier(resultValue, valueToConvert, 0.03108);break;
                    case "Ounce-force":conversionMultiplier(resultValue, valueToConvert, 0.4972);break;
                    case "Ton-force (long)":conversionMultiplier(resultValue, valueToConvert, 0.0000138);break;
                    case "Poundal":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
            case "Millimetre":
                switch (unitConvertTo){
                    case "Millimetre":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Centimetre":conversionMultiplier(resultValue, valueToConvert, 0.1);break;
                    case "Metre":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Kilometre":conversionMultiplier(resultValue, valueToConvert, 0.000001);break;
                    case "Inch":conversionMultiplier(resultValue, valueToConvert, 0.03937);break;
                    case "Foot":conversionMultiplier(resultValue, valueToConvert, 0.003280);break;
                    case "Yard":conversionMultiplier(resultValue, valueToConvert, 0.001093);break;
                    case "Mile":conversionMultiplier(resultValue, valueToConvert, 0.0000062137);break;
                }
                break;
            case "Centimetre":
                switch (unitConvertTo){
                    case "Millimetre":conversionMultiplier(resultValue, valueToConvert, 10);break;
                    case "Centimetre":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Metre":conversionMultiplier(resultValue, valueToConvert, 0.01);break;
                    case "Kilometre":conversionMultiplier(resultValue, valueToConvert, 0.00001);break;
                    case "Inch":conversionMultiplier(resultValue, valueToConvert, 0.3937);break;
                    case "Foot":conversionMultiplier(resultValue, valueToConvert, 0.03280);break;
                    case "Yard":conversionMultiplier(resultValue, valueToConvert, 0.01093);break;
                    case "Mile":conversionMultiplier(resultValue, valueToConvert, 0.000006213);break;
                }
                break;
            case "Metre":
                switch (unitConvertTo){
                    case "Millimetre":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Centimetre":conversionMultiplier(resultValue, valueToConvert, 100);break;
                    case "Metre":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Kilometre":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Inch":conversionMultiplier(resultValue, valueToConvert, 39.37007);break;
                    case "Foot":conversionMultiplier(resultValue, valueToConvert, 3.2808);break;
                    case "Yard":conversionMultiplier(resultValue, valueToConvert, 1.09361);break;
                    case "Mile":conversionMultiplier(resultValue, valueToConvert, 0.00062137);break;
                }
                break;
            case "Kilometre":
                switch (unitConvertTo){
                    case "Millimetre":conversionMultiplier(resultValue, valueToConvert, 1000000.0);break;
                    case "Centimetre":conversionMultiplier(resultValue, valueToConvert, 100000.0);break;
                    case "Metre":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Kilometre":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Inch":conversionMultiplier(resultValue, valueToConvert, 39370.08);break;
                    case "Foot":conversionMultiplier(resultValue, valueToConvert, 3280.84);break;
                    case "Yard":conversionMultiplier(resultValue, valueToConvert, 1093.6132);break;
                    case "Mile":conversionMultiplier(resultValue, valueToConvert, 0.6214);break;
                }
                break;
            case "Inch":
                switch (unitConvertTo){
                    case "Millimetre":conversionMultiplier(resultValue, valueToConvert, 25.4);break;
                    case "Centimetre":conversionMultiplier(resultValue, valueToConvert, 2.54);break;
                    case "Metre":conversionMultiplier(resultValue, valueToConvert, 0.0254);break;
                    case "Kilometre":conversionMultiplier(resultValue, valueToConvert, 0.0000254);break;
                    case "Inch":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Foot":conversionMultiplier(resultValue, valueToConvert, 0.08333);break;
                    case "Yard":conversionMultiplier(resultValue, valueToConvert, 0.02777);break;
                    case "Mile":conversionMultiplier(resultValue, valueToConvert, 0.00001578);break;
                }
                break;
            case "Foot":
                switch (unitConvertTo){
                    case "Millimetre":conversionMultiplier(resultValue, valueToConvert, 304.8);break;
                    case "Centimetre":conversionMultiplier(resultValue, valueToConvert, 30.48);break;
                    case "Metre":conversionMultiplier(resultValue, valueToConvert, 0.3048);break;
                    case "Kilometre":conversionMultiplier(resultValue, valueToConvert, 0.0003048);break;
                    case "Inch":conversionMultiplier(resultValue, valueToConvert, 12);break;
                    case "Foot":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Yard":conversionMultiplier(resultValue, valueToConvert, 0.33333);break;
                    case "Mile":conversionMultiplier(resultValue, valueToConvert, 0.0001893936);break;
                }
                break;
            case "Yard":
                switch (unitConvertTo){
                    case "Millimetre":conversionMultiplier(resultValue, valueToConvert, 914.4);break;
                    case "Centimetre":conversionMultiplier(resultValue, valueToConvert, 91.44);break;
                    case "Metre":conversionMultiplier(resultValue, valueToConvert, 0.9144);break;
                    case "Kilometre":conversionMultiplier(resultValue, valueToConvert, 0.0009144);break;
                    case "Inch":conversionMultiplier(resultValue, valueToConvert, 36);break;
                    case "Foot":conversionMultiplier(resultValue, valueToConvert, 3);break;
                    case "Yard":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Mile":conversionMultiplier(resultValue, valueToConvert, 0.0005681);break;
                }
                break;
            case "Mile":
                switch (unitConvertTo){
                    case "Millimetre":conversionMultiplier(resultValue, valueToConvert, 1609347.21);break;
                    case "Centimetre":conversionMultiplier(resultValue, valueToConvert, 160934.72);break;
                    case "Metre":conversionMultiplier(resultValue, valueToConvert, 1609.34);break;
                    case "Kilometre":conversionMultiplier(resultValue, valueToConvert, 1.6093);break;
                    case "Inch":conversionMultiplier(resultValue, valueToConvert, 63360.12);break;
                    case "Foot":conversionMultiplier(resultValue, valueToConvert, 5280.010);break;
                    case "Yard":conversionMultiplier(resultValue, valueToConvert, 1760);break;
                    case "Mile":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
            case "Milligram":
                switch (unitConvertTo){
                    case "Gram":conversionMultiplier(resultValue, valueToConvert, 0.001); break;
                    case "Kilogram":conversionMultiplier(resultValue, valueToConvert, 0.000001); break;
                    case "Tonne": conversionMultiplier(resultValue, valueToConvert, 0.000000001); break;
                    case "Grain":conversionMultiplier(resultValue, valueToConvert, 0.0154); break;
                    case "Ounce":conversionMultiplier(resultValue, valueToConvert, 0.000035); break;
                    case "Pound":conversionMultiplier(resultValue, valueToConvert, 0.0000022); break;
                    case "Hundreweight":conversionMultiplier(resultValue, valueToConvert, 0.00000002); break;
                    case "Ton(long)":conversionMultiplier(resultValue, valueToConvert, 0.000000001016); break;
                    case "Milligram":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Gram":
                switch (unitConvertTo){
                    case "Milligram":conversionMultiplier(resultValue, valueToConvert, 1000.0); break;
                    case "Kilogram":conversionMultiplier(resultValue, valueToConvert, 0.001); break;
                    case "Tonne": conversionMultiplier(resultValue, valueToConvert, 0.000000001); break;
                    case "Grain":conversionMultiplier(resultValue, valueToConvert, 15.43); break;
                    case "Ounce":conversionMultiplier(resultValue, valueToConvert, 0.03527); break;
                    case "Pound":conversionMultiplier(resultValue, valueToConvert, 0.002204); break;
                    case "Hundreweight":conversionMultiplier(resultValue, valueToConvert, 0.0000196); break;
                    case "Ton(long)":conversionMultiplier(resultValue, valueToConvert, 0.0000009); break;
                    case "Gram":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Kilogram":
                switch (unitConvertTo){
                    case "Milligram":conversionMultiplier(resultValue, valueToConvert, 1000000.0); break;
                    case "Gram":conversionMultiplier(resultValue, valueToConvert, 1000.0); break;
                    case "Tonne":conversionMultiplier(resultValue, valueToConvert, 0.001); break;
                    case "Grain":conversionMultiplier(resultValue, valueToConvert, 15432.35); break;
                    case "Ounce":conversionMultiplier(resultValue, valueToConvert, 35.27); break;
                    case "Pound":conversionMultiplier(resultValue, valueToConvert, 2.20); break;
                    case "Hundreweight":conversionMultiplier(resultValue, valueToConvert, 0.01968); break;
                    case "Ton(long)":conversionMultiplier(resultValue, valueToConvert, 0.000984); break;
                    case "Kilogram":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Tonne":
                switch (unitConvertTo){
                    case "Milligram":conversionMultiplier(resultValue, valueToConvert, 1000000000.0); break;
                    case "Gram":conversionMultiplier(resultValue, valueToConvert, 1000000.0); break;
                    case "Kilogram":conversionMultiplier(resultValue, valueToConvert, 1000.0); break;
                    case "Grain":conversionMultiplier(resultValue, valueToConvert, 15432358.35); break;
                    case "Ounce":conversionMultiplier(resultValue, valueToConvert, 35273.96); break;
                    case "Pound":conversionMultiplier(resultValue, valueToConvert, 2204.62); break;
                    case "Hundreweight":conversionMultiplier(resultValue, valueToConvert, 19.68); break;
                    case "Ton(long)":conversionMultiplier(resultValue, valueToConvert, 0.9842); break;
                    case "Tonne":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Grain":
                switch (unitConvertTo){
                    case "Milligram":conversionMultiplier(resultValue, valueToConvert, 64.79); break;
                    case "Gram":conversionMultiplier(resultValue, valueToConvert, 0.0647); break;
                    case "Kilogram":conversionMultiplier(resultValue, valueToConvert, 0.000064); break;
                    case "Tonne":conversionMultiplier(resultValue, valueToConvert, 0.000000065); break;
                    case "Ounce":conversionMultiplier(resultValue, valueToConvert, 0.00228); break;
                    case "Pound":conversionMultiplier(resultValue, valueToConvert, 0.000142857); break;
                    case "Hundreweight":conversionMultiplier(resultValue, valueToConvert, 0.000001429); break;
                    case "Ton(long)":conversionMultiplier(resultValue, valueToConvert, 0.000000064); break;
                    case "Grain":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Ounce":
                switch (unitConvertTo){
                    case "Milligram":conversionMultiplier(resultValue, valueToConvert, 28349.52); break;
                    case "Gram":conversionMultiplier(resultValue, valueToConvert, 28.349); break;
                    case "Kilogram":conversionMultiplier(resultValue, valueToConvert, 0.02834); break;
                    case "Tonne":conversionMultiplier(resultValue, valueToConvert, 0.00002835); break;
                    case "Grain":conversionMultiplier(resultValue, valueToConvert, 437.49); break;
                    case "Pound":conversionMultiplier(resultValue, valueToConvert, 0.0625); break;
                    case "Hundreweight":conversionMultiplier(resultValue, valueToConvert, 0.000558036); break;
                    case "Ton(long)":conversionMultiplier(resultValue, valueToConvert, 0.0000279022); break;
                    case "Ounce":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Pound":
                switch (unitConvertTo){
                    case "Milligram":conversionMultiplier(resultValue, valueToConvert, 453592.37); break;
                    case "Gram":conversionMultiplier(resultValue, valueToConvert, 453.59); break;
                    case "Kilogram":conversionMultiplier(resultValue, valueToConvert, 0.4535); break;
                    case "Tonne":conversionMultiplier(resultValue, valueToConvert, 0.0004535); break;
                    case "Grain":conversionMultiplier(resultValue, valueToConvert, 6999.99); break;
                    case "Ounce":conversionMultiplier(resultValue, valueToConvert, 16); break;
                    case "Hundreweight":conversionMultiplier(resultValue, valueToConvert, 0.008928571); break;
                    case "Ton(long)":conversionMultiplier(resultValue, valueToConvert, 0.000446429); break;
                    case "Pound":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Hundreweight":
                switch (unitConvertTo){
                    case "Milligram":conversionMultiplier(resultValue, valueToConvert, 50802345.44); break;
                    case "Gram":conversionMultiplier(resultValue, valueToConvert, 50802.34); break;
                    case "Kilogram": conversionMultiplier(resultValue, valueToConvert, 50.80); break;
                    case "Tonne":conversionMultiplier(resultValue, valueToConvert, 0.05080); break;
                    case "Grain":conversionMultiplier(resultValue, valueToConvert, 783999.999); break;
                    case "Ounce":conversionMultiplier(resultValue, valueToConvert, 1792); break;
                    case "Pound":conversionMultiplier(resultValue, valueToConvert, 112); break;
                    case "Ton(long)":conversionMultiplier(resultValue, valueToConvert, 0.05); break;
                    case "Hundreweight":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Ton(long)":
                switch (unitConvertTo){
                    case "Milligram":conversionMultiplier(resultValue, valueToConvert, 1016046908.8); break;
                    case "Gram":conversionMultiplier(resultValue, valueToConvert, 1016046.90); break;
                    case "Kilogram":conversionMultiplier(resultValue, valueToConvert, 1016.04); break;
                    case "Tonne":conversionMultiplier(resultValue, valueToConvert, 1.016); break;
                    case "Grain":conversionMultiplier(resultValue, valueToConvert, 15679999.99); break;
                    case "Ounce":conversionMultiplier(resultValue, valueToConvert, 35840.0); break;
                    case "Pound":conversionMultiplier(resultValue, valueToConvert, 2240.0); break;
                    case "Hundreweight":conversionMultiplier(resultValue, valueToConvert, 20.0); break;
                    case "Ton(long)":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
            case "Meter/second":
                switch (unitConvertTo) {
                    case "Meter/second":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Meter/hour":conversionMultiplier(resultValue, valueToConvert, 3600);break;
                    case "Kilometer/second":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Kilometer/hour":conversionMultiplier(resultValue, valueToConvert, 3.6);break;
                    case "Mach(SI)":conversionMultiplier(resultValue, valueToConvert, 0.0033);break;
                    case "Foot/second":conversionMultiplier(resultValue, valueToConvert, 3.28);break;
                    case "Foot/hour":conversionMultiplier(resultValue, valueToConvert, 11811.02);break;
                    case "Mile/hour":conversionMultiplier(resultValue, valueToConvert, 2.23);break;
                    case "Knot/kt":conversionMultiplier(resultValue, valueToConvert, 1.943);break;
                }
                break;
            case "Meter/hour":
                switch (unitConvertTo) {
                    case "Meter/second":conversionMultiplier(resultValue, valueToConvert, 0.00027);break;
                    case "Meter/hour":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Kilometer/second":conversionMultiplier(resultValue, valueToConvert, 0.0000002777777777);break;
                    case "Kilometer/hour":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Foot/second":conversionMultiplier(resultValue, valueToConvert, 0.0009);break;
                    case "Foot/hour":conversionMultiplier(resultValue, valueToConvert, 3.28);break;
                    case "Mile/hour":conversionMultiplier(resultValue, valueToConvert, 0.00062);break;
                    case "Knot/kt":conversionMultiplier(resultValue, valueToConvert, 0.00053);break;
                }
                break;
            case "Kilometer/second":
                switch (unitConvertTo) {
                    case "Meter/second":conversionMultiplier(resultValue, valueToConvert, 0.277);break;
                    case "Meter/hour":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Kilometer/second":conversionMultiplier(resultValue, valueToConvert, 0.00027);break;
                    case "Kilometer/hour":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Foot/second":conversionMultiplier(resultValue, valueToConvert, 0.911);break;
                    case "Foot/hour":conversionMultiplier(resultValue, valueToConvert, 3280.8);break;
                    case "Mile/hour":conversionMultiplier(resultValue, valueToConvert, 0.621);break;
                    case "Knot/kt":conversionMultiplier(resultValue, valueToConvert, 0.539);break;
                }
                break;
            case "Kilometer/hour":
                switch (unitConvertTo) {
                    case "Meter/second":conversionMultiplier(resultValue, valueToConvert, 0.2777);break;
                    case "Meter/hour":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Kilometer/second":conversionMultiplier(resultValue, valueToConvert, 0.00027);break;
                    case "Kilometer/hour":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Foot/second":conversionMultiplier(resultValue, valueToConvert, 0.911);break;
                    case "Foot/hour":conversionMultiplier(resultValue, valueToConvert, 3280.8);break;
                    case "Mile/hour":conversionMultiplier(resultValue, valueToConvert, 0.621);break;
                    case "Knot/kt":conversionMultiplier(resultValue, valueToConvert, 0.539);break;
                }
                break;
            case "Foot/second":
                switch (unitConvertTo) {
                    case "Meter/second":conversionMultiplier(resultValue, valueToConvert, 0.3048);break;
                    case "Meter/hour":conversionMultiplier(resultValue, valueToConvert, 1097.28);break;
                    case "Kilometer/second":conversionMultiplier(resultValue, valueToConvert, 0.0003048);break;
                    case "Kilometer/hour":conversionMultiplier(resultValue, valueToConvert, 1.09728);break;
                    case "Foot/second":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Foot/hour":conversionMultiplier(resultValue, valueToConvert, 3600);break;
                    case "Mile/hour":conversionMultiplier(resultValue, valueToConvert, 0.681);break;
                    case "Knot/kt":conversionMultiplier(resultValue, valueToConvert, 0.5924);break;
                }
                break;
            case "Foot/hour":
                switch (unitConvertTo) {
                    case "Meter/second":conversionMultiplier(resultValue, valueToConvert, 0.000084);break;
                    case "Meter/hour":conversionMultiplier(resultValue, valueToConvert, 0.3);break;
                    case "Kilometer/second":conversionMultiplier(resultValue, valueToConvert, 0.00000008466666666);break;
                    case "Kilometer/hour":conversionMultiplier(resultValue, valueToConvert, 0.00030);break;
                    case "Foot/second":conversionMultiplier(resultValue, valueToConvert, 0.00027);break;
                    case "Foot/hour":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Mile/hour":conversionMultiplier(resultValue, valueToConvert, 0.00018);break;
                    case "Knot/kt":conversionMultiplier(resultValue, valueToConvert, 0.00016);break;
                }
                break;
            case "Mile/hour":
                switch (unitConvertTo) {
                    case "Meter/second":conversionMultiplier(resultValue, valueToConvert, 0.44);break;
                    case "Meter/hour":conversionMultiplier(resultValue, valueToConvert, 1609.3);break;
                    case "Kilometer/second":conversionMultiplier(resultValue, valueToConvert, 0.00044);break;
                    case "Kilometer/hour":conversionMultiplier(resultValue, valueToConvert, 1.6);break;
                    case "Foot/second":conversionMultiplier(resultValue, valueToConvert, 1.46);break;
                    case "Foot/hour":conversionMultiplier(resultValue, valueToConvert, 5280);break;
                    case "Mile/hour":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Knot/kt":conversionMultiplier(resultValue, valueToConvert, 0.8689);break;
                }
                break;
            case "Knot/kt":
                switch (unitConvertTo) {
                    case "Meter/second":conversionMultiplier(resultValue, valueToConvert, 0.514);break;
                    case "Meter/hour":conversionMultiplier(resultValue, valueToConvert, 1852);break;
                    case "Kilometer/second":conversionMultiplier(resultValue, valueToConvert, 0.00051);break;
                    case "Kilometer/hour":conversionMultiplier(resultValue, valueToConvert, 1.852);break;
                    case "Foot/second":conversionMultiplier(resultValue, valueToConvert, 1.687);break;
                    case "Foot/hour":conversionMultiplier(resultValue, valueToConvert, 6076.11);break;
                    case "Mile/hour":conversionMultiplier(resultValue, valueToConvert, 1.150);break;
                    case "Knot/kt":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Celsius":
                switch (unitConvertTo) {
                    case "Celsius":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Fahrenheit":
                        resultValue.setText(String.valueOf(formatter.format((valueToConvert *NineDivFive)+32)));break;
                    case "Kelvin":
                        resultValue.setText(String.valueOf(formatter.format(valueToConvert + 273.15)));break;
                    case "Rankine":
                        resultValue.setText(String.valueOf(formatter.format(valueToConvert *NineDivFive+491.67)));break;
                }
                break;
            case "Kelvin":
                switch (unitConvertTo) {
                    case "Celsius":
                        resultValue.setText(String.valueOf(formatter.format(valueToConvert -273.15)));break;//here
                    case "Fahrenheit":
                        resultValue.setText(String.valueOf(formatter.format((valueToConvert -273.15)*NineDivFive +32)));break; //here
                    case "Kelvin":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Rankine":conversionMultiplier(resultValue, valueToConvert, 1.8);break;
                }
                break;
            case "Rankine/°R"  :
                switch (unitConvertTo) {
                    case "Celsius":
                        resultValue.setText(String.valueOf(formatter.format((valueToConvert -491.67)*FiveDivNine)));break;//here
                    case "Fahrenheit":
                        resultValue.setText(String.valueOf(formatter.format(valueToConvert -459.67)));break;//here
                    case "Kelvin":conversionMultiplier(resultValue, valueToConvert,FiveDivNine);break;
                    case "Rankine":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Fahrenheit/°F" :
                switch (unitConvertTo) {
                    case "Celsius":
                        resultValue.setText(String.valueOf(formatter.format((valueToConvert -32)*FiveDivNine)));break;
                    case "Fahrenheit":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Kelvin":
                        resultValue.setText(String.valueOf(formatter.format((valueToConvert -32)*FiveDivNine+273.15)));break;
                    case "Rankine":
                        resultValue.setText(String.valueOf(formatter.format(valueToConvert + 459.67)));break;
                }
            case "Seconds":
                switch (unitConvertTo) {
                    case "Seconds":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Minutes":conversionMultiplier(resultValue, valueToConvert, 0.0166666667);break;
                    case "Hour":conversionMultiplier(resultValue, valueToConvert, 0.0002777778);break;
                    case "Day":conversionMultiplier(resultValue, valueToConvert, 0.0000115741);break;
                    case "Week":conversionMultiplier(resultValue, valueToConvert, 0.0000016534);break;
                    case "Month":conversionMultiplier(resultValue, valueToConvert, 0.0000003805175038);break;
                    case "Year":conversionMultiplier(resultValue, valueToConvert, 0.00000003170979198);break;
                }
                break;
            case "Minutes":
                switch (unitConvertTo) {
                    case "Seconds":conversionMultiplier(resultValue, valueToConvert, 60);break;
                    case "Minutes":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Hour":conversionMultiplier(resultValue, valueToConvert, 0.0166666667);break;
                    case "Day":conversionMultiplier(resultValue, valueToConvert, 0.0006944444);break;
                    case "Week":conversionMultiplier(resultValue, valueToConvert, 0.0000992063);break;
                    case "Month":conversionMultiplier(resultValue, valueToConvert, 0.0000228311);break;
                    case "Year":conversionMultiplier(resultValue, valueToConvert, 0.0000019026);break;
                }
                break;
            case "Hour":
                switch (unitConvertTo) {
                    case "Seconds":conversionMultiplier(resultValue, valueToConvert, 3600);break;
                    case "Minutes":conversionMultiplier(resultValue, valueToConvert, 60);break;
                    case "Hour":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Day":conversionMultiplier(resultValue, valueToConvert, 0.0416666667);break;
                    case "Week":conversionMultiplier(resultValue, valueToConvert, 0.005952381);break;
                    case "Month":conversionMultiplier(resultValue, valueToConvert, 0.001369863);break;
                    case "Year":conversionMultiplier(resultValue, valueToConvert, 0.0001141553);break;
                }
                break;
            case "Day":
                switch (unitConvertTo) {
                    case "Seconds":conversionMultiplier(resultValue, valueToConvert, 604800);break;
                    case "Minutes":conversionMultiplier(resultValue, valueToConvert, 10080);break;
                    case "Hour":conversionMultiplier(resultValue, valueToConvert, 168);break;
                    case "Day":conversionMultiplier(resultValue, valueToConvert, 7);break;
                    case "Week":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Month":conversionMultiplier(resultValue, valueToConvert, 0.23);break;
                    case "Year":conversionMultiplier(resultValue, valueToConvert, 0.19);break;
                }
                break;
            case "Week":
                switch (unitConvertTo) {
                    case "Seconds":conversionMultiplier(resultValue, valueToConvert, 604800);break;
                    case "Minutes":conversionMultiplier(resultValue, valueToConvert, 10080);break;
                    case "Hour":conversionMultiplier(resultValue, valueToConvert, 168);break;
                    case "Day":conversionMultiplier(resultValue, valueToConvert, 7);break;
                    case "Week":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Month":conversionMultiplier(resultValue, valueToConvert, 0.2301369863);break;
                    case "Year":conversionMultiplier(resultValue, valueToConvert, 0.0191780822);break;
                }
                break;
            case "Month":
                switch (unitConvertTo) {
                    case "Seconds":conversionMultiplier(resultValue, valueToConvert, 2628000);break;
                    case "Minutes":conversionMultiplier(resultValue, valueToConvert, 43800);break;
                    case "Hour":conversionMultiplier(resultValue, valueToConvert, 730);break;
                    case "Day":conversionMultiplier(resultValue, valueToConvert, 30.416666667);break;
                    case "Week":conversionMultiplier(resultValue, valueToConvert, 4.3452380952);break;
                    case "Month":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Year":conversionMultiplier(resultValue, valueToConvert, 0.0833333333);break;
                }
                break;
            case "Year":
                switch (unitConvertTo) {
                    case "Seconds":conversionMultiplier(resultValue, valueToConvert, 31536000);break;
                    case "Minutes":conversionMultiplier(resultValue, valueToConvert, 525600);break;
                    case "Hour":conversionMultiplier(resultValue, valueToConvert, 8760);break;
                    case "Day":conversionMultiplier(resultValue, valueToConvert, 365);break;
                    case "Week":conversionMultiplier(resultValue, valueToConvert, 52.142857143);break;
                    case "Month":conversionMultiplier(resultValue, valueToConvert, 12);break;
                    case "Year":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
            case "Cubic millimetre/mm³":
                switch (unitConvertTo) {
                    case "Cubic millimetre":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Cubic centimetre":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Cubic metre":conversionMultiplier(resultValue, valueToConvert, 0.000000001);break;
                    case "Milliliter":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Liter":conversionMultiplier(resultValue, valueToConvert, 0.000001);break;
                    case "Fluid ounce":conversionMultiplier(resultValue, valueToConvert, 0.0000351951);break;
                    case "Gill":conversionMultiplier(resultValue, valueToConvert, 0.000007039);break;
                    case "Pint":conversionMultiplier(resultValue, valueToConvert, 0.0000017598);break;
                    case "Quart":conversionMultiplier(resultValue, valueToConvert, 0.0000008798769931);break;
                    case "Gallon":conversionMultiplier(resultValue, valueToConvert, 0.0000002199692482);break;
                    case "Barrel(UK)":conversionMultiplier(resultValue, valueToConvert, 0.000000006110256897);break;
                }
                break;
            case "Cubic centimetre":
                switch (unitConvertTo) {
                    case "Cubic millimetre":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Cubic centimetre":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Cubic metre":conversionMultiplier(resultValue, valueToConvert, 0.000001);break;
                    case "Milliliter":conversionMultiplier(resultValue, valueToConvert, 1);break;
                    case "Liter":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Fluid ounce":conversionMultiplier(resultValue, valueToConvert, 0.0351950797);break;
                    case "Gill":conversionMultiplier(resultValue, valueToConvert, 0.0070390159);break;
                    case "Pint":conversionMultiplier(resultValue, valueToConvert, 0.001759754);break;
                    case "Quart":conversionMultiplier(resultValue, valueToConvert, 0.000879877);break;
                    case "Gallon":conversionMultiplier(resultValue, valueToConvert, 0.0002199692);break;
                    case "Barrel(UK)":conversionMultiplier(resultValue, valueToConvert, 0.0000002199692482);break;
                }
                break;
            case "Cubic metre":
                switch (unitConvertTo) {
                    case "Cubic millimetre":conversionMultiplier(resultValue, valueToConvert, 1000000.0000);break;
                    case "Cubic centimetre":conversionMultiplier(resultValue, valueToConvert, 1000000.0);break;
                    case "Cubic metre":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Milliliter":conversionMultiplier(resultValue, valueToConvert, 1000000.0);break; //ok
                    case "Liter":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Fluid ounce":conversionMultiplier(resultValue, valueToConvert, 35195.079728);break;
                    case "Gill":conversionMultiplier(resultValue, valueToConvert, 7039.0159456);break;
                    case "Pint":conversionMultiplier(resultValue, valueToConvert, 1759.7539864);break;
                    case "Quart":conversionMultiplier(resultValue, valueToConvert, 879.8769932);break;
                    case "Gallon":conversionMultiplier(resultValue, valueToConvert, 219.9692483);break;
                    case "Barrel(UK)":conversionMultiplier(resultValue, valueToConvert, 6.1102568972);break;
                }
                break;
            case "Milliliter":
                switch (unitConvertTo) {
                    case "Cubic millimetre":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Cubic centimetre":conversionMultiplier(resultValue, valueToConvert, 1);break;
                    case "Cubic metre":conversionMultiplier(resultValue, valueToConvert, 0.000001);break;
                    case "Milliliter":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Liter":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Fluid ounce":conversionMultiplier(resultValue, valueToConvert, 0.0351950797);break;
                    case "Gill":conversionMultiplier(resultValue, valueToConvert, 0.0070390159);break;
                    case "Pint":conversionMultiplier(resultValue, valueToConvert, 0.001759754);break;
                    case "Quart":conversionMultiplier(resultValue, valueToConvert, 0.000879877);break;
                    case "Gallon":conversionMultiplier(resultValue, valueToConvert, 0.0002199692);break;
                    case "Barrel(UK)":conversionMultiplier(resultValue, valueToConvert, 0.0000061103);break;
                }
                break;
            case "Liter":
                switch (unitConvertTo) {
                    case "Cubic millimetre":conversionMultiplier(resultValue, valueToConvert, 1000000.0);break;
                    case "Cubic centimetre":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Cubic metre":conversionMultiplier(resultValue, valueToConvert, 0.001);break;
                    case "Milliliter":conversionMultiplier(resultValue, valueToConvert, 1000);break;
                    case "Liter":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Fluid ounce":conversionMultiplier(resultValue, valueToConvert, 35.195079728);break;
                    case "Gill":conversionMultiplier(resultValue, valueToConvert, 7.0390159456);break;
                    case "Pint":conversionMultiplier(resultValue, valueToConvert, 1.7597539864);break;
                    case "Quart":conversionMultiplier(resultValue, valueToConvert, 0.8798769932);break;
                    case "Gallon":conversionMultiplier(resultValue, valueToConvert, 0.2199692483);break;
                    case "Barrel(UK)":conversionMultiplier(resultValue, valueToConvert, 0.0061102569);break;
                }
                break;
            case "Gill":
                switch (unitConvertTo) {
                    case "Cubic millimetre":conversionMultiplier(resultValue, valueToConvert, 142065.3125);break;
                    case "Cubic centimetre":conversionMultiplier(resultValue, valueToConvert, 142.0653125);break;
                    case "Cubic metre":conversionMultiplier(resultValue, valueToConvert, 0.0001420653);break;
                    case "Milliliter":conversionMultiplier(resultValue, valueToConvert, 142.0653125);break;
                    case "Liter":conversionMultiplier(resultValue, valueToConvert, 0.1420653125);break;
                    case "Fluid ounce":conversionMultiplier(resultValue, valueToConvert, 5);break;
                    case "Gill":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Pint":conversionMultiplier(resultValue, valueToConvert, 0.25);break;
                    case "Quart":conversionMultiplier(resultValue, valueToConvert, 0.125);break;
                    case "Gallon":conversionMultiplier(resultValue, valueToConvert, 0.03125);break;
                    case "Barrel(UK)":conversionMultiplier(resultValue, valueToConvert, 0.0008680556);break;
                }
                break;
            case "Fluid ounce":
                switch (unitConvertTo) {
                    case "Cubic millimetre":conversionMultiplier(resultValue, valueToConvert, 28413.0625);break;
                    case "Cubic centimetre":conversionMultiplier(resultValue, valueToConvert, 28.4130625);break;
                    case "Cubic metre":conversionMultiplier(resultValue, valueToConvert, 0.0000284131);break;
                    case "Milliliter":conversionMultiplier(resultValue, valueToConvert, 28.4130625);break;
                    case "Liter":conversionMultiplier(resultValue, valueToConvert, 0.0284130625);break;
                    case "Fluid ounce":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Gill":conversionMultiplier(resultValue, valueToConvert, 0.2);break;
                    case "Pint":conversionMultiplier(resultValue, valueToConvert, 0.05);break;
                    case "Quart":conversionMultiplier(resultValue, valueToConvert, 0.025);break;
                    case "Gallon":conversionMultiplier(resultValue, valueToConvert, 0.00625);break;
                    case "Barrel(UK)":conversionMultiplier(resultValue, valueToConvert, 0.0001736111);break;
                }
                break;
            case "Pint":
                switch (unitConvertTo) {
                    case "Cubic millimetre":conversionMultiplier(resultValue, valueToConvert, 568261.25);break;
                    case "Cubic centimetre":conversionMultiplier(resultValue, valueToConvert, 568.26125);break;
                    case "Cubic metre":conversionMultiplier(resultValue, valueToConvert, 0.0005682613);break;
                    case "Milliliter":conversionMultiplier(resultValue, valueToConvert, 568.26125);break;  //ok
                    case "Liter":conversionMultiplier(resultValue, valueToConvert, 0.56826125);break;
                    case "Fluid ounce":conversionMultiplier(resultValue, valueToConvert, 20);break;
                    case "Gill":conversionMultiplier(resultValue, valueToConvert, 4);break;
                    case "Pint":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Quart":conversionMultiplier(resultValue, valueToConvert, 0.5);break;
                    case "Gallon":conversionMultiplier(resultValue, valueToConvert, 0.125);break;
                    case "Barrel(UK)":conversionMultiplier(resultValue, valueToConvert, 0.0034722222);break;
                }
                break;
            case "Quart":
                switch (unitConvertTo) {
                    case "Cubic millimetre":conversionMultiplier(resultValue, valueToConvert, 1136522.5);break;
                    case "Cubic centimetre":conversionMultiplier(resultValue, valueToConvert, 1136.5225);break;
                    case "Cubic metre":conversionMultiplier(resultValue, valueToConvert, 0.0011365225);break;
                    case "Milliliter":conversionMultiplier(resultValue, valueToConvert, 1136.5225);break;  //ok
                    case "Liter":conversionMultiplier(resultValue, valueToConvert, 1.1365225);break;
                    case "Fluid ounce":conversionMultiplier(resultValue, valueToConvert, 40);break;
                    case "Gill":conversionMultiplier(resultValue, valueToConvert, 8);break;
                    case "Pint":conversionMultiplier(resultValue, valueToConvert, 2);break;
                    case "Quart":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Gallon":conversionMultiplier(resultValue, valueToConvert, 0.25);break;
                    case "Barrel(UK)":conversionMultiplier(resultValue, valueToConvert, 0.0069444444);break;
                }
                break;
            case "Gallon":
                switch (unitConvertTo) {
                    case "Cubic millimetre":conversionMultiplier(resultValue, valueToConvert, 4546090);break;
                    case "Cubic centimetre":conversionMultiplier(resultValue, valueToConvert, 4546.09);break;
                    case "Cubic metre":conversionMultiplier(resultValue, valueToConvert, 0.00454609);break;
                    case "Milliliter":conversionMultiplier(resultValue, valueToConvert, 4546.09);break;  //ok
                    case "Liter":conversionMultiplier(resultValue, valueToConvert, 3.785);break;
                    case "Fluid ounce":conversionMultiplier(resultValue, valueToConvert, 160);break;
                    case "Gill":conversionMultiplier(resultValue, valueToConvert, 32);break;
                    case "Pint":conversionMultiplier(resultValue, valueToConvert, 8);break;
                    case "Quart":conversionMultiplier(resultValue, valueToConvert, 4);break;
                    case "Gallon":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Barrel(UK)":conversionMultiplier(resultValue, valueToConvert, 0.0277777778);break;
                }
                break;
            case "Barrel(UK)":
                switch (unitConvertTo) {
                    case "Cubic millimetre":conversionMultiplier(resultValue, valueToConvert, 163659240);break;
                    case "Cubic centimetre":conversionMultiplier(resultValue, valueToConvert, 163659.24);break;
                    case "Cubic metre":conversionMultiplier(resultValue, valueToConvert, 0.16365924);break;
                    case "Milliliter":conversionMultiplier(resultValue, valueToConvert, 163659.24);break;  //ok
                    case "Liter":conversionMultiplier(resultValue, valueToConvert, 163.65924);break;
                    case "Fluid ounce":conversionMultiplier(resultValue, valueToConvert, 5760);break;
                    case "Gill":conversionMultiplier(resultValue, valueToConvert, 1152);break;
                    case "Pint":conversionMultiplier(resultValue, valueToConvert, 288);break;
                    case "Quart":conversionMultiplier(resultValue, valueToConvert, 144);break;
                    case "Gallon":conversionMultiplier(resultValue, valueToConvert, 36);break;
                    case "Barrel(UK)":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
                /*
            case "Radius (circle)":
                switch (txtFromSpinner2) {
                    case "Radius (circle)":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Diameter (circle)":resultView.setText(String.valueOf(formatter.format(enteredValue*2)));break;
                    case "Circumference (circle)":resultView.setText(String.valueOf(formatter.format(2*PI*enteredValue)));break;
                    case "Area (circle)":resultView.setText(String.valueOf(formatter.format(PI*Math.pow(enteredValue,2))));break;  //ok
                    case "Area (sphere)":resultView.setText(String.valueOf(formatter.format(4*PI*Math.pow(enteredValue,2))));break;
                    case "Volume (sphere)":resultView.setText(String.valueOf(formatter.format((4.0/3.0) * PI * Math.pow( enteredValue, 3))));break;
                    case "Area (Hemisphere)":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(enteredValue,2))));break;
                    case "Volume (Hemisphere)":resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( enteredValue, 3 ))));break;
                }
                break;
            case "Diameter (circle)":
                switch (txtFromSpinner2) {
                    case "Radius (circle)":resultView.setText(String.valueOf(formatter.format(radDiam)));break;
                    case "Diameter (circle)":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Circumference (circle)":resultView.setText(String.valueOf(formatter.format(2*PI*radDiam)));break;
                    case "Area (circle)":resultView.setText(String.valueOf(formatter.format(PI*Math.pow(radDiam,2))));break;  //ok
                    case "Area (sphere)":resultView.setText(String.valueOf(formatter.format(4*PI*Math.pow(radDiam,2))));break;
                    case "Volume (sphere)":resultView.setText(String.valueOf(formatter.format((4.0/3.0) * PI * Math.pow( radDiam, 3 ))));break;
                    case "Area (Hemisphere)":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(radDiam,2))));break;
                    case "Volume (Hemisphere)":resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( radDiam, 3 ))));break;
                }
                break;
            case "Circumference (circle)":
                switch (txtFromSpinner2) {
                    case "Radius (circle)":resultView.setText(String.valueOf(formatter.format(radCirc)));break;
                    case "Diameter (circle)":resultView.setText(String.valueOf(formatter.format(radCirc*2)));break;
                    case "Circumference (circle)":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Area (circle)":resultView.setText(String.valueOf(formatter.format(PI*Math.pow(radCirc,2))));break;  //ok
                    case "Area (sphere)":resultView.setText(String.valueOf(formatter.format(4*PI*Math.pow(radCirc,2))));break;
                    case "Volume (sphere)":resultView.setText(String.valueOf(formatter.format((4.0/3.0) * PI * Math.pow( radCirc, 3 ))));break;
                    case "Area (Hemisphere)":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(radCirc,2))));break;
                    case "Volume (Hemisphere)":resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( radCirc, 3 ))));break;
                }
                break;
            case "Area (circle)":
                switch (txtFromSpinner2) {
                    case "Radius (circle)":resultView.setText(String.valueOf(formatter.format(radArea)));break;
                    case "Diameter (circle)":resultView.setText(String.valueOf(formatter.format(radArea*2)));break;
                    case "Circumference (circle)":resultView.setText(String.valueOf(formatter.format(2*PI*radArea)));break;
                    case "Area (circle)":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;  //ok
                    case "Area (sphere)":resultView.setText(String.valueOf(formatter.format(4*PI*Math.pow(radArea,2))));break;
                    case "Volume (sphere)":resultView.setText(String.valueOf(formatter.format((4.0/3.0) * PI * Math.pow( radArea, 3 ))));break;
                    case "Area (Hemisphere)":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(radArea,2))));break;
                    case "Volume (Hemisphere)":resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( radArea, 3 ))));break;
                }
                break;
            case "Area (sphere)":
                switch (txtFromSpinner2) {
                    case "Radius (circle)":resultView.setText(String.valueOf(formatter.format(radSphArea)));break;
                    case "Diameter (circle)":resultView.setText(String.valueOf(formatter.format(radSphArea*2)));break;
                    case "Circumference (circle)":resultView.setText(String.valueOf(formatter.format(2*PI*radSphArea)));break;
                    case "Area (circle)":resultView.setText(String.valueOf(formatter.format(PI*Math.pow(radSphArea,2))));break;  //ok
                    case "Area (sphere)":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Volume (sphere)":resultView.setText(String.valueOf(formatter.format((4.0/3.0) * PI * Math.pow( radSphArea, 3 ))));break;
                    case "Area (Hemisphere)":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(radSphArea,2))));break;
                    case "Volume (Hemisphere)":resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( radSphArea, 3 ))));break;
                }
                break;
            case "Volume (sphere)":
                switch (txtFromSpinner2) {
                    case "Radius (circle)":resultView.setText(String.valueOf(formatter.format(radSphVolume)));break;
                    case "Diameter (circle)":resultView.setText(String.valueOf(formatter.format(radSphVolume*2)));break;
                    case "Circumference (circle)":resultView.setText(String.valueOf(formatter.format(2*PI*radSphVolume)));break;
                    case "Area (circle)":resultView.setText(String.valueOf(formatter.format(PI*Math.pow(radSphVolume,2))));break;  //ok
                    case "Area (sphere)":resultView.setText(String.valueOf(formatter.format(4*PI*Math.pow(radSphVolume,2))));break;
                    case "Volume (sphere)":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Area (Hemisphere)":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(radSphVolume,2))));break;
                    case "Volume (Hemisphere)":resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( radSphVolume, 3 ))));break;
                }
                break;
            case "Area (Hemisphere)":
                switch (txtFromSpinner2) {
                    case "Radius (circle)":resultView.setText(String.valueOf(formatter.format(radSphArea/2)));break;
                    case "Diameter (circle)":resultView.setText(String.valueOf(formatter.format(radSphArea)));break;
                    case "Circumference (circle)":resultView.setText(String.valueOf(formatter.format((2*PI*radSphArea)/2)));break;
                    case "Area (circle)":resultView.setText(String.valueOf(formatter.format((PI*Math.pow(radSphArea,2))/2)));break;  //ok
                    case "Area (sphere)":resultView.setText(String.valueOf(formatter.format(enteredValue*2)));break;
                    case "Volume (sphere)":resultView.setText(String.valueOf(formatter.format(((4.0/3.0) * PI * Math.pow( radSphArea, 3 ))/2)));break;
                    case "Area (Hemisphere)":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Volume (Hemisphere)":resultView.setText(String.valueOf(formatter.format(((2.0/3.0) * PI * Math.pow( radSphArea, 3 )/2))));break;
                }
                break;
            case "Volume (Hemisphere)":
                switch (txtFromSpinner2) {
                    case "Radius (circle)":resultView.setText(String.valueOf(formatter.format(radSphVolume/2)));break;
                    case "Diameter (circle)":resultView.setText(String.valueOf(formatter.format(radSphVolume)));break;
                    case "Circumference (circle)":resultView.setText(String.valueOf(formatter.format((2*PI*radSphVolume)/2)));break;
                    case "Area (circle)":resultView.setText(String.valueOf(formatter.format((PI*Math.pow(radSphVolume,2))/2)));break;  //ok
                    case "Area (sphere)":resultView.setText(String.valueOf(formatter.format((4*PI*Math.pow(radSphVolume,2))/2)));break;
                    case "Volume (sphere)":resultView.setText(String.valueOf(formatter.format(enteredValue*2)));break;
                    case "Area (Hemisphere)":resultView.setText(String.valueOf(formatter.format((2.0*PI* Math.pow(radSphVolume,2))/2)));break;
                    case "Volume (Hemisphere)":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                }
                 */
        }
    }

    public static void ConvertValues_Ukr(String unitConvertFrom, String unitConvertTo, Double valueToConvert, TextView resultValue) {
        NumberFormat formatter = new DecimalFormat("###.########################");
        //0.0000000000003861021585
        final double NineDivFive = 9.0/5.0;
        final double FiveDivNine = 5.0/9.0;
        /*
         final double PI = Math.PI;
        double radDiam = enteredValue/2;
        double radCirc = enteredValue/(2*PI);
        double radArea = Math.sqrt(enteredValue/PI);
        double radSphArea = Math.sqrt(enteredValue/4*PI);
        double radSphVolume = Math.pow(((enteredValue/PI)*(3.0/4.0)),1.0/3.0);
*/
        switch (unitConvertFrom) {
            //area
            case "Міліметр квадратний":
                switch (unitConvertTo) {
                    case "Міліметр квадратний": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Сантіметр квадратний": conversionMultiplier(resultValue, valueToConvert,0.01);break;
                    case "Метр квадратний": conversionMultiplier(resultValue, valueToConvert,0.000001);break;
                    case "Кілометр квадратний": conversionMultiplier(resultValue, valueToConvert,0.000000000001);break;
                    case "Гектар": conversionMultiplier(resultValue, valueToConvert,0.0000000001);break;
                    case "Міля квадратна": conversionMultiplier(resultValue, valueToConvert,0.0000000000003861021585);break;
                    case "Акр": conversionMultiplier(resultValue, valueToConvert,0.0000000002471053814);break;
                    case "Ярд квадратний": conversionMultiplier(resultValue, valueToConvert,0.000001196);break;
                    case "Фут квадратний": conversionMultiplier(resultValue, valueToConvert,0.0000107639);break;
                    case "Дюйм квадратний": conversionMultiplier(resultValue, valueToConvert,0.0015500031);break;
                }
                break;
            case "Сантіметр квадратний":
                switch (unitConvertTo) {
                    case "Міліметр квадратний": conversionMultiplier(resultValue, valueToConvert,100);break;
                    case "Сантіметр квадратний": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Метр квадратний": conversionMultiplier(resultValue, valueToConvert, 0.0001);break;
                    case "Кілометр квадратний": conversionMultiplier(resultValue, valueToConvert, 0.0000000001);break;
                    case "Гектар": conversionMultiplier(resultValue, valueToConvert,0.00000001);break;
                    case "Міля квадратна": conversionMultiplier(resultValue, valueToConvert,0.00000000003861021585);break;
                    case "Акр": conversionMultiplier(resultValue, valueToConvert,0.00000002471053814);break;
                    case "Ярд квадратний": conversionMultiplier(resultValue, valueToConvert,0.000119599);break;
                    case "Фут квадратний": conversionMultiplier(resultValue, valueToConvert,0.001076391);break;
                    case "Дюйм квадратний": conversionMultiplier(resultValue, valueToConvert,0.15500031);break;
                }
                break;
            case "Метр квадратний":
                switch (unitConvertTo) {
                    case "Міліметр квадратний": conversionMultiplier(resultValue, valueToConvert,1000000.0);break;
                    case "Сантіметр квадратний": conversionMultiplier(resultValue, valueToConvert,10000.0);break;
                    case "Метр квадратний": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Кілометр квадратний": conversionMultiplier(resultValue, valueToConvert,0.000001);break;
                    case "Гектар": conversionMultiplier(resultValue, valueToConvert,0.0001);break;
                    case "Міля квадратна": conversionMultiplier(resultValue, valueToConvert,0.0000003861021585);break;
                    case "Акр": conversionMultiplier(resultValue, valueToConvert,0.0002471054);break;
                    case "Ярд квадратний": conversionMultiplier(resultValue, valueToConvert,1.1959900463);break;
                    case "Фут квадратний": conversionMultiplier(resultValue, valueToConvert,10.763910417);break;
                    case "Дюйм квадратний": conversionMultiplier(resultValue, valueToConvert,1550.0031);break;
                }
                break;
            case "Кілометр квадратний":
                switch (unitConvertTo) {
                    case "Міліметр квадратний": conversionMultiplier(resultValue, valueToConvert,1000000000000.0);break;
                    case "Сантіметр квадратний": conversionMultiplier(resultValue, valueToConvert,10000000000.0);break;
                    case "Метр квадратний": conversionMultiplier(resultValue, valueToConvert,1000000.0);break;
                    case "Кілометр квадратний": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Гектар": conversionMultiplier(resultValue, valueToConvert,100.0);break;
                    case "Міля квадратна": conversionMultiplier(resultValue, valueToConvert,0.3861021585);break;
                    case "Акр": conversionMultiplier(resultValue, valueToConvert,247.10538147);break;
                    case "Ярд квадратний": conversionMultiplier(resultValue, valueToConvert,1195990.0463);break;
                    case "Фут квадратний": conversionMultiplier(resultValue, valueToConvert,10763910.417);break;
                    case "Дюйм квадратний": conversionMultiplier(resultValue, valueToConvert,1550003100);break;
                }
                break;
            case "Гектар":
                switch (unitConvertTo) {
                    case "Міліметр квадратний": conversionMultiplier(resultValue, valueToConvert,10000000000.0);break;
                    case "Сантіметр квадратний": conversionMultiplier(resultValue, valueToConvert,100000000);break;
                    case "Метр квадратний": conversionMultiplier(resultValue, valueToConvert,10000);break;
                    case "Кілометр квадратний": conversionMultiplier(resultValue, valueToConvert,0.01);break;
                    case "Гектар": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Міля квадратна": conversionMultiplier(resultValue, valueToConvert,0.0038610216);break;
                    case "Акр": conversionMultiplier(resultValue, valueToConvert,2.4710538147);break;
                    case "Ярд квадратний": conversionMultiplier(resultValue, valueToConvert,11959.900463);break;
                    case "Фут квадратний": conversionMultiplier(resultValue, valueToConvert,107639.10417);break;
                    case "Дюйм квадратний": conversionMultiplier(resultValue, valueToConvert,15500031);break;
                }
                break;
            case "Міля квадратна":
                switch (unitConvertTo) {
                    case "Міліметр квадратний": conversionMultiplier(resultValue, valueToConvert,2589988110336.0);break;
                    case "Сантіметр квадратний": conversionMultiplier(resultValue, valueToConvert,25899881103.0);break;
                    case "Метр квадратний": conversionMultiplier(resultValue, valueToConvert,2589988.1103);break;
                    case "Кілометр квадратний": conversionMultiplier(resultValue, valueToConvert,2.5899881103);break;
                    case "Гектар": conversionMultiplier(resultValue, valueToConvert,258.99881103);break;
                    case "Міля квадратна": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Акр": conversionMultiplier(resultValue, valueToConvert,640);break;
                    case "Ярд квадратний": conversionMultiplier(resultValue, valueToConvert,3097600);break;
                    case "Фут квадратний": conversionMultiplier(resultValue, valueToConvert,27878400);break;
                    case "Дюйм квадратний": conversionMultiplier(resultValue, valueToConvert,4014489600.0);break;
                }
                break;
            case "Акр":
                switch (unitConvertTo) {
                    case "Міліметр квадратний": conversionMultiplier(resultValue, valueToConvert,4046856422.4);break;
                    case "Сантіметр квадратний": conversionMultiplier(resultValue, valueToConvert,40468564.224);break;
                    case "Метр квадратний": conversionMultiplier(resultValue, valueToConvert,4046.8564224);break;
                    case "Кілометр квадратний": conversionMultiplier(resultValue, valueToConvert,0.0040468564);break;
                    case "Гектар": conversionMultiplier(resultValue, valueToConvert,0.4046856422);break;
                    case "Міля квадратна": conversionMultiplier(resultValue, valueToConvert,0.0015625);break;
                    case "Акр": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Ярд квадратний": conversionMultiplier(resultValue, valueToConvert,4840);break;
                    case "Фут квадратний": conversionMultiplier(resultValue, valueToConvert,43560);break;
                    case "Дюйм квадратний": conversionMultiplier(resultValue, valueToConvert,6272640);break;
                }
                break;
            case "Ярд квадратний":
                switch (unitConvertTo) {
                    case "Міліметр квадратний": conversionMultiplier(resultValue, valueToConvert,836127.36);break;
                    case "Сантіметр квадратний": conversionMultiplier(resultValue, valueToConvert,8361.2736);break;
                    case "Метр квадратний": conversionMultiplier(resultValue, valueToConvert,0.83612736);break;
                    case "Кілометр квадратний": conversionMultiplier(resultValue, valueToConvert,0.0000008361273599);break;
                    case "Гектар": conversionMultiplier(resultValue, valueToConvert,0.0000836127);break;
                    case "Міля квадратна": conversionMultiplier(resultValue, valueToConvert,0.0000003228305785);break;
                    case "Акр": conversionMultiplier(resultValue, valueToConvert,0.0002066116);break;
                    case "Ярд квадратний": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Фут квадратний": conversionMultiplier(resultValue, valueToConvert,9);break;
                    case "Дюйм квадратний": conversionMultiplier(resultValue, valueToConvert,1296);break;
                }
                break;
            case "Фут квадратний":
                switch (unitConvertTo) {
                    case "Міліметр квадратний": conversionMultiplier(resultValue, valueToConvert,92903.04);break;
                    case "Сантіметр квадратний": conversionMultiplier(resultValue, valueToConvert,929.0304);break;
                    case "Метр квадратний": conversionMultiplier(resultValue, valueToConvert,0.09290304);break;
                    case "Кілометр квадратний": conversionMultiplier(resultValue, valueToConvert,0.00000009290303999);break;
                    case "Гектар": conversionMultiplier(resultValue, valueToConvert,0.0000092903);break;
                    case "Міля квадратна": conversionMultiplier(resultValue, valueToConvert,0.000000387006427);break;
                    case "Акр": conversionMultiplier(resultValue, valueToConvert,0.0000229568);break;
                    case "Ярд квадратний": conversionMultiplier(resultValue, valueToConvert,0.1111111111);break;
                    case "Фут квадратний": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Дюйм квадратний": conversionMultiplier(resultValue, valueToConvert,144);break;
                }
            case "Дюйм квадратний":
                switch (unitConvertTo) {
                    case "Міліметр квадратний": conversionMultiplier(resultValue, valueToConvert,645.16);break;
                    case "Сантіметр квадратний": conversionMultiplier(resultValue, valueToConvert,6.4516);break;
                    case "Метр квадратний": conversionMultiplier(resultValue, valueToConvert,0.00064516);break;
                    case "Кілометр квадратний": conversionMultiplier(resultValue, valueToConvert,0.00000000064516);break;
                    case "Гектар": conversionMultiplier(resultValue, valueToConvert,0.000000064516);break;
                    case "Міля квадратна": conversionMultiplier(resultValue, valueToConvert,0.000000000290976686);break;
                    case "Акр": conversionMultiplier(resultValue, valueToConvert,0.0000001594225079);break;
                    case "Ярд квадратний": conversionMultiplier(resultValue, valueToConvert,0.0007716049);break;
                    case "Фут квадратний": conversionMultiplier(resultValue, valueToConvert,0.0069444444);break;
                    case "Дюйм квадратний": conversionMultiplier(resultValue, valueToConvert,1);break;
                }
            case "Міліньютон ":
                switch (unitConvertTo) {
                    case "Міліньютон ":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Ньютон":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Кілоньютон":conversionMultiplier(resultValue, valueToConvert,0.000001);break;
                    case "Тонна-сила(метрична)":conversionMultiplier(resultValue, valueToConvert,0.000000101);break;
                    case "Грам-сила":conversionMultiplier(resultValue, valueToConvert,0.1019);break;
                    case "Кілограм-сила":conversionMultiplier(resultValue, valueToConvert,0.000101);break;
                    case "Понд":conversionMultiplier(resultValue, valueToConvert,0.1019);break;
                    case "Фунт-сила":conversionMultiplier(resultValue, valueToConvert,0.00022);break;
                    case "Унція-сила":conversionMultiplier(resultValue, valueToConvert,0.00359);break;
                    case "Тонна-сила(довга)":conversionMultiplier(resultValue, valueToConvert,0.000000100);break;
                    case "Паундаль":conversionMultiplier(resultValue, valueToConvert,0.00723);break;
                }
                break;
            case "Ньютон":
                switch (unitConvertTo) {
                    case "Міліньютон ":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Ньютон":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Кілоньютон":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Тонна-сила(метрична)":conversionMultiplier(resultValue, valueToConvert,0.0001);break;
                    case "Грам-сила":conversionMultiplier(resultValue, valueToConvert,101.971);break;
                    case "Кілограм-сила":conversionMultiplier(resultValue, valueToConvert,0.10197);break;
                    case "Понд":conversionMultiplier(resultValue, valueToConvert,101.971);break;
                    case "Фунт-сила":conversionMultiplier(resultValue, valueToConvert,0.22480);break;
                    case "Унція-сила":conversionMultiplier(resultValue, valueToConvert,3.5969);break;
                    case "Тонна-сила(довга)":conversionMultiplier(resultValue, valueToConvert,0.0001);break;
                    case "Паундаль":conversionMultiplier(resultValue, valueToConvert,7.233);break;
                }
                break;
            case "Кілоньютон":
                switch (unitConvertTo) {
                    case "Міліньютон ":conversionMultiplier(resultValue, valueToConvert,1000000.0);break;
                    case "Ньютон":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Кілоньютон":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Тонна-сила(метрична)":conversionMultiplier(resultValue, valueToConvert,0.101971);break;
                    case "Грам-сила":conversionMultiplier(resultValue, valueToConvert,101971.6);break;
                    case "Кілограм-сила":conversionMultiplier(resultValue, valueToConvert,101.971);break;
                    case "Понд":conversionMultiplier(resultValue, valueToConvert,101971.6);break;
                    case "Фунт-сила":conversionMultiplier(resultValue, valueToConvert,224.81);break;
                    case "Унція-сила":conversionMultiplier(resultValue, valueToConvert,3596.94);break;
                    case "Тонна-сила(довга)":conversionMultiplier(resultValue, valueToConvert,0.1003);break;
                    case "Паундаль":conversionMultiplier(resultValue, valueToConvert,7233.01);break;
                }
                break;
            case "Тонна-сила(метрична)":
                switch (unitConvertTo) {
                    case "Міліньютон ":conversionMultiplier(resultValue, valueToConvert,9806650);break;
                    case "Ньютон":conversionMultiplier(resultValue, valueToConvert,9806.65);break;
                    case "Кілоньютон":conversionMultiplier(resultValue, valueToConvert,9.80665);break;
                    case "Тонна-сила(метрична)":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Грам-сила":conversionMultiplier(resultValue, valueToConvert,1000000.0);break;
                    case "Кілограм-сила":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Понд":conversionMultiplier(resultValue, valueToConvert,1000000.0);break;
                    case "Фунт-сила":conversionMultiplier(resultValue, valueToConvert,2204.62);break;
                    case "Унція-сила":conversionMultiplier(resultValue, valueToConvert,35273.96);break;
                    case "Тонна-сила(довга)":conversionMultiplier(resultValue, valueToConvert,0.9842);break;
                    case "Паундаль":conversionMultiplier(resultValue, valueToConvert,70931.63);break;
                }
                break;
            case "Грам-сила":
                switch (unitConvertTo) {
                    case "Міліньютон ":conversionMultiplier(resultValue, valueToConvert,9.8066);break;
                    case "Ньютон":conversionMultiplier(resultValue, valueToConvert,0.009806);break;
                    case "Кілоньютон":conversionMultiplier(resultValue, valueToConvert,0.0000098067);break;
                    case "Тонна-сила(метрична)":conversionMultiplier(resultValue, valueToConvert,0.000001);break;
                    case "Грам-сила":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Кілограм-сила":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Понд":conversionMultiplier(resultValue, valueToConvert,1.0);break;
                    case "Фунт-сила":conversionMultiplier(resultValue, valueToConvert,0.002204);break;
                    case "Унція-сила":conversionMultiplier(resultValue, valueToConvert,0.03527);break;
                    case "Тонна-сила(довга)":conversionMultiplier(resultValue, valueToConvert,0.0000009842);break;
                    case "Паундаль":conversionMultiplier(resultValue, valueToConvert,0.07093);break;
                }
                break;
            case "Кілограм-сила":
                switch (unitConvertTo) {
                    case "Міліньютон ": conversionMultiplier(resultValue, valueToConvert,9806.65);break;
                    case "Ньютон":conversionMultiplier(resultValue, valueToConvert,9.80665);break;
                    case "Кілоньютон":conversionMultiplier(resultValue, valueToConvert,0.0098066);break;
                    case "Тонна-сила(метрична)":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Грам-сила":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Кілограм-сила":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Понд":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Фунт-сила":conversionMultiplier(resultValue, valueToConvert,2.20);break;
                    case "Унція-сила":conversionMultiplier(resultValue, valueToConvert,35.273);break;
                    case "Тонна-сила(довга)":conversionMultiplier(resultValue, valueToConvert,0.0009842);break;
                    case "Паундаль":conversionMultiplier(resultValue, valueToConvert,70.931);break;
                }
                break;
            case "Понд":
                switch (unitConvertTo) {
                    case "Міліньютон ": conversionMultiplier(resultValue, valueToConvert,9.80665);break;
                    case "Ньютон":conversionMultiplier(resultValue, valueToConvert,0.00980);break;
                    case "Кілоньютон":conversionMultiplier(resultValue, valueToConvert,0.0000098);break;
                    case "Тонна-сила(метрична)":conversionMultiplier(resultValue, valueToConvert,0.000001);break;
                    case "Грам-сила":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Кілограм-сила":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Понд":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Фунт-сила":conversionMultiplier(resultValue, valueToConvert,0.002204);break;
                    case "Унція-сила":conversionMultiplier(resultValue, valueToConvert,0.03527);break;
                    case "Тонна-сила(довга)":conversionMultiplier(resultValue, valueToConvert,0.0000009842);break;
                    case "Паундаль":conversionMultiplier(resultValue, valueToConvert,0.07093);break;
                }
                break;
            case "Фунт-сила":
                switch (unitConvertTo) {
                    case "Міліньютон ":conversionMultiplier(resultValue, valueToConvert,4448.221);break;
                    case "Ньютон":conversionMultiplier(resultValue, valueToConvert,4.448);break;
                    case "Кілоньютон":conversionMultiplier(resultValue, valueToConvert,0.00444);break;
                    case "Тонна-сила(метрична)":conversionMultiplier(resultValue, valueToConvert,0.00045);break;
                    case "Грам-сила":conversionMultiplier(resultValue, valueToConvert,453.59);break;
                    case "Кілограм-сила":conversionMultiplier(resultValue, valueToConvert,0.45359);break;
                    case "Понд":conversionMultiplier(resultValue, valueToConvert,453.59);break;
                    case "Фунт-сила":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Унція-сила":conversionMultiplier(resultValue, valueToConvert,16);break;
                    case "Тонна-сила(довга)":conversionMultiplier(resultValue, valueToConvert,0.0004464);break;
                    case "Паундаль":conversionMultiplier(resultValue, valueToConvert,32.174);break;
                }
                break;
            case "Унція-сила":
                switch (unitConvertTo) {
                    case "Міліньютон ":conversionMultiplier(resultValue, valueToConvert,278.013);break;
                    case "Ньютон":conversionMultiplier(resultValue, valueToConvert,0.27801);break;
                    case "Кілоньютон":conversionMultiplier(resultValue, valueToConvert,0.0002780);break;
                    case "Тонна-сила(метрична)":conversionMultiplier(resultValue, valueToConvert,0.0000283);break;
                    case "Грам-сила":conversionMultiplier(resultValue, valueToConvert,28.349);break;
                    case "Кілограм-сила":conversionMultiplier(resultValue, valueToConvert,0.02834);break;
                    case "Понд":conversionMultiplier(resultValue, valueToConvert,28.349);break;
                    case "Фунт-сила":conversionMultiplier(resultValue, valueToConvert,0.0625);break;
                    case "Унція-сила":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Тонна-сила(довга)":conversionMultiplier(resultValue, valueToConvert,0.0000279);break;
                    case "Паундаль":conversionMultiplier(resultValue, valueToConvert,2.010);break;
                }
                break;
            case "Тонна-сила(довга)":
                switch (unitConvertTo) {
                    case "Міліньютон ":conversionMultiplier(resultValue, valueToConvert,9964016.41);break;
                    case "Ньютон":conversionMultiplier(resultValue, valueToConvert,9964.01);break;
                    case "Кілоньютон":conversionMultiplier(resultValue, valueToConvert,9.9640);break;
                    case "Тонна-сила(метрична)":conversionMultiplier(resultValue, valueToConvert,1.016);break;
                    case "Грам-сила":conversionMultiplier(resultValue, valueToConvert,1016046.90);break;
                    case "Кілограм-сила":conversionMultiplier(resultValue, valueToConvert,1016.046);break;
                    case "Понд":conversionMultiplier(resultValue, valueToConvert,1016046.90);break;
                    case "Фунт-сила":conversionMultiplier(resultValue, valueToConvert,2240.0);break;
                    case "Унція-сила":conversionMultiplier(resultValue, valueToConvert,35840.0);break;
                    case "Тонна-сила(довга)":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Паундаль":conversionMultiplier(resultValue, valueToConvert,72069.86);break;
                }
                break;
            case "Паундаль":
                switch (unitConvertTo) {
                    case "Міліньютон ":conversionMultiplier(resultValue, valueToConvert,138.25);break;
                    case "Ньютон":conversionMultiplier(resultValue, valueToConvert,0.13825);break;
                    case "Кілоньютон":conversionMultiplier(resultValue, valueToConvert,0.000138);break;
                    case "Тонна-сила(метрична)":conversionMultiplier(resultValue, valueToConvert,0.0000140);break;
                    case "Грам-сила":conversionMultiplier(resultValue, valueToConvert,14.09);break;
                    case "Кілограм-сила":conversionMultiplier(resultValue, valueToConvert,0.01409);break;
                    case "Понд":conversionMultiplier(resultValue, valueToConvert,14.09);break;
                    case "Фунт-сила":conversionMultiplier(resultValue, valueToConvert,0.03108);break;
                    case "Унція-сила":conversionMultiplier(resultValue, valueToConvert,0.4972);break;
                    case "Тонна-сила(довга)":conversionMultiplier(resultValue, valueToConvert,0.0000138);break;
                    case "Паундаль":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
            case "Міліметр":
                switch (unitConvertTo){
                    case "Міліметр":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Сантіметр":conversionMultiplier(resultValue, valueToConvert,0.1);break;
                    case "Метр":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Кілометр":conversionMultiplier(resultValue, valueToConvert,0.000001);break;
                    case "Дюйм":conversionMultiplier(resultValue, valueToConvert,0.03937);break;
                    case "Фут":conversionMultiplier(resultValue, valueToConvert,0.003280);break;
                    case "Ярд":conversionMultiplier(resultValue, valueToConvert,0.001093);break;
                    case "Міля":conversionMultiplier(resultValue, valueToConvert,0.0000062137);break;
                }
                break;
            case "Сантіметр":
                switch (unitConvertTo){
                    case "Міліметр":conversionMultiplier(resultValue, valueToConvert,10);break;
                    case "Сантіметр":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Метр":conversionMultiplier(resultValue, valueToConvert,0.01);break;
                    case "Кілометр":conversionMultiplier(resultValue, valueToConvert,0.00001);break;
                    case "Дюйм":conversionMultiplier(resultValue, valueToConvert,0.3937);break;
                    case "Фут":conversionMultiplier(resultValue, valueToConvert,0.03280);break;
                    case "Ярд":conversionMultiplier(resultValue, valueToConvert,0.01093);break;
                    case "Міля":conversionMultiplier(resultValue, valueToConvert,0.000006213);break;
                }
                break;
            case "Метр":
                switch (unitConvertTo){
                    case "Міліметр":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Сантіметр":conversionMultiplier(resultValue, valueToConvert,100);break;
                    case "Метр":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Кілометр":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Дюйм":conversionMultiplier(resultValue, valueToConvert,39.37007);break;
                    case "Фут":conversionMultiplier(resultValue, valueToConvert,3.2808);break;
                    case "Ярд":conversionMultiplier(resultValue, valueToConvert,1.09361);break;
                    case "Міля":conversionMultiplier(resultValue, valueToConvert,0.00062137);break;
                }
                break;
            case "Кілометр":
                switch (unitConvertTo){
                    case "Міліметр":conversionMultiplier(resultValue, valueToConvert,1000000.0);break;
                    case "Сантіметр":conversionMultiplier(resultValue, valueToConvert,100000.0);break;
                    case "Метр":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Кілометр":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Дюйм":conversionMultiplier(resultValue, valueToConvert,39370.08);break;
                    case "Фут":conversionMultiplier(resultValue, valueToConvert,3280.84);break;
                    case "Ярд":conversionMultiplier(resultValue, valueToConvert,1093.6132);break;
                    case "Міля":conversionMultiplier(resultValue, valueToConvert,0.6214);break;
                }
                break;
            case "Дюйм":
                switch (unitConvertTo){
                    case "Міліметр":conversionMultiplier(resultValue, valueToConvert,25.4);break;
                    case "Сантіметр":conversionMultiplier(resultValue, valueToConvert,2.54);break;
                    case "Метр":conversionMultiplier(resultValue, valueToConvert,0.0254);break;
                    case "Кілометр":conversionMultiplier(resultValue, valueToConvert,0.0000254);break;
                    case "Дюйм":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Фут":conversionMultiplier(resultValue, valueToConvert,0.08333);break;
                    case "Ярд":conversionMultiplier(resultValue, valueToConvert,0.02777);break;
                    case "Міля":conversionMultiplier(resultValue, valueToConvert,0.00001578);break;
                }
                break;
            case "Фут":
                switch (unitConvertTo){
                    case "Міліметр":conversionMultiplier(resultValue, valueToConvert,304.8);break;
                    case "Сантіметр":conversionMultiplier(resultValue, valueToConvert,30.48);break;
                    case "Метр":conversionMultiplier(resultValue, valueToConvert,0.3048);break;
                    case "Кілометр":conversionMultiplier(resultValue, valueToConvert,0.0003048);break;
                    case "Дюйм":conversionMultiplier(resultValue, valueToConvert,12);break;
                    case "Фут":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Ярд":conversionMultiplier(resultValue, valueToConvert,0.33333);break;
                    case "Міля":conversionMultiplier(resultValue, valueToConvert,0.0001893936);break;
                }
                break;
            case "Ярд":
                switch (unitConvertTo){
                    case "Міліметр":conversionMultiplier(resultValue, valueToConvert,914.4);break;
                    case "Сантіметр":conversionMultiplier(resultValue, valueToConvert,91.44);break;
                    case "Метр":conversionMultiplier(resultValue, valueToConvert,0.9144);break;
                    case "Кілометр":conversionMultiplier(resultValue, valueToConvert,0.0009144);break;
                    case "Дюйм":conversionMultiplier(resultValue, valueToConvert,36);break;
                    case "Фут":conversionMultiplier(resultValue, valueToConvert,3);break;
                    case "Ярд":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Міля":conversionMultiplier(resultValue, valueToConvert,0.0005681);break;
                }
                break;
            case "Міля":
                switch (unitConvertTo){
                    case "Міліметр":conversionMultiplier(resultValue, valueToConvert,1609347.21);break;
                    case "Сантіметр":conversionMultiplier(resultValue, valueToConvert,160934.72);break;
                    case "Метр":conversionMultiplier(resultValue, valueToConvert,1609.34);break;
                    case "Кілометр":conversionMultiplier(resultValue, valueToConvert,1.6093);break;
                    case "Дюйм":conversionMultiplier(resultValue, valueToConvert,63360.12);break;
                    case "Фут":conversionMultiplier(resultValue, valueToConvert,5280.010);break;
                    case "Ярд":conversionMultiplier(resultValue, valueToConvert,1760);break;
                    case "Міля":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
            case "Міліграм":
                switch (unitConvertTo){
                    case "Грам":conversionMultiplier(resultValue, valueToConvert,0.001); break;
                    case "Кілограм":conversionMultiplier(resultValue, valueToConvert,0.000001); break;
                    case "Тонна":conversionMultiplier(resultValue, valueToConvert,0.000000001); break;
                    case "Гран":conversionMultiplier(resultValue, valueToConvert,0.0154); break;
                    case "Унція":conversionMultiplier(resultValue, valueToConvert,0.000035); break;
                    case "Фунт":conversionMultiplier(resultValue, valueToConvert,0.0000022); break;
                    case "Хандредвейт":conversionMultiplier(resultValue, valueToConvert,0.00000002); break;
                    case "Тонна(довга)":conversionMultiplier(resultValue, valueToConvert,0.000000001016); break;
                    case "Міліграм":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Грам":
                switch (unitConvertTo){
                    case "Міліграм":conversionMultiplier(resultValue, valueToConvert,1000.0); break;
                    case "Кілограм":conversionMultiplier(resultValue, valueToConvert,0.001); break;
                    case "Тонна": conversionMultiplier(resultValue, valueToConvert,0.000000001); break;
                    case "Гран":conversionMultiplier(resultValue, valueToConvert,15.43); break;
                    case "Унція":conversionMultiplier(resultValue, valueToConvert,0.03527); break;
                    case "Фунт":conversionMultiplier(resultValue, valueToConvert,0.002204); break;
                    case "Хандредвейт":conversionMultiplier(resultValue, valueToConvert,0.0000196); break;
                    case "Тонна(довга)":conversionMultiplier(resultValue, valueToConvert,0.0000009); break;
                    case "Грам":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Кілограм":
                switch (unitConvertTo){
                    case "Міліграм":conversionMultiplier(resultValue, valueToConvert,1000000.0); break;
                    case "Грам":conversionMultiplier(resultValue, valueToConvert,1000.0); break;
                    case "Тонна":conversionMultiplier(resultValue, valueToConvert,0.001); break;
                    case "Гран":conversionMultiplier(resultValue, valueToConvert,15432.35); break;
                    case "Унція":conversionMultiplier(resultValue, valueToConvert,35.27); break;
                    case "Фунт":conversionMultiplier(resultValue, valueToConvert,2.20); break;
                    case "Хандредвейт":conversionMultiplier(resultValue, valueToConvert,0.01968); break;
                    case "Тонна(довга)":conversionMultiplier(resultValue, valueToConvert,0.000984); break;
                    case "Кілограм":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Тонна":
                switch (unitConvertTo){
                    case "Міліграм":conversionMultiplier(resultValue, valueToConvert,1000000000.0); break;
                    case "Грам":conversionMultiplier(resultValue, valueToConvert,1000000.0); break;
                    case "Кілограм":conversionMultiplier(resultValue, valueToConvert,1000.0); break;
                    case "Гран":conversionMultiplier(resultValue, valueToConvert,15432358.35); break;
                    case "Унція":conversionMultiplier(resultValue, valueToConvert,35273.96); break;
                    case "Фунт":conversionMultiplier(resultValue, valueToConvert,2204.62); break;
                    case "Хандредвейт":conversionMultiplier(resultValue, valueToConvert,19.68); break;
                    case "Тонна(довга)":conversionMultiplier(resultValue, valueToConvert,0.9842); break;
                    case "Тонна":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Гран":
                switch (unitConvertTo){
                    case "Міліграм":conversionMultiplier(resultValue, valueToConvert,64.79); break;
                    case "Грам":conversionMultiplier(resultValue, valueToConvert,0.0647); break;
                    case "Кілограм":conversionMultiplier(resultValue, valueToConvert,0.000064); break;
                    case "Тонна":conversionMultiplier(resultValue, valueToConvert,0.000000065); break;
                    case "Унція":conversionMultiplier(resultValue, valueToConvert,0.00228); break;
                    case "Фунт":conversionMultiplier(resultValue, valueToConvert,0.000142857); break;
                    case "Хандредвейт":conversionMultiplier(resultValue, valueToConvert,0.000001429); break;
                    case "Тонна(довга)":conversionMultiplier(resultValue, valueToConvert,0.000000064); break;
                    case "Гран":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Унція":
                switch (unitConvertTo){
                    case "Міліграм":conversionMultiplier(resultValue, valueToConvert,28349.52); break;
                    case "Грам":conversionMultiplier(resultValue, valueToConvert,28.349); break;
                    case "Кілограм":conversionMultiplier(resultValue, valueToConvert,0.02834); break;
                    case "Тонна":conversionMultiplier(resultValue, valueToConvert,0.00002835); break;
                    case "Гран":conversionMultiplier(resultValue, valueToConvert,437.49); break;
                    case "Фунт":conversionMultiplier(resultValue, valueToConvert,0.0625); break;
                    case "Хандредвейт":conversionMultiplier(resultValue, valueToConvert,0.000558036); break;
                    case "Тонна(довга)":conversionMultiplier(resultValue, valueToConvert,0.0000279022); break;
                    case "Унція":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Фунт":
                switch (unitConvertTo){
                    case "Міліграм":conversionMultiplier(resultValue, valueToConvert,453592.37); break;
                    case "Грам":conversionMultiplier(resultValue, valueToConvert,453.59); break;
                    case "Кілограм":conversionMultiplier(resultValue, valueToConvert,0.4535); break;
                    case "Тонна":conversionMultiplier(resultValue, valueToConvert,0.0004535); break;
                    case "Гран":conversionMultiplier(resultValue, valueToConvert,6999.99); break;
                    case "Унція":conversionMultiplier(resultValue, valueToConvert,16); break;
                    case "Хандредвейт":conversionMultiplier(resultValue, valueToConvert,0.008928571); break;
                    case "Тонна(довга)":conversionMultiplier(resultValue, valueToConvert,0.000446429); break;
                    case "Фунт":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Хандредвейт":
                switch (unitConvertTo){
                    case "Міліграм":conversionMultiplier(resultValue, valueToConvert,50802345.44); break;
                    case "Грам":conversionMultiplier(resultValue, valueToConvert,50802.34); break;
                    case "Кілограм": conversionMultiplier(resultValue, valueToConvert,50.80); break;
                    case "Тонна":conversionMultiplier(resultValue, valueToConvert,0.05080); break;
                    case "Гран":conversionMultiplier(resultValue, valueToConvert,783999.999); break;
                    case "Унція":conversionMultiplier(resultValue, valueToConvert,1792); break;
                    case "Фунт":conversionMultiplier(resultValue, valueToConvert,112); break;
                    case "Тонна(довга)":conversionMultiplier(resultValue, valueToConvert,0.05); break;
                    case "Хандредвейт":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case  "Тонна(довга)":
                switch (unitConvertTo){
                    case "Міліграм":conversionMultiplier(resultValue, valueToConvert,1016046908.8); break;
                    case "Грам":conversionMultiplier(resultValue, valueToConvert,1016046.90); break;
                    case "Кілограм":conversionMultiplier(resultValue, valueToConvert,1016.04); break;
                    case "Тонна":conversionMultiplier(resultValue, valueToConvert,1.016); break;
                    case "Гран":conversionMultiplier(resultValue, valueToConvert,15679999.99); break;
                    case "Унція":conversionMultiplier(resultValue, valueToConvert,35840.0); break;
                    case "Фунт":conversionMultiplier(resultValue, valueToConvert,2240.0); break;
                    case "Хандредвейт":conversionMultiplier(resultValue, valueToConvert,20.0); break;
                    case "Тонна(довга)":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
            case "Метрів/секунда":
                switch (unitConvertTo) {
                    case "Метрів/секунда":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Метрів/година":conversionMultiplier(resultValue, valueToConvert,3600);break;
                    case "Кілометр/секунда":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Кілометр/година":conversionMultiplier(resultValue, valueToConvert,3.6);break;
                    case "Фут/секунда":conversionMultiplier(resultValue, valueToConvert,3.28);break;
                    case "Фут/година":conversionMultiplier(resultValue, valueToConvert,11811.02);break;
                    case "Міль/година":conversionMultiplier(resultValue, valueToConvert,2.23);break;
                    case "Вузол/В":conversionMultiplier(resultValue, valueToConvert,1.943);break;
                }
                break;
            case "Метрів/година":
                switch (unitConvertTo) {
                    case "Метрів/секунда":conversionMultiplier(resultValue, valueToConvert,0.00027);break;
                    case "Метрів/година":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Кілометр/секунда":conversionMultiplier(resultValue, valueToConvert,0.0000002777777777);break;
                    case "Кілометр/година":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Фут/секунда":conversionMultiplier(resultValue, valueToConvert,0.0009);break;
                    case "Фут/година":conversionMultiplier(resultValue, valueToConvert,3.28);break;
                    case "Міль/година":conversionMultiplier(resultValue, valueToConvert,0.00062);break;
                    case "Вузол/В":conversionMultiplier(resultValue, valueToConvert,0.00053);break;
                }
                break;
            case "Кілометр/секунда":
                switch (unitConvertTo) {
                    case "Метрів/секунда":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Метрів/година":conversionMultiplier(resultValue, valueToConvert,3600000);break;
                    case "Кілометр/секунда":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Кілометр/година":conversionMultiplier(resultValue, valueToConvert,3600);break;
                    case "Фут/секунда":conversionMultiplier(resultValue, valueToConvert,3280.83);break;
                    case "Фут/година":conversionMultiplier(resultValue, valueToConvert,11811023.6);break;
                    case "Міль/година":conversionMultiplier(resultValue, valueToConvert,2236.9);break;
                    case "Вузол/В":conversionMultiplier(resultValue, valueToConvert,1943.8);break;
                }
                break;
            case "Кілометр/година":
                switch (unitConvertTo) {
                    case "Метрів/секунда":conversionMultiplier(resultValue, valueToConvert,0.2777);break;
                    case "Метрів/година":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Кілометр/секунда":conversionMultiplier(resultValue, valueToConvert,0.00027);break;
                    case "Кілометр/година":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Фут/секунда":conversionMultiplier(resultValue, valueToConvert,0.911);break;
                    case "Фут/година":conversionMultiplier(resultValue, valueToConvert,3280.8);break;
                    case "Міль/година":conversionMultiplier(resultValue, valueToConvert,0.621);break;
                    case "Вузол/В":conversionMultiplier(resultValue, valueToConvert,0.539);break;
                }
                break;
            case "Фут/секунда":
                switch (unitConvertTo) {
                    case "Метрів/секунда":conversionMultiplier(resultValue, valueToConvert,0.3048);break;
                    case "Метрів/година":conversionMultiplier(resultValue, valueToConvert,1097.28);break;
                    case "Кілометр/секунда":conversionMultiplier(resultValue, valueToConvert,0.0003048);break;
                    case "Кілометр/година":conversionMultiplier(resultValue, valueToConvert,1.09728);break;
                    case "Фут/секунда":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Фут/година":conversionMultiplier(resultValue, valueToConvert,3600);break;
                    case "Міль/година":conversionMultiplier(resultValue, valueToConvert,0.681);break;
                    case "Вузол/В":conversionMultiplier(resultValue, valueToConvert,0.5924);break;
                }
                break;
            case "Фут/година":
                switch (unitConvertTo) {
                    case "Метрів/секунда":conversionMultiplier(resultValue, valueToConvert,0.000084);break;
                    case "Метрів/година":conversionMultiplier(resultValue, valueToConvert,0.3);break;
                    case "Кілометр/секунда":conversionMultiplier(resultValue, valueToConvert,0.00000008466666666);break;
                    case "Кілометр/година":conversionMultiplier(resultValue, valueToConvert,0.00030);break;
                    case "Фут/секунда":conversionMultiplier(resultValue, valueToConvert,0.00027);break;
                    case "Фут/година":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Міль/година":conversionMultiplier(resultValue, valueToConvert,0.00018);break;
                    case "Вузол/В":conversionMultiplier(resultValue, valueToConvert,0.00016);break;
                }
                break;
            case "Міль/година":
                switch (unitConvertTo) {
                    case "Метрів/секунда":conversionMultiplier(resultValue, valueToConvert,0.44);break;
                    case "Метрів/година":conversionMultiplier(resultValue, valueToConvert,1609.3);break;
                    case "Кілометр/секунда":conversionMultiplier(resultValue, valueToConvert,0.00044);break;
                    case "Кілометр/година":conversionMultiplier(resultValue, valueToConvert,1.6);break;
                    case "Фут/секунда":conversionMultiplier(resultValue, valueToConvert,1.46);break;
                    case "Фут/година":conversionMultiplier(resultValue, valueToConvert,5280);break;
                    case "Міль/година":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Вузол/В":conversionMultiplier(resultValue, valueToConvert,0.8689);break;
                }
                break;
            case "Вузол/В":
                switch (unitConvertTo) {
                    case "Метрів/секунда":conversionMultiplier(resultValue, valueToConvert,0.514);break;
                    case "Метрів/година":conversionMultiplier(resultValue, valueToConvert,1852);break;
                    case "Кілометр/секунда":conversionMultiplier(resultValue, valueToConvert,0.00051);break;
                    case "Кілометр/година":conversionMultiplier(resultValue, valueToConvert,1.852);break;
                    case "Фут/секунда":conversionMultiplier(resultValue, valueToConvert,1.687);break;
                    case "Фут/година":conversionMultiplier(resultValue, valueToConvert,6076.11);break;
                    case "Міль/година":conversionMultiplier(resultValue, valueToConvert,1.150);break;
                    case "Вузол/В":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Цельсій":
                switch (unitConvertTo) {
                    case "Цельсій":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Фаренгейт":
                        resultValue.setText(String.valueOf(formatter.format((valueToConvert *NineDivFive)+32)));break;
                    case "Кельвін":
                        resultValue.setText(String.valueOf(formatter.format(valueToConvert + 273.15)));break;
                    case "Ранкін":
                        resultValue.setText(String.valueOf(formatter.format(valueToConvert *NineDivFive+491.67)));break;
                }
                break;
            case "Кельвін":
                switch (unitConvertTo) {
                    case "Цельсій":
                        resultValue.setText(String.valueOf(formatter.format(valueToConvert -273.15)));break;//here
                    case "Фаренгейт":
                        resultValue.setText(String.valueOf(formatter.format((valueToConvert -273.15)*NineDivFive +32)));break; //here
                    case "Кельвін":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Ранкін":conversionMultiplier(resultValue, valueToConvert,1.8);break;
                }
                break;
            case "Ранкін":
                switch (unitConvertTo) {
                    case "Цельсій":
                        resultValue.setText(String.valueOf(formatter.format((valueToConvert -491.67)*FiveDivNine)));break;//here
                    case "Фаренгейт":
                        resultValue.setText(String.valueOf(formatter.format(valueToConvert -459.67)));break;
                    case "Кельвін":conversionMultiplier(resultValue, valueToConvert,FiveDivNine);break;
                    case "Ранкін":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                break;
            case "Фаренгейт":
                switch (unitConvertTo) {
                    case "Цельсій":
                        resultValue.setText(String.valueOf(formatter.format((valueToConvert -32)*FiveDivNine)));break;
                    case "Фаренгейт":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Кельвін":
                        resultValue.setText(String.valueOf(formatter.format((valueToConvert -32)*FiveDivNine+273.15)));break;
                    case "Ранкін":
                        resultValue.setText(String.valueOf(formatter.format(valueToConvert + 459.67)));break;
                }
            case "Секунди":
                switch (unitConvertTo) {
                    case "Секунди": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Хвилини": conversionMultiplier(resultValue, valueToConvert,0.0166666667);break;
                    case "Година": conversionMultiplier(resultValue, valueToConvert,0.0002777778);break;
                    case "День": conversionMultiplier(resultValue, valueToConvert,0.0000115741);break;
                    case "Тиждень": conversionMultiplier(resultValue, valueToConvert,0.0000016534);break;
                    case "Місяц": conversionMultiplier(resultValue, valueToConvert,0.0000003805175038);break;
                    case "Рік": conversionMultiplier(resultValue, valueToConvert,0.00000003170979198);break;
                }
                break;
            case "Хвилини":
                switch (unitConvertTo) {
                    case "Секунди": conversionMultiplier(resultValue, valueToConvert,60);break;
                    case "Хвилини": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Година": conversionMultiplier(resultValue, valueToConvert,0.0166666667);break;
                    case "День": conversionMultiplier(resultValue, valueToConvert,0.0006944444);break;
                    case "Тиждень": conversionMultiplier(resultValue, valueToConvert,0.0000992063);break;
                    case "Місяц": conversionMultiplier(resultValue, valueToConvert,0.0000228311);break;
                    case "Рік": conversionMultiplier(resultValue, valueToConvert,0.0000019026);break;
                }
                break;
            case "Година":
                switch (unitConvertTo) {
                    case "Секунди": conversionMultiplier(resultValue, valueToConvert,3600);break;
                    case "Хвилини": conversionMultiplier(resultValue, valueToConvert,60);break;
                    case "Година": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "День": conversionMultiplier(resultValue, valueToConvert,0.0416666667);break;
                    case "Тиждень": conversionMultiplier(resultValue, valueToConvert,0.005952381);break;
                    case "Місяц": conversionMultiplier(resultValue, valueToConvert,0.001369863);break;
                    case "Рік": conversionMultiplier(resultValue, valueToConvert,0.0001141553);break;
                }
                break;
            case "День":
                switch (unitConvertTo) {
                    case "Секунди": conversionMultiplier(resultValue, valueToConvert,604800);break;
                    case "Хвилини": conversionMultiplier(resultValue, valueToConvert,10080);break;
                    case "Година": conversionMultiplier(resultValue, valueToConvert,168);break;
                    case "День": conversionMultiplier(resultValue, valueToConvert,7);break;
                    case "Тиждень": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Місяц": conversionMultiplier(resultValue, valueToConvert,0.23);break;
                    case "Рік": conversionMultiplier(resultValue, valueToConvert,0.19);break;
                }
                break;
            case "Тиждень":
                switch (unitConvertTo) {
                    case "Секунди": conversionMultiplier(resultValue, valueToConvert,604800);break;
                    case "Хвилини": conversionMultiplier(resultValue, valueToConvert,10080);break;
                    case "Година": conversionMultiplier(resultValue, valueToConvert,168);break;
                    case "День": conversionMultiplier(resultValue, valueToConvert,7);break;
                    case "Тиждень": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Місяц": conversionMultiplier(resultValue, valueToConvert,0.2301369863);break;
                    case "Рік": conversionMultiplier(resultValue, valueToConvert,0.0191780822);break;
                }
                break;
            case "Місяц":
                switch (unitConvertTo) {
                    case "Секунди": conversionMultiplier(resultValue, valueToConvert,2628000);break;
                    case "Хвилини": conversionMultiplier(resultValue, valueToConvert,43800);break;
                    case "Година": conversionMultiplier(resultValue, valueToConvert,730);break;
                    case "День": conversionMultiplier(resultValue, valueToConvert,30.416666667);break;
                    case "Тиждень": conversionMultiplier(resultValue, valueToConvert,4.3452380952);break;
                    case "Місяц": conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Рік": conversionMultiplier(resultValue, valueToConvert,0.0833333333);break;
                }
                break;
            case "Рік":
                switch (unitConvertTo) {
                    case "Секунди": conversionMultiplier(resultValue, valueToConvert,31536000);break;
                    case "Хвилини": conversionMultiplier(resultValue, valueToConvert,525600);break;
                    case "Година": conversionMultiplier(resultValue, valueToConvert,8760);break;
                    case "День": conversionMultiplier(resultValue, valueToConvert,365);break;
                    case "Тиждень": conversionMultiplier(resultValue, valueToConvert,52.142857143);break;
                    case "Місяц": conversionMultiplier(resultValue, valueToConvert,12);break;
                    case "Рік": conversionMultiplier(resultValue, valueToConvert,1);break;
                }
            case "Міліметр кубічний":
                switch (unitConvertTo) {
                    case "Міліметр кубічний":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Сантіметр кубічний":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Метр кубічний":conversionMultiplier(resultValue, valueToConvert,0.000000001);break;
                    case "Мілілітр":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Літр":conversionMultiplier(resultValue, valueToConvert,0.000001);break;
                    case "Унція рідка":conversionMultiplier(resultValue, valueToConvert,0.0000351951);break;
                    case "Джил":conversionMultiplier(resultValue, valueToConvert,0.000007039);break;
                    case "Пінта":conversionMultiplier(resultValue, valueToConvert,0.0000017598);break;
                    case "Кварт":conversionMultiplier(resultValue, valueToConvert,0.0000008798769931);break;
                    case "Галлон":conversionMultiplier(resultValue, valueToConvert,0.0000002199692482);break;
                    case "Баррель(UK)":conversionMultiplier(resultValue, valueToConvert,0.000000006110256897);break;
                }
                break;
            case "Сантіметр кубічний":
                switch (unitConvertTo) {
                    case "Міліметр кубічний":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Сантіметр кубічний":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Метр кубічний":conversionMultiplier(resultValue, valueToConvert,0.000001);break;
                    case "Мілілітр":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Літр":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Унція рідка":conversionMultiplier(resultValue, valueToConvert,0.0351950797);break;
                    case "Джил":conversionMultiplier(resultValue, valueToConvert,0.0070390159);break;
                    case "Пінта":conversionMultiplier(resultValue, valueToConvert,0.001759754);break;
                    case "Кварт":conversionMultiplier(resultValue, valueToConvert,0.000879877);break;
                    case "Галлон":conversionMultiplier(resultValue, valueToConvert,0.0002199692);break;
                    case "Баррель(UK)":conversionMultiplier(resultValue, valueToConvert,0.0000002199692482);break;
                }
                break;
            case "Метр кубічний":
                switch (unitConvertTo) {
                    case "Міліметр кубічний":conversionMultiplier(resultValue, valueToConvert,1000000.0000);break;
                    case "Сантіметр кубічний":conversionMultiplier(resultValue, valueToConvert,1000000.0);break;
                    case "Метр кубічний":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Мілілітр":conversionMultiplier(resultValue, valueToConvert,1000000.0);break;
                    case "Літр":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Унція рідка":conversionMultiplier(resultValue, valueToConvert,35195.079728);break;
                    case "Джил":conversionMultiplier(resultValue, valueToConvert,7039.0159456);break;
                    case "Пінта":conversionMultiplier(resultValue, valueToConvert,1759.7539864);break;
                    case "Кварт":conversionMultiplier(resultValue, valueToConvert,879.8769932);break;
                    case "Галлон":conversionMultiplier(resultValue, valueToConvert,219.9692483);break;
                    case "Баррель(UK)":conversionMultiplier(resultValue, valueToConvert,6.1102568972);break;
                }
                break;
            case "Мілілітр":
                switch (unitConvertTo) {
                    case "Міліметр кубічний":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Сантіметр кубічний":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Метр кубічний":conversionMultiplier(resultValue, valueToConvert,0.000001);break;
                    case "Мілілітр":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Літр":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Унція рідка":conversionMultiplier(resultValue, valueToConvert,0.0351950797);break;
                    case "Джил":conversionMultiplier(resultValue, valueToConvert,0.0070390159);break;
                    case "Пінта":conversionMultiplier(resultValue, valueToConvert,0.001759754);break;
                    case "Кварт":conversionMultiplier(resultValue, valueToConvert,0.000879877);break;
                    case "Галлон":conversionMultiplier(resultValue, valueToConvert,0.0002199692);break;
                    case "Баррель(UK)":conversionMultiplier(resultValue, valueToConvert,0.0000061103);break;
                }
                break;
            case "Літр":
                switch (unitConvertTo) {
                    case "Міліметр кубічний":conversionMultiplier(resultValue, valueToConvert,1000000.0);break;
                    case "Сантіметр кубічний":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Метр кубічний":conversionMultiplier(resultValue, valueToConvert,0.001);break;
                    case "Мілілітр":conversionMultiplier(resultValue, valueToConvert,1000);break;
                    case "Літр":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Унція рідка":conversionMultiplier(resultValue, valueToConvert,35.195079728);break;
                    case "Джил":conversionMultiplier(resultValue, valueToConvert,7.0390159456);break;
                    case "Пінта":conversionMultiplier(resultValue, valueToConvert,1.7597539864);break;
                    case "Кварт":conversionMultiplier(resultValue, valueToConvert,0.8798769932);break;
                    case "Галлон":conversionMultiplier(resultValue, valueToConvert,0.2199692483);break;
                    case "Баррель(UK)":conversionMultiplier(resultValue, valueToConvert,0.0061102569);break;
                }
                break;
            case "Джил":
                switch (unitConvertTo) {
                    case "Міліметр кубічний":conversionMultiplier(resultValue, valueToConvert,142065.3125);break;
                    case "Сантіметр кубічний":conversionMultiplier(resultValue, valueToConvert,142.0653125);break;
                    case "Метр кубічний":conversionMultiplier(resultValue, valueToConvert,0.0001420653);break;
                    case "Мілілітр":conversionMultiplier(resultValue, valueToConvert,142.0653125);break;
                    case "Літр":conversionMultiplier(resultValue, valueToConvert,0.1420653125);break;
                    case "Унція рідка":conversionMultiplier(resultValue, valueToConvert,5);break;
                    case "Джил":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Пінта":conversionMultiplier(resultValue, valueToConvert,0.25);break;
                    case "Кварт":conversionMultiplier(resultValue, valueToConvert,0.125);break;
                    case "Галлон":conversionMultiplier(resultValue, valueToConvert,0.03125);break;
                    case "Баррель(UK)":conversionMultiplier(resultValue, valueToConvert,0.0008680556);break;
                }
                break;
            case "Унція рідка":
                switch (unitConvertTo) {
                    case "Міліметр кубічний":conversionMultiplier(resultValue, valueToConvert,28413.0625);break;
                    case "Сантіметр кубічний":conversionMultiplier(resultValue, valueToConvert,28.4130625);break;
                    case "Метр кубічний":conversionMultiplier(resultValue, valueToConvert,0.0000284131);break;
                    case "Мілілітр":conversionMultiplier(resultValue, valueToConvert,28.4130625);break;
                    case "Літр":conversionMultiplier(resultValue, valueToConvert,0.0284130625);break;
                    case "Унція рідка":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Джил":conversionMultiplier(resultValue, valueToConvert,0.2);break;
                    case "Пінта":conversionMultiplier(resultValue, valueToConvert,0.05);break;
                    case "Кварт":conversionMultiplier(resultValue, valueToConvert,0.025);break;
                    case "Галлон":conversionMultiplier(resultValue, valueToConvert,0.00625);break;
                    case "Баррель(UK)":conversionMultiplier(resultValue, valueToConvert,0.0001736111);break;
                }
                break;
            case "Пінта":
                switch (unitConvertTo) {
                    case "Міліметр кубічний":conversionMultiplier(resultValue, valueToConvert,568261.25);break;
                    case "Сантіметр кубічний":conversionMultiplier(resultValue, valueToConvert,568.26125);break;
                    case "Метр кубічний":conversionMultiplier(resultValue, valueToConvert,0.0005682613);break;
                    case "Мілілітр":conversionMultiplier(resultValue, valueToConvert,568.26125);break;
                    case "Літр":conversionMultiplier(resultValue, valueToConvert,0.56826125);break;
                    case "Унція рідка":conversionMultiplier(resultValue, valueToConvert,20);break;
                    case "Джил":conversionMultiplier(resultValue, valueToConvert,4);break;
                    case "Пінта":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Кварт":conversionMultiplier(resultValue, valueToConvert,0.5);break;
                    case "Галлон":conversionMultiplier(resultValue, valueToConvert,0.125);break;
                    case "Баррель(UK)":conversionMultiplier(resultValue, valueToConvert,0.0034722222);break;
                }
                break;
            case "Кварт":
                switch (unitConvertTo) {
                    case "Міліметр кубічний":conversionMultiplier(resultValue, valueToConvert,1136522.5);break;
                    case "Сантіметр кубічний":conversionMultiplier(resultValue, valueToConvert,1136.5225);break;
                    case "Метр кубічний":conversionMultiplier(resultValue, valueToConvert,0.0011365225);break;
                    case "Мілілітр":conversionMultiplier(resultValue, valueToConvert,1136.5225);break;
                    case "Літр":conversionMultiplier(resultValue, valueToConvert,1.1365225);break;
                    case "Унція рідка":conversionMultiplier(resultValue, valueToConvert,40);break;
                    case "Джил":conversionMultiplier(resultValue, valueToConvert,8);break;
                    case "Пінта":conversionMultiplier(resultValue, valueToConvert,2);break;
                    case "Кварт":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Галлон":conversionMultiplier(resultValue, valueToConvert,0.25);break;
                    case "Баррель(UK)":conversionMultiplier(resultValue, valueToConvert,0.0069444444);break;
                }
                break;
            case "Галлон":
                switch (unitConvertTo) {
                    case "Міліметр кубічний":conversionMultiplier(resultValue, valueToConvert,4546090);break;
                    case "Сантіметр кубічний":conversionMultiplier(resultValue, valueToConvert,4546.09);break;
                    case "Метр кубічний":conversionMultiplier(resultValue, valueToConvert,0.00454609);break;
                    case "Мілілітр":conversionMultiplier(resultValue, valueToConvert,4546.09);break;
                    case "Літр":conversionMultiplier(resultValue, valueToConvert,3.785);break;
                    case "Унція рідка":conversionMultiplier(resultValue, valueToConvert,160);break;
                    case "Джил":conversionMultiplier(resultValue, valueToConvert,32);break;
                    case "Пінта":conversionMultiplier(resultValue, valueToConvert,8);break;
                    case "Кварт":conversionMultiplier(resultValue, valueToConvert,4);break;
                    case "Галлон":conversionMultiplier(resultValue, valueToConvert,1);break;
                    case "Баррель(UK)":conversionMultiplier(resultValue, valueToConvert,0.0277777778);break;
                }
                break;
            case "Баррель(UK)":
                switch (unitConvertTo) {
                    case "Міліметр кубічний":conversionMultiplier(resultValue, valueToConvert,163659240);break;
                    case "Сантіметр кубічний":conversionMultiplier(resultValue, valueToConvert,163659.24);break;
                    case "Метр кубічний":conversionMultiplier(resultValue, valueToConvert,0.16365924);break;
                    case "Мілілітр":conversionMultiplier(resultValue, valueToConvert,163659.24);break;
                    case "Літр":conversionMultiplier(resultValue, valueToConvert,163.65924);break;
                    case "Унція рідка":conversionMultiplier(resultValue, valueToConvert,5760);break;
                    case "Джил":conversionMultiplier(resultValue, valueToConvert,1152);break;
                    case "Пінта":conversionMultiplier(resultValue, valueToConvert,288);break;
                    case "Кварт":conversionMultiplier(resultValue, valueToConvert,144);break;
                    case "Галлон":conversionMultiplier(resultValue, valueToConvert,36);break;
                    case "Баррель(UK)":conversionMultiplier(resultValue, valueToConvert,1);break;
                }
                /*
            case "Радіус кругу":
                switch (txtFromSpinner2) {
                    case "Радіус кругу":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Діаметер кругу":resultView.setText(String.valueOf(formatter.format(enteredValue*2)));break;
                    case "Окружність кругу":resultView.setText(String.valueOf(formatter.format(2*PI*enteredValue)));break;
                    case "Площа кругу":resultView.setText(String.valueOf(formatter.format(PI*Math.pow(enteredValue,2))));break;  //ok
                    case "Площа сфери":resultView.setText(String.valueOf(formatter.format(4*PI*Math.pow(enteredValue,2))));break;
                    case "Об’єм сфери":resultView.setText(String.valueOf(formatter.format((4.0/3.0) * PI * Math.pow( enteredValue, 3))));break;
                    case "Площа напівсфери":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(enteredValue,2))));break;
                    case "Об’єм напівсфери" :resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( enteredValue, 3 ))));break;
                }
                break;
            case "Діаметер кругу":
                switch (txtFromSpinner2) {
                    case "Радіус кругу":resultView.setText(String.valueOf(formatter.format(radDiam)));break;
                    case "Діаметер кругу":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Окружність кругу":resultView.setText(String.valueOf(formatter.format(2*PI*radDiam)));break;
                    case "Площа кругу":resultView.setText(String.valueOf(formatter.format(PI*Math.pow(radDiam,2))));break;  //ok
                    case "Площа сфери":resultView.setText(String.valueOf(formatter.format(4*PI*Math.pow(radDiam,2))));break;
                    case "Об’єм сфери":resultView.setText(String.valueOf(formatter.format((4.0/3.0) * PI * Math.pow( radDiam, 3 ))));break;
                    case "Площа напівсфери":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(radDiam,2))));break;
                    case "Об’єм напівсфери" :resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( radDiam, 3 ))));break;
                }
                break;
            case "Окружність кругу":
                switch (txtFromSpinner2) {
                    case "Радіус кругу":resultView.setText(String.valueOf(formatter.format(radCirc)));break;
                    case "Діаметер кругу":resultView.setText(String.valueOf(formatter.format(radCirc*2)));break;
                    case "Окружність кругу":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Площа кругу":resultView.setText(String.valueOf(formatter.format(PI*Math.pow(radCirc,2))));break;  //ok
                    case "Площа сфери":resultView.setText(String.valueOf(formatter.format(4*PI*Math.pow(radCirc,2))));break;
                    case "Об’єм сфери":resultView.setText(String.valueOf(formatter.format((4.0/3.0) * PI * Math.pow( radCirc, 3 ))));break;
                    case "Площа напівсфери":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(radCirc,2))));break;
                    case "Об’єм напівсфери" :resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( radCirc, 3 ))));break;
                }
                break;
            case "Площа кругу":
                switch (txtFromSpinner2) {
                    case "Радіус кругу":resultView.setText(String.valueOf(formatter.format(radArea)));break;
                    case "Діаметер кругу":resultView.setText(String.valueOf(formatter.format(radArea*2)));break;
                    case "Окружність кругу":resultView.setText(String.valueOf(formatter.format(2*PI*radArea)));break;
                    case "Площа кругу":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;  //ok
                    case "Площа сфери":resultView.setText(String.valueOf(formatter.format(4*PI*Math.pow(radArea,2))));break;
                    case "Об’єм сфери":resultView.setText(String.valueOf(formatter.format((4.0/3.0) * PI * Math.pow( radArea, 3 ))));break;
                    case "Площа напівсфери":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(radArea,2))));break;
                    case "Об’єм напівсфери" :resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( radArea, 3 ))));break;
                }
                break;
            case "Площа сфери":
                switch (txtFromSpinner2) {
                    case "Радіус кругу":resultView.setText(String.valueOf(formatter.format(radSphArea)));break;
                    case "Діаметер кругу":resultView.setText(String.valueOf(formatter.format(radSphArea*2)));break;
                    case "Окружність кругу":resultView.setText(String.valueOf(formatter.format(2*PI*radSphArea)));break;
                    case "Площа кругу":resultView.setText(String.valueOf(formatter.format(PI*Math.pow(radSphArea,2))));break;  //ok
                    case "Площа сфери":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Об’єм сфери":resultView.setText(String.valueOf(formatter.format((4.0/3.0) * PI * Math.pow( radSphArea, 3 ))));break;
                    case "Площа напівсфери":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(radSphArea,2))));break;
                    case "Об’єм напівсфери" :resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( radSphArea, 3 ))));break;
                }
                break;
            case "Об’єм сфери":
                switch (txtFromSpinner2) {
                    case "Радіус кругу":resultView.setText(String.valueOf(formatter.format(radSphVolume)));break;
                    case "Діаметер кругу":resultView.setText(String.valueOf(formatter.format(radSphVolume*2)));break;
                    case "Окружність кругу":resultView.setText(String.valueOf(formatter.format(2*PI*radSphVolume)));break;
                    case "Площа кругу":resultView.setText(String.valueOf(formatter.format(PI*Math.pow(radSphVolume,2))));break;  //ok
                    case "Площа сфери":resultView.setText(String.valueOf(formatter.format(4*PI*Math.pow(radSphVolume,2))));break;
                    case "Об’єм сфери":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Площа напівсфери":resultView.setText(String.valueOf(formatter.format(2.0*PI* Math.pow(radSphVolume,2))));break;
                    case "Об’єм напівсфери" :resultView.setText(String.valueOf(formatter.format((2.0/3.0) * PI * Math.pow( radSphVolume, 3 ))));break;
                }
                break;
            case "Площа напівсфери":
                switch (txtFromSpinner2) {
                    case "Радіус кругу":resultView.setText(String.valueOf(formatter.format(radSphArea/2)));break;
                    case "Діаметер кругу":resultView.setText(String.valueOf(formatter.format(radSphArea)));break;
                    case "Окружність кругу":resultView.setText(String.valueOf(formatter.format((2*PI*radSphArea)/2)));break;
                    case "Площа кругу":resultView.setText(String.valueOf(formatter.format((PI*Math.pow(radSphArea,2))/2)));break;  //ok
                    case "Площа сфери":resultView.setText(String.valueOf(formatter.format(enteredValue*2)));break;
                    case "Об’єм сфери":resultView.setText(String.valueOf(formatter.format(((4.0/3.0) * PI * Math.pow( radSphArea, 3 ))/2)));break;
                    case "Площа напівсфери":resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                    case "Об’єм напівсфери" :resultView.setText(String.valueOf(formatter.format(((2.0/3.0) * PI * Math.pow( radSphArea, 3 )/2))));break;
                }
                break;
            case "Об’єм напівсфери" :
                switch (txtFromSpinner2) {
                    case "Радіус кругу":resultView.setText(String.valueOf(formatter.format(radSphVolume/2)));break;
                    case "Діаметер кругу":resultView.setText(String.valueOf(formatter.format(radSphVolume)));break;
                    case "Окружність кругу":resultView.setText(String.valueOf(formatter.format((2*PI*radSphVolume)/2)));break;
                    case "Площа кругу":resultView.setText(String.valueOf(formatter.format((PI*Math.pow(radSphVolume,2))/2)));break;  //ok
                    case "Площа сфери":resultView.setText(String.valueOf(formatter.format((4*PI*Math.pow(radSphVolume,2))/2)));break;
                    case "Об’єм сфери":resultView.setText(String.valueOf(formatter.format(enteredValue*2)));break;
                    case "Площа напівсфери":resultView.setText(String.valueOf(formatter.format((2.0*PI* Math.pow(radSphVolume,2))/2)));break;
                    case "Об’єм напівсфери" :resultView.setText(String.valueOf(formatter.format(enteredValue)));break;
                }
                */
                break;
        }
    }

}

