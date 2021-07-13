package com.ashunevich.conversionlibrary;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

@SuppressWarnings("ALL")
public class UnitConverter {
    final static double NineDivFive = 9.0 / 5.0;
    final static double FiveDivNine = 5.0 / 9.0;

    private static String conversionMultiplier(double value, double multiplier) {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.getDefault());
        otherSymbols.setDecimalSeparator('.');
        NumberFormat formatter = new DecimalFormat("###.#######################",otherSymbols);
        return formatter.format(value * multiplier);
    }

    private static String temperatureConversion(double value) {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.getDefault());
        otherSymbols.setDecimalSeparator('.');
        NumberFormat formatter = new DecimalFormat("###.##",otherSymbols);
        return formatter.format(value);
    }

    public static String ConvertValues(String basicUnit, String targetUnit, Double basicValue) {

        switch (basicUnit) {
            //!----AREA----!
            case "Square millimeter":
                switch (targetUnit) {
                    case "Square millimeter":
                        return conversionMultiplier(basicValue, 1);
                    case "Square centimeter":
                        return conversionMultiplier(basicValue, 0.01);
                    case "Square meter":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Square kilometer":
                        return conversionMultiplier(basicValue, 0.000000000001);
                    case "Hectare":
                        return conversionMultiplier(basicValue, 0.0000000001);
                    case "Square mile":
                        return conversionMultiplier(basicValue, 0.0000000000003861021585);
                    case "Acre":
                        return conversionMultiplier(basicValue, 0.0000000002471053814);
                    case "Square yard":
                        return conversionMultiplier(basicValue, 0.000001196);
                    case "Square feet":
                        return conversionMultiplier(basicValue, 0.0000107639);
                    case "Square inch":
                        return conversionMultiplier(basicValue, 0.0015500031);
                }
            case "Square centimeter":
                switch (targetUnit) {
                    case "Square millimeter":
                        return conversionMultiplier(basicValue, 100);
                    case "Square centimeter":
                        return conversionMultiplier(basicValue, 1);
                    case "Square meter":
                        return conversionMultiplier(basicValue, 0.0001);
                    case "Square kilometer":
                        return conversionMultiplier(basicValue, 0.0000000001);
                    case "Hectare":
                        return conversionMultiplier(basicValue, 0.00000001);
                    case "Square mile":
                        return conversionMultiplier(basicValue, 0.00000000003861021585);
                    case "Acre":
                        return conversionMultiplier(basicValue, 0.00000002471053814);
                    case "Square yard":
                        return conversionMultiplier(basicValue, 0.000119599);
                    case "Square feet":
                        return conversionMultiplier(basicValue, 0.001076391);
                    case "Square inch":
                        return conversionMultiplier(basicValue, 0.15500031);
                }
            case "Square meter":
                switch (targetUnit) {
                    case "Square millimeter":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Square centimeter":
                        return conversionMultiplier(basicValue, 10000.0);
                    case "Square meter":
                        return conversionMultiplier(basicValue, 1);
                    case "Square kilometer":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Hectare":
                        return conversionMultiplier(basicValue, 0.0001);
                    case "Square mile":
                        return conversionMultiplier(basicValue, 0.0000003861021585);
                    case "Acre":
                        return conversionMultiplier(basicValue, 0.0002471054);
                    case "Square yard":
                        return conversionMultiplier(basicValue, 1.1959900463);
                    case "Square feet":
                        return conversionMultiplier(basicValue, 10.763910417);
                    case "Square inch":
                        return conversionMultiplier(basicValue, 1550.0031);
                }
            case "Square kilometer":
                switch (targetUnit) {
                    case "Square millimeter":
                        return conversionMultiplier(basicValue, 1000000000000.0);
                    case "Square centimeter":
                        return conversionMultiplier(basicValue, 10000000000.0);
                    case "Square meter":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Square kilometer":
                        return conversionMultiplier(basicValue, 1);
                    case "Hectare":
                        return conversionMultiplier(basicValue, 100.0);
                    case "Square mile":
                        return conversionMultiplier(basicValue, 0.3861021585);
                    case "Acre":
                        return conversionMultiplier(basicValue, 247.10538147);
                    case "Square yard":
                        return conversionMultiplier(basicValue, 1195990.0463);
                    case "Square feet":
                        return conversionMultiplier(basicValue, 10763910.417);
                    case "Square inch":
                        return conversionMultiplier(basicValue, 1550003100);
                }
            case "Hectare":
                switch (targetUnit) {
                    case "Square millimeter":
                        return conversionMultiplier(basicValue, 10000000000.0);
                    case "Square centimeter":
                        return conversionMultiplier(basicValue, 100000000);
                    case "Square meter":
                        return conversionMultiplier(basicValue, 10000);
                    case "Square kilometer":
                        return conversionMultiplier(basicValue, 0.01);
                    case "Hectare":
                        return conversionMultiplier(basicValue, 1);
                    case "Square mile":
                        return conversionMultiplier(basicValue, 0.0038610216);
                    case "Acre":
                        return conversionMultiplier(basicValue, 2.4710538147);
                    case "Square yard":
                        return conversionMultiplier(basicValue, 11959.900463);
                    case "Square feet":
                        return conversionMultiplier(basicValue, 107639.10417);
                    case "Square inch":
                        return conversionMultiplier(basicValue, 15500031);
                }
            case "Square mile":
                switch (targetUnit) {
                    case "Square millimeter":
                        return conversionMultiplier(basicValue, 2589988110336.0);
                    case "Square centimeter":
                        return conversionMultiplier(basicValue, 25899881103.0);
                    case "Square meter":
                        return conversionMultiplier(basicValue, 2589988.1103);
                    case "Square kilometer":
                        return conversionMultiplier(basicValue, 2.5899881103);
                    case "Hectare":
                        return conversionMultiplier(basicValue, 258.99881103);
                    case "Square mile":
                        return conversionMultiplier(basicValue, 1);
                    case "Acre":
                        return conversionMultiplier(basicValue, 640);
                    case "Square yard":
                        return conversionMultiplier(basicValue, 3097600);
                    case "Square feet":
                        return conversionMultiplier(basicValue, 27878400);
                    case "Square inch":
                        return conversionMultiplier(basicValue, 4014489600.0);
                }
            case "Acre":
                switch (targetUnit) {
                    case "Square millimeter":
                        return conversionMultiplier(basicValue, 4046856422.4);
                    case "Square centimeter":
                        return conversionMultiplier(basicValue, 40468564.224);
                    case "Square meter":
                        return conversionMultiplier(basicValue, 4046.8564224);
                    case "Square kilometer":
                        return conversionMultiplier(basicValue, 0.0040468564);
                    case "Hectare":
                        return conversionMultiplier(basicValue, 0.4046856422);
                    case "Square mile":
                        return conversionMultiplier(basicValue, 0.0015625);
                    case "Acre":
                        return conversionMultiplier(basicValue, 1);
                    case "Square yard":
                        return conversionMultiplier(basicValue, 4840);
                    case "Square feet":
                        return conversionMultiplier(basicValue, 43560);
                    case "Square inch":
                        return conversionMultiplier(basicValue, 6272640);
                }
            case "Square yard":
                switch (targetUnit) {
                    case "Square millimeter":
                        return conversionMultiplier(basicValue, 836127.36);
                    case "Square centimeter":
                        return conversionMultiplier(basicValue, 8361.2736);
                    case "Square meter":
                        return conversionMultiplier(basicValue, 0.83612736);
                    case "Square kilometer":
                        return conversionMultiplier(basicValue, 0.0000008361273599);
                    case "Hectare":
                        return conversionMultiplier(basicValue, 0.0000836127);
                    case "Square mile":
                        return conversionMultiplier(basicValue, 0.0000003228305785);
                    case "Acre":
                        return conversionMultiplier(basicValue, 0.0002066116);
                    case "Square yard":
                        return conversionMultiplier(basicValue, 1);
                    case "Square feet":
                        return conversionMultiplier(basicValue, 9);
                    case "Square inch":
                        return conversionMultiplier(basicValue, 1296);
                }
            case "Square feet":
                switch (targetUnit) {
                    case "Square millimeter":
                        return conversionMultiplier(basicValue, 92903.04);
                    case "Square centimeter":
                        return conversionMultiplier(basicValue, 929.0304);
                    case "Square meter":
                        return conversionMultiplier(basicValue, 0.09290304);
                    case "Square kilometer":
                        return conversionMultiplier(basicValue, 0.00000009290303999);
                    case "Hectare":
                        return conversionMultiplier(basicValue, 0.0000092903);
                    case "Square mile":
                        return conversionMultiplier(basicValue, 0.000000387006427);
                    case "Acre":
                        return conversionMultiplier(basicValue, 0.0000229568);
                    case "Square yard":
                        return conversionMultiplier(basicValue, 0.1111111111);
                    case "Square feet":
                        return conversionMultiplier(basicValue, 1);
                    case "Square inch":
                        return conversionMultiplier(basicValue, 144);
                }
            case "Square inch":
                switch (targetUnit) {
                    case "Square millimeter":
                        return conversionMultiplier(basicValue, 645.16);
                    case "Square centimeter":
                        return conversionMultiplier(basicValue, 6.4516);
                    case "Square meter":
                        return conversionMultiplier(basicValue, 0.00064516);
                    case "Square kilometer":
                        return conversionMultiplier(basicValue, 0.00000000064516);
                    case "Hectare":
                        return conversionMultiplier(basicValue, 0.000000064516);
                    case "Square mile":
                        return conversionMultiplier(basicValue, 0.000000000290976686);
                    case "Acre":
                        return conversionMultiplier(basicValue, 0.0000001594225079);
                    case "Square yard":
                        return conversionMultiplier(basicValue, 0.0007716049);
                    case "Square feet":
                        return conversionMultiplier(basicValue, 0.0069444444);
                    case "Дюйм квадратний":
                        return conversionMultiplier(basicValue, 1);
                }
                //!----FORCE----!
            case "Millinewton":
                switch (targetUnit) {
                    case "Millinewton":
                        return conversionMultiplier(basicValue, 1);
                    case "Newton":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Kilonewton":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Ton-force(metric)":
                        return conversionMultiplier(basicValue, 0.000000101);
                    case "Gram-force":
                    case "Pond":
                        return conversionMultiplier(basicValue, 0.1019);
                    case "Kilogram-force":
                        return conversionMultiplier(basicValue, 0.000101);//equals to gram-force
                    case "Pound-force":
                        return conversionMultiplier(basicValue, 0.00022);
                    case "Ounce-force":
                        return conversionMultiplier(basicValue, 0.00359);
                    case "Ton-force (long)":
                        return conversionMultiplier(basicValue, 0.000000100);
                    case "Poundal":
                        return conversionMultiplier(basicValue, 0.00723);
                }
            case "Newton":
                switch (targetUnit) {
                    case "Millinewton":
                        return conversionMultiplier(basicValue, 1000);
                    case "Newton":
                        return conversionMultiplier(basicValue, 1);
                    case "Kilonewton":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Ton-force(metric)":
                        return conversionMultiplier(basicValue, 0.000101);
                    case "Gram-force":
                    case "Pond":
                        return conversionMultiplier(basicValue, 101.971);
                    case "Kilogram-force":
                        return conversionMultiplier(basicValue, 0.10197);//equals to gram-force
                    case "Pound-force":
                        return conversionMultiplier(basicValue, 0.22480);
                    case "Ounce-force":
                        return conversionMultiplier(basicValue, 3.5969);
                    case "Ton-force (long)":
                        return conversionMultiplier(basicValue, 0.000100);
                    case "Poundal":
                        return conversionMultiplier(basicValue, 7.233);
                }
            case "Kilonewton":
                switch (targetUnit) {
                    case "Millinewton":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Newton":
                        return conversionMultiplier(basicValue, 1000);
                    case "Kilonewton":
                        return conversionMultiplier(basicValue, 1);
                    case "Ton-force(metric)":
                        return conversionMultiplier(basicValue, 0.101);
                    case "Gram-force":
                    case "Pond":
                        return conversionMultiplier(basicValue, 101971.6);
                    case "Kilogram-force":
                        return conversionMultiplier(basicValue, 101.971);//equals to gram-force
                    case "Pound-force":
                        return conversionMultiplier(basicValue, 224.81);
                    case "Ounce-force":
                        return conversionMultiplier(basicValue, 3596.94);
                    case "Ton-force (long)":
                        return conversionMultiplier(basicValue, 0.100);
                    case "Poundal":
                        return conversionMultiplier(basicValue, 7233.01);
                }
            case "Ton-force(metric)":
                switch (targetUnit) {
                    case "Millinewton":
                        return conversionMultiplier(basicValue, 9806650);
                    case "Newton":
                        return conversionMultiplier(basicValue, 9806.65);
                    case "Kilonewton":
                        return conversionMultiplier(basicValue, 9.80665);
                    case "Ton-force(metric)":
                        return conversionMultiplier(basicValue, 1);
                    case "Gram-force":
                    case "Pond":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Kilogram-force":
                        return conversionMultiplier(basicValue, 1000);//equals to gram-force
                    case "Pound-force":
                        return conversionMultiplier(basicValue, 2204.62);
                    case "Ounce-force":
                        return conversionMultiplier(basicValue, 35273.96);
                    case "Ton-force (long)":
                        return conversionMultiplier(basicValue, 0.9842);
                    case "Poundal":
                        return conversionMultiplier(basicValue, 70931.63);
                }
            case "Gram-force":
                switch (targetUnit) {
                    case "Millinewton":
                        return conversionMultiplier(basicValue, 9.8066);
                    case "Newton":
                        return conversionMultiplier(basicValue, 0.009806);
                    case "Kilonewton":
                        return conversionMultiplier(basicValue, 0.0000098067);
                    case "Ton-force(metric)":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Gram-force":
                    case "Pond":
                        return conversionMultiplier(basicValue, 1);
                    case "Kilogram-force":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Pound-force":
                        return conversionMultiplier(basicValue, 0.002204);
                    case "Ounce-force":
                        return conversionMultiplier(basicValue, 0.03527);
                    case "Ton-force (long)":
                        return conversionMultiplier(basicValue, 0.0000009842065276);
                    case "Poundal":
                        return conversionMultiplier(basicValue, 0.07093);
                }
            case "Kilogram-force":
                switch (targetUnit) {
                    case "Millinewton":
                        return conversionMultiplier(basicValue, 9806.65);
                    case "Newton":
                        return conversionMultiplier(basicValue, 9.80665);
                    case "Kilonewton":
                        return conversionMultiplier(basicValue, 0.0098066);
                    case "Ton-force(metric)":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Gram-force":
                    case "Pond":
                        return conversionMultiplier(basicValue, 1000);
                    case "Kilogram-force":
                        return conversionMultiplier(basicValue, 1);
                    case "Pound-force":
                        return conversionMultiplier(basicValue, 2.20);
                    case "Ounce-force":
                        return conversionMultiplier(basicValue, 35.273);
                    case "Ton-force (long)":
                        return conversionMultiplier(basicValue, 0.0009842);
                    case "Poundal":
                        return conversionMultiplier(basicValue, 70.931);
                }
            case "Pond":
                switch (targetUnit) {
                    case "Millinewton":
                        return conversionMultiplier(basicValue, 9.80665);
                    case "Newton":
                        return conversionMultiplier(basicValue, 0.00980);
                    case "Kilonewton":
                        return conversionMultiplier(basicValue, 0.0000098);
                    case "Ton-force(metric)":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Gram-force":
                        return conversionMultiplier(basicValue, 1);
                    case "Kilogram-force":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Pond":
                        return conversionMultiplier(basicValue, 1.0);
                    case "Pound-force":
                        return conversionMultiplier(basicValue, 0.002204);
                    case "Ounce-force":
                        return conversionMultiplier(basicValue, 0.03527);
                    case "Ton-force (long)":
                        return conversionMultiplier(basicValue, 0.0000009842065276);
                    case "Poundal":
                        return conversionMultiplier(basicValue, 0.07093);
                }
            case "Pound-force":
                switch (targetUnit) {
                    case "Millinewton":
                        return conversionMultiplier(basicValue, 4448.221);
                    case "Newton":
                        return conversionMultiplier(basicValue, 4.448);
                    case "Kilonewton":
                        return conversionMultiplier(basicValue, 0.00444);
                    case "Ton-force(metric)":
                        return conversionMultiplier(basicValue, 0.00045);
                    case "Gram-force":
                    case "Pond":
                        return conversionMultiplier(basicValue, 453.59);
                    case "Kilogram-force":
                        return conversionMultiplier(basicValue, 0.45359);
                    case "Pound-force":
                        return conversionMultiplier(basicValue, 1);
                    case "Ounce-force":
                        return conversionMultiplier(basicValue, 16);
                    case "Ton-force (long)":
                        return conversionMultiplier(basicValue, 0.0004464);
                    case "Poundal":
                        return conversionMultiplier(basicValue, 32.174);
                }
            case "Ounce-force":
                switch (targetUnit) {
                    case "Millinewton":
                        return conversionMultiplier(basicValue, 278.013);
                    case "Newton":
                        return conversionMultiplier(basicValue, 0.27801);
                    case "Kilonewton":
                        return conversionMultiplier(basicValue, 0.0002780);
                    case "Ton-force(metric)":
                        return conversionMultiplier(basicValue, 0.0000283);
                    case "Gram-force":
                    case "Pond":
                        return conversionMultiplier(basicValue, 28.349);
                    case "Kilogram-force":
                        return conversionMultiplier(basicValue, 0.02834);
                    case "Pound-force":
                        return conversionMultiplier(basicValue, 0.0625);
                    case "Ounce-force":
                        return conversionMultiplier(basicValue, 1);
                    case "Ton-force (long)":
                        return conversionMultiplier(basicValue, 0.0000279);
                    case "Poundal":
                        return conversionMultiplier(basicValue, 2.010);
                }
            case "Ton-force (long)":
                switch (targetUnit) {
                    case "Millinewton":
                        return conversionMultiplier(basicValue, 9964016.41);
                    case "Newton":
                        return conversionMultiplier(basicValue, 9964.01);
                    case "Kilonewton":
                        return conversionMultiplier(basicValue, 9.9640);
                    case "Ton-force(metric)":
                        return conversionMultiplier(basicValue, 1.016);
                    case "Gram-force":
                    case "Pond":
                        return conversionMultiplier(basicValue, 1016046.90);
                    case "Kilogram-force":
                        return conversionMultiplier(basicValue, 1016.046);
                    case "Pound-force":
                        return conversionMultiplier(basicValue, 2240.0);
                    case "Ounce-force":
                        return conversionMultiplier(basicValue, 35840.0);
                    case "Ton-force (long)":
                        return conversionMultiplier(basicValue, 1);
                    case "Poundal":
                        return conversionMultiplier(basicValue, 72069.86);
                }
            case "Poundal":
                switch (targetUnit) {
                    case "Millinewton":
                        return conversionMultiplier(basicValue, 138.25);
                    case "Newton":
                        return conversionMultiplier(basicValue, 0.13825);
                    case "Kilonewton":
                        return conversionMultiplier(basicValue, 0.000138);
                    case "Ton-force(metric)":
                        return conversionMultiplier(basicValue, 0.0000140);
                    case "Gram-force":
                    case "Pond":
                        return conversionMultiplier(basicValue, 14.09);
                    case "Kilogram-force":
                        return conversionMultiplier(basicValue, 0.01409);
                    case "Pound-force":
                        return conversionMultiplier(basicValue, 0.03108);
                    case "Ounce-force":
                        return conversionMultiplier(basicValue, 0.4972);
                    case "Ton-force (long)":
                        return conversionMultiplier(basicValue, 0.0000138);
                    case "Poundal":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Millimetre":
                switch (targetUnit) {
                    case "Millimetre":
                        return conversionMultiplier(basicValue, 1);
                    case "Centimetre":
                        return conversionMultiplier(basicValue, 0.1);
                    case "Metre":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Kilometre":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Inch":
                        return conversionMultiplier(basicValue, 0.03937);
                    case "Foot":
                        return conversionMultiplier(basicValue, 0.003280);
                    case "Yard":
                        return conversionMultiplier(basicValue, 0.001093);
                    case "Mile":
                        return conversionMultiplier(basicValue, 0.0000062137);
                }
            case "Centimetre":
                switch (targetUnit) {
                    case "Millimetre":
                        return conversionMultiplier(basicValue, 10);
                    case "Centimetre":
                        return conversionMultiplier(basicValue, 1);
                    case "Metre":
                        return conversionMultiplier(basicValue, 0.01);
                    case "Kilometre":
                        return conversionMultiplier(basicValue, 0.00001);
                    case "Inch":
                        return conversionMultiplier(basicValue, 0.3937);
                    case "Foot":
                        return conversionMultiplier(basicValue, 0.03280);
                    case "Yard":
                        return conversionMultiplier(basicValue, 0.01093);
                    case "Mile":
                        return conversionMultiplier(basicValue, 0.000006213);
                }
            case "Metre":
                switch (targetUnit) {
                    case "Millimetre":
                        return conversionMultiplier(basicValue, 1000);
                    case "Centimetre":
                        return conversionMultiplier(basicValue, 100);
                    case "Metre":
                        return conversionMultiplier(basicValue, 1);
                    case "Kilometre":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Inch":
                        return conversionMultiplier(basicValue, 39.37007);
                    case "Foot":
                        return conversionMultiplier(basicValue, 3.2808);
                    case "Yard":
                        return conversionMultiplier(basicValue, 1.09361);
                    case "Mile":
                        return conversionMultiplier(basicValue, 0.00062137);
                }
            case "Kilometre":
                switch (targetUnit) {
                    case "Millimetre":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Centimetre":
                        return conversionMultiplier(basicValue, 100000.0);
                    case "Metre":
                        return conversionMultiplier(basicValue, 1000);
                    case "Kilometre":
                        return conversionMultiplier(basicValue, 1);
                    case "Inch":
                        return conversionMultiplier(basicValue, 39370.08);
                    case "Foot":
                        return conversionMultiplier(basicValue, 3280.84);
                    case "Yard":
                        return conversionMultiplier(basicValue, 1093.6132);
                    case "Mile":
                        return conversionMultiplier(basicValue, 0.6214);
                }
            case "Inch":
                switch (targetUnit) {
                    case "Millimetre":
                        return conversionMultiplier(basicValue, 25.4);
                    case "Centimetre":
                        return conversionMultiplier(basicValue, 2.54);
                    case "Metre":
                        return conversionMultiplier(basicValue, 0.0254);
                    case "Kilometre":
                        return conversionMultiplier(basicValue, 0.0000254);
                    case "Inch":
                        return conversionMultiplier(basicValue, 1);
                    case "Foot":
                        return conversionMultiplier(basicValue, 0.08333);
                    case "Yard":
                        return conversionMultiplier(basicValue, 0.02777);
                    case "Mile":
                        return conversionMultiplier(basicValue, 0.00001578);
                }
            case "Foot":
                switch (targetUnit) {
                    case "Millimetre":
                        return conversionMultiplier(basicValue, 304.8);
                    case "Centimetre":
                        return conversionMultiplier(basicValue, 30.48);
                    case "Metre":
                        return conversionMultiplier(basicValue, 0.3048);
                    case "Kilometre":
                        return conversionMultiplier(basicValue, 0.0003048);
                    case "Inch":
                        return conversionMultiplier(basicValue, 12);
                    case "Foot":
                        return conversionMultiplier(basicValue, 1);
                    case "Yard":
                        return conversionMultiplier(basicValue, 0.33333);
                    case "Mile":
                        return conversionMultiplier(basicValue, 0.0001893936);
                }
            case "Yard":
                switch (targetUnit) {
                    case "Millimetre":
                        return conversionMultiplier(basicValue, 914.4);
                    case "Centimetre":
                        return conversionMultiplier(basicValue, 91.44);
                    case "Metre":
                        return conversionMultiplier(basicValue, 0.9144);
                    case "Kilometre":
                        return conversionMultiplier(basicValue, 0.0009144);
                    case "Inch":
                        return conversionMultiplier(basicValue, 36);
                    case "Foot":
                        return conversionMultiplier(basicValue, 3);
                    case "Yard":
                        return conversionMultiplier(basicValue, 1);
                    case "Mile":
                        return conversionMultiplier(basicValue, 0.0005681);
                }
            case "Mile":
                switch (targetUnit) {
                    case "Millimetre":
                        return conversionMultiplier(basicValue, 1609347.21);
                    case "Centimetre":
                        return conversionMultiplier(basicValue, 160934.72);
                    case "Metre":
                        return conversionMultiplier(basicValue, 1609.34);
                    case "Kilometre":
                        return conversionMultiplier(basicValue, 1.6093);
                    case "Inch":
                        return conversionMultiplier(basicValue, 63360.12);
                    case "Foot":
                        return conversionMultiplier(basicValue, 5280.010);
                    case "Yard":
                        return conversionMultiplier(basicValue, 1760);
                    case "Mile":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Milligram":
                switch (targetUnit) {
                    case "Gram":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Kilogram":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Tonne":
                        return conversionMultiplier(basicValue, 0.000000001);
                    case "Grain":
                        return conversionMultiplier(basicValue, 0.0154);
                    case "Ounce":
                        return conversionMultiplier(basicValue, 0.000035);
                    case "Pound":
                        return conversionMultiplier(basicValue, 0.0000022);
                    case "Hundredweight":
                        return conversionMultiplier(basicValue, 0.00000002);
                    case "Ton(long)":
                        return conversionMultiplier(basicValue, 0.000000001016);
                    case "Milligram":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Gram":
                switch (targetUnit) {
                    case "Milligram":
                        return conversionMultiplier(basicValue, 1000.0);
                    case "Kilogram":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Tonne":
                        return conversionMultiplier(basicValue, 0.000000001);
                    case "Grain":
                        return conversionMultiplier(basicValue, 15.43);
                    case "Ounce":
                        return conversionMultiplier(basicValue, 0.03527);
                    case "Pound":
                        return conversionMultiplier(basicValue, 0.002204);
                    case "Hundredweight":
                        return conversionMultiplier(basicValue, 0.0000196);
                    case "Ton(long)":
                        return conversionMultiplier(basicValue, 0.0000009);
                    case "Gram":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Kilogram":
                switch (targetUnit) {
                    case "Milligram":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Gram":
                        return conversionMultiplier(basicValue, 1000.0);
                    case "Tonne":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Grain":
                        return conversionMultiplier(basicValue, 15432.35);
                    case "Ounce":
                        return conversionMultiplier(basicValue, 35.27);
                    case "Pound":
                        return conversionMultiplier(basicValue, 2.20);
                    case "Hundredweight":
                        return conversionMultiplier(basicValue, 0.01968);
                    case "Ton(long)":
                        return conversionMultiplier(basicValue, 0.000984);
                    case "Kilogram":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Tonne":
                switch (targetUnit) {
                    case "Milligram":
                        return conversionMultiplier(basicValue, 1000000000.0);
                    case "Gram":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Kilogram":
                        return conversionMultiplier(basicValue, 1000.0);
                    case "Grain":
                        return conversionMultiplier(basicValue, 15432358.35);
                    case "Ounce":
                        return conversionMultiplier(basicValue, 35273.96);
                    case "Pound":
                        return conversionMultiplier(basicValue, 2204.62);
                    case "Hundredweight":
                        return conversionMultiplier(basicValue, 19.68);
                    case "Ton(long)":
                        return conversionMultiplier(basicValue, 0.9842);
                    case "Tonne":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Grain":
                switch (targetUnit) {
                    case "Milligram":
                        return conversionMultiplier(basicValue, 64.79);
                    case "Gram":
                        return conversionMultiplier(basicValue, 0.0647);
                    case "Kilogram":
                        return conversionMultiplier(basicValue, 0.000064);
                    case "Tonne":
                        return conversionMultiplier(basicValue, 0.000000065);
                    case "Ounce":
                        return conversionMultiplier(basicValue, 0.00228);
                    case "Pound":
                        return conversionMultiplier(basicValue, 0.000142857);
                    case "Hundredweight":
                        return conversionMultiplier(basicValue, 0.000001429);
                    case "Ton(long)":
                        return conversionMultiplier(basicValue, 0.000000064);
                    case "Grain":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Ounce":
                switch (targetUnit) {
                    case "Milligram":
                        return conversionMultiplier(basicValue, 28349.52);
                    case "Gram":
                        return conversionMultiplier(basicValue, 28.349);
                    case "Kilogram":
                        return conversionMultiplier(basicValue, 0.02834);
                    case "Tonne":
                        return conversionMultiplier(basicValue, 0.00002835);
                    case "Grain":
                        return conversionMultiplier(basicValue, 437.49);
                    case "Pound":
                        return conversionMultiplier(basicValue, 0.0625);
                    case "Hundredweight":
                        return conversionMultiplier(basicValue, 0.000558036);
                    case "Ton(long)":
                        return conversionMultiplier(basicValue, 0.0000279022);
                    case "Ounce":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Pound":
                switch (targetUnit) {
                    case "Milligram":
                        return conversionMultiplier(basicValue, 453592.37);
                    case "Gram":
                        return conversionMultiplier(basicValue, 453.59);
                    case "Kilogram":
                        return conversionMultiplier(basicValue, 0.4535);
                    case "Tonne":
                        return conversionMultiplier(basicValue, 0.0004535);
                    case "Grain":
                        return conversionMultiplier(basicValue, 6999.99);
                    case "Ounce":
                        return conversionMultiplier(basicValue, 16);
                    case "Hundredweight":
                        return conversionMultiplier(basicValue, 0.008928571);
                    case "Ton(long)":
                        return conversionMultiplier(basicValue, 0.000446429);
                    case "Pound":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Hundredweight":
                switch (targetUnit) {
                    case "Milligram":
                        return conversionMultiplier(basicValue, 50802345.44);
                    case "Gram":
                        return conversionMultiplier(basicValue, 50802.34);
                    case "Kilogram":
                        return conversionMultiplier(basicValue, 50.80);
                    case "Tonne":
                        return conversionMultiplier(basicValue, 0.05080);
                    case "Grain":
                        return conversionMultiplier(basicValue, 783999.999);
                    case "Ounce":
                        return conversionMultiplier(basicValue, 1792);
                    case "Pound":
                        return conversionMultiplier(basicValue, 112);
                    case "Ton(long)":
                        return conversionMultiplier(basicValue, 0.05);
                    case "Hundredweight":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Ton(long)":
                switch (targetUnit) {
                    case "Milligram":
                        return conversionMultiplier(basicValue, 1016046908.8);
                    case "Gram":
                        return conversionMultiplier(basicValue, 1016046.90);
                    case "Kilogram":
                        return conversionMultiplier(basicValue, 1016.04);
                    case "Tonne":
                        return conversionMultiplier(basicValue, 1.016);
                    case "Grain":
                        return conversionMultiplier(basicValue, 15679999.99);
                    case "Ounce":
                        return conversionMultiplier(basicValue, 35840.0);
                    case "Pound":
                        return conversionMultiplier(basicValue, 2240.0);
                    case "Hundredweight":
                        return conversionMultiplier(basicValue, 20.0);
                    case "Ton(long)":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Meter/second":
                switch (targetUnit) {
                    case "Meter/second":
                        return conversionMultiplier(basicValue, 1);
                    case "Meter/hour":
                        return conversionMultiplier(basicValue, 3600);
                    case "Kilometer/second":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Kilometer/hour":
                        return conversionMultiplier(basicValue, 3.6);
                    case "Mach(SI)":
                        return conversionMultiplier(basicValue, 0.0033);
                    case "Foot/second":
                        return conversionMultiplier(basicValue, 3.28);
                    case "Foot/hour":
                        return conversionMultiplier(basicValue, 11811.02);
                    case "Mile/hour":
                        return conversionMultiplier(basicValue, 2.23);
                    case "Knot":
                        return conversionMultiplier(basicValue, 1.943);
                }
            case "Meter/hour":
                switch (targetUnit) {
                    case "Meter/second":
                        return conversionMultiplier(basicValue, 0.00027);
                    case "Meter/hour":
                        return conversionMultiplier(basicValue, 1);
                    case "Kilometer/second":
                        return conversionMultiplier(basicValue, 0.0000002777777777);
                    case "Kilometer/hour":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Foot/second":
                        return conversionMultiplier(basicValue, 0.0009);
                    case "Foot/hour":
                        return conversionMultiplier(basicValue, 3.28);
                    case "Mile/hour":
                        return conversionMultiplier(basicValue, 0.00062);
                    case "Knot":
                        return conversionMultiplier(basicValue, 0.00053);
                }
            case "Kilometer/second":
                switch (targetUnit) {
                    case "Meter/second":
                        return conversionMultiplier(basicValue, 0.277);
                    case "Meter/hour":
                        return conversionMultiplier(basicValue, 1000);
                    case "Kilometer/second":
                        return conversionMultiplier(basicValue, 0.00027);
                    case "Kilometer/hour":
                        return conversionMultiplier(basicValue, 1);
                    case "Foot/second":
                        return conversionMultiplier(basicValue, 0.911);
                    case "Foot/hour":
                        return conversionMultiplier(basicValue, 3280.8);
                    case "Mile/hour":
                        return conversionMultiplier(basicValue, 0.621);
                    case "Knot":
                        return conversionMultiplier(basicValue, 0.539);
                }
            case "Kilometer/hour":
                switch (targetUnit) {
                    case "Meter/second":
                        return conversionMultiplier(basicValue, 0.2777);
                    case "Meter/hour":
                        return conversionMultiplier(basicValue, 1000);
                    case "Kilometer/second":
                        return conversionMultiplier(basicValue, 0.00027);
                    case "Kilometer/hour":
                        return conversionMultiplier(basicValue, 1);
                    case "Foot/second":
                        return conversionMultiplier(basicValue, 0.911);
                    case "Foot/hour":
                        return conversionMultiplier(basicValue, 3280.8);
                    case "Mile/hour":
                        return conversionMultiplier(basicValue, 0.621);
                    case "Knot":
                        return conversionMultiplier(basicValue, 0.539);
                }
            case "Foot/second":
                switch (targetUnit) {
                    case "Meter/second":
                        return conversionMultiplier(basicValue, 0.3048);
                    case "Meter/hour":
                        return conversionMultiplier(basicValue, 1097.28);
                    case "Kilometer/second":
                        return conversionMultiplier(basicValue, 0.0003048);
                    case "Kilometer/hour":
                        return conversionMultiplier(basicValue, 1.09728);
                    case "Foot/second":
                        return conversionMultiplier(basicValue, 1);
                    case "Foot/hour":
                        return conversionMultiplier(basicValue, 3600);
                    case "Mile/hour":
                        return conversionMultiplier(basicValue, 0.681);
                    case "Knot":
                        return conversionMultiplier(basicValue, 0.5924);
                }
            case "Foot/hour":
                switch (targetUnit) {
                    case "Meter/second":
                        return conversionMultiplier(basicValue, 0.000084);
                    case "Meter/hour":
                        return conversionMultiplier(basicValue, 0.3);
                    case "Kilometer/second":
                        return conversionMultiplier(basicValue, 0.00000008466666666);
                    case "Kilometer/hour":
                        return conversionMultiplier(basicValue, 0.00030);
                    case "Foot/second":
                        return conversionMultiplier(basicValue, 0.00027);
                    case "Foot/hour":
                        return conversionMultiplier(basicValue, 1);
                    case "Mile/hour":
                        return conversionMultiplier(basicValue, 0.00018);
                    case "Knot":
                        return conversionMultiplier(basicValue, 0.00016);
                }
            case "Mile/hour":
                switch (targetUnit) {
                    case "Meter/second":
                        return conversionMultiplier(basicValue, 0.44);
                    case "Meter/hour":
                        return conversionMultiplier(basicValue, 1609.3);
                    case "Kilometer/second":
                        return conversionMultiplier(basicValue, 0.00044);
                    case "Kilometer/hour":
                        return conversionMultiplier(basicValue, 1.6);
                    case "Foot/second":
                        return conversionMultiplier(basicValue, 1.46);
                    case "Foot/hour":
                        return conversionMultiplier(basicValue, 5280);
                    case "Mile/hour":
                        return conversionMultiplier(basicValue, 1);
                    case "Knot":
                        return conversionMultiplier(basicValue, 0.8689);
                }
            case "Knot":
                switch (targetUnit) {
                    case "Meter/second":
                        return conversionMultiplier(basicValue, 0.514);
                    case "Meter/hour":
                        return conversionMultiplier(basicValue, 1852);
                    case "Kilometer/second":
                        return conversionMultiplier(basicValue, 0.00051);
                    case "Kilometer/hour":
                        return conversionMultiplier(basicValue, 1.852);
                    case "Foot/second":
                        return conversionMultiplier(basicValue, 1.687);
                    case "Foot/hour":
                        return conversionMultiplier(basicValue, 6076.11);
                    case "Mile/hour":
                        return conversionMultiplier(basicValue, 1.150);
                    case "Knot":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Celsius":
                switch (targetUnit) {
                    case "Celsius":
                        return temperatureConversion(basicValue*1);
                    case "Fahrenheit":
                        return temperatureConversion(basicValue * NineDivFive + 32);
                    case "Kelvin":
                        return temperatureConversion(basicValue + 273.15);
                    case "Rankine":
                        return temperatureConversion(basicValue * NineDivFive + 491.67);
                }
            case "Kelvin":
                switch (targetUnit) {
                    case "Celsius":
                        return temperatureConversion(basicValue - 273.15);//here
                    case "Fahrenheit":
                        return temperatureConversion(((basicValue - 273.15) * NineDivFive + 32)); //here
                    case "Kelvin":
                        return temperatureConversion(basicValue*1);
                    case "Rankine":
                        return temperatureConversion(basicValue*1.8);
                }
            case "Rankine":
                switch (targetUnit) {
                    case "Celsius":
                        return temperatureConversion(FiveDivNine * (basicValue - 491.67));//here
                    case "Fahrenheit":
                        return temperatureConversion(basicValue - 459.67);//here
                    case "Kelvin":
                        return temperatureConversion(basicValue*FiveDivNine);
                    case "Rankine":
                        return temperatureConversion(basicValue*1);
                }
            case "Fahrenheit":
                switch (targetUnit) {
                    case "Celsius":
                        return temperatureConversion(FiveDivNine * (basicValue - 32));
                    case "Fahrenheit":
                        return temperatureConversion(basicValue*1);
                    case "Kelvin":
                        return temperatureConversion((basicValue - 32) * FiveDivNine + 273.15);
                    case "Rankine":
                        return temperatureConversion(basicValue + 459.67);
                }
            case "Seconds":
                switch (targetUnit) {
                    case "Seconds":
                        return conversionMultiplier(basicValue, 1);
                    case "Minutes":
                        return conversionMultiplier(basicValue, 0.0166666667);
                    case "Hour":
                        return conversionMultiplier(basicValue, 0.0002777778);
                    case "Day":
                        return conversionMultiplier(basicValue, 0.0000115741);
                    case "Week":
                        return conversionMultiplier(basicValue, 0.0000016534);
                    case "Month":
                        return conversionMultiplier(basicValue, 0.0000003805175038);
                    case "Year":
                        return conversionMultiplier(basicValue, 0.00000003170979198);
                }
            case "Minutes":
                switch (targetUnit) {
                    case "Seconds":
                        return conversionMultiplier(basicValue, 60);
                    case "Minutes":
                        return conversionMultiplier(basicValue, 1);
                    case "Hour":
                        return conversionMultiplier(basicValue, 0.0166666667);
                    case "Day":
                        return conversionMultiplier(basicValue, 0.0006944444);
                    case "Week":
                        return conversionMultiplier(basicValue, 0.0000992063);
                    case "Month":
                        return conversionMultiplier(basicValue, 0.0000228311);
                    case "Year":
                        return conversionMultiplier(basicValue, 0.0000019026);
                }
            case "Hour":
                switch (targetUnit) {
                    case "Seconds":
                        return conversionMultiplier(basicValue, 3600);
                    case "Minutes":
                        return conversionMultiplier(basicValue, 60);
                    case "Hour":
                        return conversionMultiplier(basicValue, 1);
                    case "Day":
                        return conversionMultiplier(basicValue, 0.0416666667);
                    case "Week":
                        return conversionMultiplier(basicValue, 0.005952381);
                    case "Month":
                        return conversionMultiplier(basicValue, 0.001369863);
                    case "Year":
                        return conversionMultiplier(basicValue, 0.0001141553);
                }
            case "Day":
                switch (targetUnit) {
                    case "Seconds":
                        return conversionMultiplier(basicValue, 604800);
                    case "Minutes":
                        return conversionMultiplier(basicValue, 10080);
                    case "Hour":
                        return conversionMultiplier(basicValue, 168);
                    case "Day":
                        return conversionMultiplier(basicValue, 7);
                    case "Week":
                        return conversionMultiplier(basicValue, 1);
                    case "Month":
                        return conversionMultiplier(basicValue, 0.23);
                    case "Year":
                        return conversionMultiplier(basicValue, 0.19);
                }
            case "Week":
                switch (targetUnit) {
                    case "Seconds":
                        return conversionMultiplier(basicValue, 604800);
                    case "Minutes":
                        return conversionMultiplier(basicValue, 10080);
                    case "Hour":
                        return conversionMultiplier(basicValue, 168);
                    case "Day":
                        return conversionMultiplier(basicValue, 7);
                    case "Week":
                        return conversionMultiplier(basicValue, 1);
                    case "Month":
                        return conversionMultiplier(basicValue, 0.2301369863);
                    case "Year":
                        return conversionMultiplier(basicValue, 0.0191780822);
                }

            case "Month":
                switch (targetUnit) {
                    case "Seconds":
                        return conversionMultiplier(basicValue, 2628000);
                    case "Minutes":
                        return conversionMultiplier(basicValue, 43800);
                    case "Hour":
                        return conversionMultiplier(basicValue, 730);
                    case "Day":
                        return conversionMultiplier(basicValue, 30.416666667);
                    case "Week":
                        return conversionMultiplier(basicValue, 4.3452380952);
                    case "Month":
                        return conversionMultiplier(basicValue, 1);
                    case "Year":
                        return conversionMultiplier(basicValue, 0.0833333333);
                }

            case "Year":
                switch (targetUnit) {
                    case "Seconds":
                        return conversionMultiplier(basicValue, 31536000);
                    case "Minutes":
                        return conversionMultiplier(basicValue, 525600);
                    case "Hour":
                        return conversionMultiplier(basicValue, 8760);
                    case "Day":
                        return conversionMultiplier(basicValue, 365);
                    case "Week":
                        return conversionMultiplier(basicValue, 52.142857143);
                    case "Month":
                        return conversionMultiplier(basicValue, 12);
                    case "Year":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Cubic millimetre/mm³":
                switch (targetUnit) {
                    case "Cubic millimetre":
                        return conversionMultiplier(basicValue, 1);
                    case "Cubic centimetre":
                    case "Milliliter":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Cubic metre":
                        return conversionMultiplier(basicValue, 0.000000001);
                    case "Liter":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Fluid ounce":
                        return conversionMultiplier(basicValue, 0.0000351951);
                    case "Gill":
                        return conversionMultiplier(basicValue, 0.000007039);
                    case "Pint":
                        return conversionMultiplier(basicValue, 0.0000017598);
                    case "Quart":
                        return conversionMultiplier(basicValue, 0.0000008798769931);
                    case "Gallon":
                        return conversionMultiplier(basicValue, 0.0000002199692482);
                    case "Barrel(UK)":
                        return conversionMultiplier(basicValue, 0.000000006110256897);
                }

            case "Cubic centimetre":
                switch (targetUnit) {
                    case "Cubic millimetre":
                        return conversionMultiplier(basicValue, 1000);
                    case "Cubic centimetre":
                    case "Milliliter":
                        return conversionMultiplier(basicValue, 1);
                    case "Cubic metre":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Liter":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Fluid ounce":
                        return conversionMultiplier(basicValue, 0.0351950797);
                    case "Gill":
                        return conversionMultiplier(basicValue, 0.0070390159);
                    case "Pint":
                        return conversionMultiplier(basicValue, 0.001759754);
                    case "Quart":
                        return conversionMultiplier(basicValue, 0.000879877);
                    case "Gallon":
                        return conversionMultiplier(basicValue, 0.0002199692);
                    case "Barrel(UK)":
                        return conversionMultiplier(basicValue, 0.0000002199692482);
                }

            case "Cubic metre":
                switch (targetUnit) {
                    case "Cubic millimetre":
                        return conversionMultiplier(basicValue, 1000000.0000);
                    case "Cubic centimetre":
                    case "Milliliter":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Cubic metre":
                        return conversionMultiplier(basicValue, 1);//ok
                    case "Liter":
                        return conversionMultiplier(basicValue, 1000);
                    case "Fluid ounce":
                        return conversionMultiplier(basicValue, 35195.079728);
                    case "Gill":
                        return conversionMultiplier(basicValue, 7039.0159456);
                    case "Pint":
                        return conversionMultiplier(basicValue, 1759.7539864);
                    case "Quart":
                        return conversionMultiplier(basicValue, 879.8769932);
                    case "Gallon":
                        return conversionMultiplier(basicValue, 219.9692483);
                    case "Barrel(UK)":
                        return conversionMultiplier(basicValue, 6.1102568972);
                }

            case "Milliliter":
                switch (targetUnit) {
                    case "Cubic millimetre":
                        return conversionMultiplier(basicValue, 1000);
                    case "Cubic centimetre":
                    case "Milliliter":
                        return conversionMultiplier(basicValue, 1);
                    case "Cubic metre":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Liter":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Fluid ounce":
                        return conversionMultiplier(basicValue, 0.0351950797);
                    case "Gill":
                        return conversionMultiplier(basicValue, 0.0070390159);
                    case "Pint":
                        return conversionMultiplier(basicValue, 0.001759754);
                    case "Quart":
                        return conversionMultiplier(basicValue, 0.000879877);
                    case "Gallon":
                        return conversionMultiplier(basicValue, 0.0002199692);
                    case "Barrel(UK)":
                        return conversionMultiplier(basicValue, 0.0000061103);
                }

            case "Liter":
                switch (targetUnit) {
                    case "Cubic millimetre":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Cubic centimetre":
                    case "Milliliter":
                        return conversionMultiplier(basicValue, 1000);
                    case "Cubic metre":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Liter":
                        return conversionMultiplier(basicValue, 1);
                    case "Fluid ounce":
                        return conversionMultiplier(basicValue, 35.195079728);
                    case "Gill":
                        return conversionMultiplier(basicValue, 7.0390159456);
                    case "Pint":
                        return conversionMultiplier(basicValue, 1.7597539864);
                    case "Quart":
                        return conversionMultiplier(basicValue, 0.8798769932);
                    case "Gallon":
                        return conversionMultiplier(basicValue, 0.2199692483);
                    case "Barrel(UK)":
                        return conversionMultiplier(basicValue, 0.0061102569);
                }

            case "Gill":
                switch (targetUnit) {
                    case "Cubic millimetre":
                        return conversionMultiplier(basicValue, 142065.3125);
                    case "Cubic centimetre":
                    case "Milliliter":
                        return conversionMultiplier(basicValue, 142.0653125);
                    case "Cubic metre":
                        return conversionMultiplier(basicValue, 0.0001420653);
                    case "Liter":
                        return conversionMultiplier(basicValue, 0.1420653125);
                    case "Fluid ounce":
                        return conversionMultiplier(basicValue, 5);
                    case "Gill":
                        return conversionMultiplier(basicValue, 1);
                    case "Pint":
                        return conversionMultiplier(basicValue, 0.25);
                    case "Quart":
                        return conversionMultiplier(basicValue, 0.125);
                    case "Gallon":
                        return conversionMultiplier(basicValue, 0.03125);
                    case "Barrel(UK)":
                        return conversionMultiplier(basicValue, 0.0008680556);
                }

            case "Fluid ounce":
                switch (targetUnit) {
                    case "Cubic millimetre":
                        return conversionMultiplier(basicValue, 28413.0625);
                    case "Cubic centimetre":
                    case "Milliliter":
                        return conversionMultiplier(basicValue, 28.4130625);
                    case "Cubic metre":
                        return conversionMultiplier(basicValue, 0.0000284131);
                    case "Liter":
                        return conversionMultiplier(basicValue, 0.0284130625);
                    case "Fluid ounce":
                        return conversionMultiplier(basicValue, 1);
                    case "Gill":
                        return conversionMultiplier(basicValue, 0.2);
                    case "Pint":
                        return conversionMultiplier(basicValue, 0.05);
                    case "Quart":
                        return conversionMultiplier(basicValue, 0.025);
                    case "Gallon":
                        return conversionMultiplier(basicValue, 0.00625);
                    case "Barrel(UK)":
                        return conversionMultiplier(basicValue, 0.0001736111);
                }

            case "Pint":
                switch (targetUnit) {
                    case "Cubic millimetre":
                        return conversionMultiplier(basicValue, 568261.25);
                    case "Cubic centimetre":
                    case "Milliliter":
                        return conversionMultiplier(basicValue, 568.26125);
                    case "Cubic metre":
                        return conversionMultiplier(basicValue, 0.0005682613);//ok
                    case "Liter":
                        return conversionMultiplier(basicValue, 0.56826125);
                    case "Fluid ounce":
                        return conversionMultiplier(basicValue, 20);
                    case "Gill":
                        return conversionMultiplier(basicValue, 4);
                    case "Pint":
                        return conversionMultiplier(basicValue, 1);
                    case "Quart":
                        return conversionMultiplier(basicValue, 0.5);
                    case "Gallon":
                        return conversionMultiplier(basicValue, 0.125);
                    case "Barrel(UK)":
                        return conversionMultiplier(basicValue, 0.0034722222);
                }

            case "Quart":
                switch (targetUnit) {
                    case "Cubic millimetre":
                        return conversionMultiplier(basicValue, 1136522.5);
                    case "Cubic centimetre":
                    case "Milliliter":
                        return conversionMultiplier(basicValue, 1136.5225);
                    case "Cubic metre":
                        return conversionMultiplier(basicValue, 0.0011365225);//ok
                    case "Liter":
                        return conversionMultiplier(basicValue, 1.1365225);
                    case "Fluid ounce":
                        return conversionMultiplier(basicValue, 40);
                    case "Gill":
                        return conversionMultiplier(basicValue, 8);
                    case "Pint":
                        return conversionMultiplier(basicValue, 2);
                    case "Quart":
                        return conversionMultiplier(basicValue, 1);
                    case "Gallon":
                        return conversionMultiplier(basicValue, 0.25);
                    case "Barrel(UK)":
                        return conversionMultiplier(basicValue, 0.0069444444);
                }

            case "Gallon":
                switch (targetUnit) {
                    case "Cubic millimetre":
                        return conversionMultiplier(basicValue, 4546090);
                    case "Cubic centimetre":
                    case "Milliliter":
                        return conversionMultiplier(basicValue, 4546.09);
                    case "Cubic metre":
                        return conversionMultiplier(basicValue, 0.00454609);//ok
                    case "Liter":
                        return conversionMultiplier(basicValue, 3.785);
                    case "Fluid ounce":
                        return conversionMultiplier(basicValue, 160);
                    case "Gill":
                        return conversionMultiplier(basicValue, 32);
                    case "Pint":
                        return conversionMultiplier(basicValue, 8);
                    case "Quart":
                        return conversionMultiplier(basicValue, 4);
                    case "Gallon":
                        return conversionMultiplier(basicValue, 1);
                    case "Barrel(UK)":
                        return conversionMultiplier(basicValue, 0.0277777778);
                }

            case "Barrel(UK)":
                switch (targetUnit) {
                    case "Cubic millimetre":
                        return conversionMultiplier(basicValue, 163659240);
                    case "Cubic centimetre":
                    case "Milliliter":
                        return conversionMultiplier(basicValue, 163659.24);
                    case "Cubic metre":
                        return conversionMultiplier(basicValue, 0.16365924);//ok
                    case "Liter":
                        return conversionMultiplier(basicValue, 163.65924);
                    case "Fluid ounce":
                        return conversionMultiplier(basicValue, 5760);
                    case "Gill":
                        return conversionMultiplier(basicValue, 1152);
                    case "Pint":
                        return conversionMultiplier(basicValue, 288);
                    case "Quart":
                        return conversionMultiplier(basicValue, 144);
                    case "Gallon":
                        return conversionMultiplier(basicValue, 36);
                    case "Barrel(UK)":
                        return conversionMultiplier(basicValue, 1);
                }
            default:
                return "NaN";
        }
    }

    public static String ConvertValues_Ukr(String basicUnit, String targetUnit, Double basicValue) {
        switch (basicUnit) {
            //area
            case "Міліметр квадратний":
                switch (targetUnit) {
                    case "Міліметр квадратний":
                        return conversionMultiplier(basicValue, 1);
                    case "Сантіметр квадратний":
                        return conversionMultiplier(basicValue, 0.01);
                    case "Метр квадратний":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Кілометр квадратний":
                        return conversionMultiplier(basicValue, 0.000000000001);
                    case "Гектар":
                        return conversionMultiplier(basicValue, 0.0000000001);
                    case "Міля квадратна":
                        return conversionMultiplier(basicValue, 0.0000000000003861021585);
                    case "Акр":
                        return conversionMultiplier(basicValue, 0.0000000002471053814);
                    case "Ярд квадратний":
                        return conversionMultiplier(basicValue, 0.000001196);
                    case "Фут квадратний":
                        return conversionMultiplier(basicValue, 0.0000107639);
                    case "Дюйм квадратний":
                        return conversionMultiplier(basicValue, 0.0015500031);
                }

            case "Сантіметр квадратний":
                switch (targetUnit) {
                    case "Міліметр квадратний":
                        return conversionMultiplier(basicValue, 100);
                    case "Сантіметр квадратний":
                        return conversionMultiplier(basicValue, 1);
                    case "Метр квадратний":
                        return conversionMultiplier(basicValue, 0.0001);
                    case "Кілометр квадратний":
                        return conversionMultiplier(basicValue, 0.0000000001);
                    case "Гектар":
                        return conversionMultiplier(basicValue, 0.00000001);
                    case "Міля квадратна":
                        return conversionMultiplier(basicValue, 0.00000000003861021585);
                    case "Акр":
                        return conversionMultiplier(basicValue, 0.00000002471053814);
                    case "Ярд квадратний":
                        return conversionMultiplier(basicValue, 0.000119599);
                    case "Фут квадратний":
                        return conversionMultiplier(basicValue, 0.001076391);
                    case "Дюйм квадратний":
                        return conversionMultiplier(basicValue, 0.15500031);
                }

            case "Метр квадратний":
                switch (targetUnit) {
                    case "Міліметр квадратний":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Сантіметр квадратний":
                        return conversionMultiplier(basicValue, 10000.0);
                    case "Метр квадратний":
                        return conversionMultiplier(basicValue, 1);
                    case "Кілометр квадратний":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Гектар":
                        return conversionMultiplier(basicValue, 0.0001);
                    case "Міля квадратна":
                        return conversionMultiplier(basicValue, 0.0000003861021585);
                    case "Акр":
                        return conversionMultiplier(basicValue, 0.0002471054);
                    case "Ярд квадратний":
                        return conversionMultiplier(basicValue, 1.1959900463);
                    case "Фут квадратний":
                        return conversionMultiplier(basicValue, 10.763910417);
                    case "Дюйм квадратний":
                        return conversionMultiplier(basicValue, 1550.0031);
                }

            case "Кілометр квадратний":
                switch (targetUnit) {
                    case "Міліметр квадратний":
                        return conversionMultiplier(basicValue, 1000000000000.0);
                    case "Сантіметр квадратний":
                        return conversionMultiplier(basicValue, 10000000000.0);
                    case "Метр квадратний":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Кілометр квадратний":
                        return conversionMultiplier(basicValue, 1);
                    case "Гектар":
                        return conversionMultiplier(basicValue, 100.0);
                    case "Міля квадратна":
                        return conversionMultiplier(basicValue, 0.3861021585);
                    case "Акр":
                        return conversionMultiplier(basicValue, 247.10538147);
                    case "Ярд квадратний":
                        return conversionMultiplier(basicValue, 1195990.0463);
                    case "Фут квадратний":
                        return conversionMultiplier(basicValue, 10763910.417);
                    case "Дюйм квадратний":
                        return conversionMultiplier(basicValue, 1550003100);
                }

            case "Гектар":
                switch (targetUnit) {
                    case "Міліметр квадратний":
                        return conversionMultiplier(basicValue, 10000000000.0);
                    case "Сантіметр квадратний":
                        return conversionMultiplier(basicValue, 100000000);
                    case "Метр квадратний":
                        return conversionMultiplier(basicValue, 10000);
                    case "Кілометр квадратний":
                        return conversionMultiplier(basicValue, 0.01);
                    case "Гектар":
                        return conversionMultiplier(basicValue, 1);
                    case "Міля квадратна":
                        return conversionMultiplier(basicValue, 0.0038610216);
                    case "Акр":
                        return conversionMultiplier(basicValue, 2.4710538147);
                    case "Ярд квадратний":
                        return conversionMultiplier(basicValue, 11959.900463);
                    case "Фут квадратний":
                        return conversionMultiplier(basicValue, 107639.10417);
                    case "Дюйм квадратний":
                        return conversionMultiplier(basicValue, 15500031);
                }

            case "Міля квадратна":
                switch (targetUnit) {
                    case "Міліметр квадратний":
                        return conversionMultiplier(basicValue, 2589988110336.0);
                    case "Сантіметр квадратний":
                        return conversionMultiplier(basicValue, 25899881103.0);
                    case "Метр квадратний":
                        return conversionMultiplier(basicValue, 2589988.1103);
                    case "Кілометр квадратний":
                        return conversionMultiplier(basicValue, 2.5899881103);
                    case "Гектар":
                        return conversionMultiplier(basicValue, 258.99881103);
                    case "Міля квадратна":
                        return conversionMultiplier(basicValue, 1);
                    case "Акр":
                        return conversionMultiplier(basicValue, 640);
                    case "Ярд квадратний":
                        return conversionMultiplier(basicValue, 3097600);
                    case "Фут квадратний":
                        return conversionMultiplier(basicValue, 27878400);
                    case "Дюйм квадратний":
                        return conversionMultiplier(basicValue, 4014489600.0);
                }

            case "Акр":
                switch (targetUnit) {
                    case "Міліметр квадратний":
                        return conversionMultiplier(basicValue, 4046856422.4);
                    case "Сантіметр квадратний":
                        return conversionMultiplier(basicValue, 40468564.224);
                    case "Метр квадратний":
                        return conversionMultiplier(basicValue, 4046.8564224);
                    case "Кілометр квадратний":
                        return conversionMultiplier(basicValue, 0.0040468564);
                    case "Гектар":
                        return conversionMultiplier(basicValue, 0.4046856422);
                    case "Міля квадратна":
                        return conversionMultiplier(basicValue, 0.0015625);
                    case "Акр":
                        return conversionMultiplier(basicValue, 1);
                    case "Ярд квадратний":
                        return conversionMultiplier(basicValue, 4840);
                    case "Фут квадратний":
                        return conversionMultiplier(basicValue, 43560);
                    case "Дюйм квадратний":
                        return conversionMultiplier(basicValue, 6272640);
                }

            case "Ярд квадратний":
                switch (targetUnit) {
                    case "Міліметр квадратний":
                        return conversionMultiplier(basicValue, 836127.36);
                    case "Сантіметр квадратний":
                        return conversionMultiplier(basicValue, 8361.2736);
                    case "Метр квадратний":
                        return conversionMultiplier(basicValue, 0.83612736);
                    case "Кілометр квадратний":
                        return conversionMultiplier(basicValue, 0.0000008361273599);
                    case "Гектар":
                        return conversionMultiplier(basicValue, 0.0000836127);
                    case "Міля квадратна":
                        return conversionMultiplier(basicValue, 0.0000003228305785);
                    case "Акр":
                        return conversionMultiplier(basicValue, 0.0002066116);
                    case "Ярд квадратний":
                        return conversionMultiplier(basicValue, 1);
                    case "Фут квадратний":
                        return conversionMultiplier(basicValue, 9);
                    case "Дюйм квадратний":
                        return conversionMultiplier(basicValue, 1296);
                }

            case "Фут квадратний":
                switch (targetUnit) {
                    case "Міліметр квадратний":
                        return conversionMultiplier(basicValue, 92903.04);
                    case "Сантіметр квадратний":
                        return conversionMultiplier(basicValue, 929.0304);
                    case "Метр квадратний":
                        return conversionMultiplier(basicValue, 0.09290304);
                    case "Кілометр квадратний":
                        return conversionMultiplier(basicValue, 0.00000009290303999);
                    case "Гектар":
                        return conversionMultiplier(basicValue, 0.0000092903);
                    case "Міля квадратна":
                        return conversionMultiplier(basicValue, 0.000000387006427);
                    case "Акр":
                        return conversionMultiplier(basicValue, 0.0000229568);
                    case "Ярд квадратний":
                        return conversionMultiplier(basicValue, 0.1111111111);
                    case "Фут квадратний":
                        return conversionMultiplier(basicValue, 1);
                    case "Дюйм квадратний":
                        return conversionMultiplier(basicValue, 144);
                }
            case "Дюйм квадратний":
                switch (targetUnit) {
                    case "Міліметр квадратний":
                        return conversionMultiplier(basicValue, 645.16);
                    case "Сантіметр квадратний":
                        return conversionMultiplier(basicValue, 6.4516);
                    case "Метр квадратний":
                        return conversionMultiplier(basicValue, 0.00064516);
                    case "Кілометр квадратний":
                        return conversionMultiplier(basicValue, 0.00000000064516);
                    case "Гектар":
                        return conversionMultiplier(basicValue, 0.000000064516);
                    case "Міля квадратна":
                        return conversionMultiplier(basicValue, 0.000000000290976686);
                    case "Акр":
                        return conversionMultiplier(basicValue, 0.0000001594225079);
                    case "Ярд квадратний":
                        return conversionMultiplier(basicValue, 0.0007716049);
                    case "Фут квадратний":
                        return conversionMultiplier(basicValue, 0.0069444444);
                    case "Дюйм квадратний":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Міліньютон ":
                switch (targetUnit) {
                    case "Міліньютон ":
                        return conversionMultiplier(basicValue, 1);
                    case "Ньютон":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Кілоньютон":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Тонна-сила(метрична)":
                        return conversionMultiplier(basicValue, 0.000000101);
                    case "Грам-сила":
                    case "Понд":
                        return conversionMultiplier(basicValue, 0.1019);
                    case "Кілограм-сила":
                        return conversionMultiplier(basicValue, 0.000101);
                    case "Фунт-сила":
                        return conversionMultiplier(basicValue, 0.00022);
                    case "Унція-сила":
                        return conversionMultiplier(basicValue, 0.00359);
                    case "Тонна-сила(довга)":
                        return conversionMultiplier(basicValue, 0.000000100);
                    case "Паундаль":
                        return conversionMultiplier(basicValue, 0.00723);
                }

            case "Ньютон":
                switch (targetUnit) {
                    case "Міліньютон ":
                        return conversionMultiplier(basicValue, 1000);
                    case "Ньютон":
                        return conversionMultiplier(basicValue, 1);
                    case "Кілоньютон":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Тонна-сила(метрична)":
                    case "Тонна-сила(довга)":
                        return conversionMultiplier(basicValue, 0.0001);
                    case "Грам-сила":
                    case "Понд":
                        return conversionMultiplier(basicValue, 101.971);
                    case "Кілограм-сила":
                        return conversionMultiplier(basicValue, 0.10197);
                    case "Фунт-сила":
                        return conversionMultiplier(basicValue, 0.22480);
                    case "Унція-сила":
                        return conversionMultiplier(basicValue, 3.5969);
                    case "Паундаль":
                        return conversionMultiplier(basicValue, 7.233);
                }

            case "Кілоньютон":
                switch (targetUnit) {
                    case "Міліньютон ":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Ньютон":
                        return conversionMultiplier(basicValue, 1000);
                    case "Кілоньютон":
                        return conversionMultiplier(basicValue, 1);
                    case "Тонна-сила(метрична)":
                        return conversionMultiplier(basicValue, 0.101971);
                    case "Грам-сила":
                    case "Понд":
                        return conversionMultiplier(basicValue, 101971.6);
                    case "Кілограм-сила":
                        return conversionMultiplier(basicValue, 101.971);
                    case "Фунт-сила":
                        return conversionMultiplier(basicValue, 224.81);
                    case "Унція-сила":
                        return conversionMultiplier(basicValue, 3596.94);
                    case "Тонна-сила(довга)":
                        return conversionMultiplier(basicValue, 0.1003);
                    case "Паундаль":
                        return conversionMultiplier(basicValue, 7233.01);
                }

            case "Тонна-сила(метрична)":
                switch (targetUnit) {
                    case "Міліньютон ":
                        return conversionMultiplier(basicValue, 9806650);
                    case "Ньютон":
                        return conversionMultiplier(basicValue, 9806.65);
                    case "Кілоньютон":
                        return conversionMultiplier(basicValue, 9.80665);
                    case "Тонна-сила(метрична)":
                        return conversionMultiplier(basicValue, 1);
                    case "Грам-сила":
                    case "Понд":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Кілограм-сила":
                        return conversionMultiplier(basicValue, 1000);
                    case "Фунт-сила":
                        return conversionMultiplier(basicValue, 2204.62);
                    case "Унція-сила":
                        return conversionMultiplier(basicValue, 35273.96);
                    case "Тонна-сила(довга)":
                        return conversionMultiplier(basicValue, 0.9842);
                    case "Паундаль":
                        return conversionMultiplier(basicValue, 70931.63);
                }

            case "Грам-сила":
                switch (targetUnit) {
                    case "Міліньютон ":
                        return conversionMultiplier(basicValue, 9.8066);
                    case "Ньютон":
                        return conversionMultiplier(basicValue, 0.009806);
                    case "Кілоньютон":
                        return conversionMultiplier(basicValue, 0.0000098067);
                    case "Тонна-сила(метрична)":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Грам-сила":
                        return conversionMultiplier(basicValue, 1);
                    case "Кілограм-сила":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Понд":
                        return conversionMultiplier(basicValue, 1.0);
                    case "Фунт-сила":
                        return conversionMultiplier(basicValue, 0.002204);
                    case "Унція-сила":
                        return conversionMultiplier(basicValue, 0.03527);
                    case "Тонна-сила(довга)":
                        return conversionMultiplier(basicValue, 0.0000009842);
                    case "Паундаль":
                        return conversionMultiplier(basicValue, 0.07093);
                }

            case "Кілограм-сила":
                switch (targetUnit) {
                    case "Міліньютон ":
                        return conversionMultiplier(basicValue, 9806.65);
                    case "Ньютон":
                        return conversionMultiplier(basicValue, 9.80665);
                    case "Кілоньютон":
                        return conversionMultiplier(basicValue, 0.0098066);
                    case "Тонна-сила(метрична)":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Грам-сила":
                    case "Понд":
                        return conversionMultiplier(basicValue, 1000);
                    case "Кілограм-сила":
                        return conversionMultiplier(basicValue, 1);
                    case "Фунт-сила":
                        return conversionMultiplier(basicValue, 2.20);
                    case "Унція-сила":
                        return conversionMultiplier(basicValue, 35.273);
                    case "Тонна-сила(довга)":
                        return conversionMultiplier(basicValue, 0.0009842);
                    case "Паундаль":
                        return conversionMultiplier(basicValue, 70.931);
                }

            case "Понд":
                switch (targetUnit) {
                    case "Міліньютон ":
                        return conversionMultiplier(basicValue, 9.80665);
                    case "Ньютон":
                        return conversionMultiplier(basicValue, 0.00980);
                    case "Кілоньютон":
                        return conversionMultiplier(basicValue, 0.0000098);
                    case "Тонна-сила(метрична)":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Грам-сила":
                    case "Понд":
                        return conversionMultiplier(basicValue, 1);
                    case "Кілограм-сила":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Фунт-сила":
                        return conversionMultiplier(basicValue, 0.002204);
                    case "Унція-сила":
                        return conversionMultiplier(basicValue, 0.03527);
                    case "Тонна-сила(довга)":
                        return conversionMultiplier(basicValue, 0.0000009842);
                    case "Паундаль":
                        return conversionMultiplier(basicValue, 0.07093);
                }

            case "Фунт-сила":
                switch (targetUnit) {
                    case "Міліньютон ":
                        return conversionMultiplier(basicValue, 4448.221);
                    case "Ньютон":
                        return conversionMultiplier(basicValue, 4.448);
                    case "Кілоньютон":
                        return conversionMultiplier(basicValue, 0.00444);
                    case "Тонна-сила(метрична)":
                        return conversionMultiplier(basicValue, 0.00045);
                    case "Грам-сила":
                    case "Понд":
                        return conversionMultiplier(basicValue, 453.59);
                    case "Кілограм-сила":
                        return conversionMultiplier(basicValue, 0.45359);
                    case "Фунт-сила":
                        return conversionMultiplier(basicValue, 1);
                    case "Унція-сила":
                        return conversionMultiplier(basicValue, 16);
                    case "Тонна-сила(довга)":
                        return conversionMultiplier(basicValue, 0.0004464);
                    case "Паундаль":
                        return conversionMultiplier(basicValue, 32.174);
                }

            case "Унція-сила":
                switch (targetUnit) {
                    case "Міліньютон ":
                        return conversionMultiplier(basicValue, 278.013);
                    case "Ньютон":
                        return conversionMultiplier(basicValue, 0.27801);
                    case "Кілоньютон":
                        return conversionMultiplier(basicValue, 0.0002780);
                    case "Тонна-сила(метрична)":
                        return conversionMultiplier(basicValue, 0.0000283);
                    case "Грам-сила":
                    case "Понд":
                        return conversionMultiplier(basicValue, 28.349);
                    case "Кілограм-сила":
                        return conversionMultiplier(basicValue, 0.02834);
                    case "Фунт-сила":
                        return conversionMultiplier(basicValue, 0.0625);
                    case "Унція-сила":
                        return conversionMultiplier(basicValue, 1);
                    case "Тонна-сила(довга)":
                        return conversionMultiplier(basicValue, 0.0000279);
                    case "Паундаль":
                        return conversionMultiplier(basicValue, 2.010);
                }

            case "Тонна-сила(довга)":
                switch (targetUnit) {
                    case "Міліньютон ":
                        return conversionMultiplier(basicValue, 9964016.41);
                    case "Ньютон":
                        return conversionMultiplier(basicValue, 9964.01);
                    case "Кілоньютон":
                        return conversionMultiplier(basicValue, 9.9640);
                    case "Тонна-сила(метрична)":
                        return conversionMultiplier(basicValue, 1.016);
                    case "Грам-сила":
                    case "Понд":
                        return conversionMultiplier(basicValue, 1016046.90);
                    case "Кілограм-сила":
                        return conversionMultiplier(basicValue, 1016.046);
                    case "Фунт-сила":
                        return conversionMultiplier(basicValue, 2240.0);
                    case "Унція-сила":
                        return conversionMultiplier(basicValue, 35840.0);
                    case "Тонна-сила(довга)":
                        return conversionMultiplier(basicValue, 1);
                    case "Паундаль":
                        return conversionMultiplier(basicValue, 72069.86);
                }

            case "Паундаль":
                switch (targetUnit) {
                    case "Міліньютон ":
                        return conversionMultiplier(basicValue, 138.25);
                    case "Ньютон":
                        return conversionMultiplier(basicValue, 0.13825);
                    case "Кілоньютон":
                        return conversionMultiplier(basicValue, 0.000138);
                    case "Тонна-сила(метрична)":
                        return conversionMultiplier(basicValue, 0.0000140);
                    case "Грам-сила":
                    case "Понд":
                        return conversionMultiplier(basicValue, 14.09);
                    case "Кілограм-сила":
                        return conversionMultiplier(basicValue, 0.01409);
                    case "Фунт-сила":
                        return conversionMultiplier(basicValue, 0.03108);
                    case "Унція-сила":
                        return conversionMultiplier(basicValue, 0.4972);
                    case "Тонна-сила(довга)":
                        return conversionMultiplier(basicValue, 0.0000138);
                    case "Паундаль":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Міліметр":
                switch (targetUnit) {
                    case "Міліметр":
                        return conversionMultiplier(basicValue, 1);
                    case "Сантіметр":
                        return conversionMultiplier(basicValue, 0.1);
                    case "Метр":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Кілометр":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Дюйм":
                        return conversionMultiplier(basicValue, 0.03937);
                    case "Фут":
                        return conversionMultiplier(basicValue, 0.003280);
                    case "Ярд":
                        return conversionMultiplier(basicValue, 0.001093);
                    case "Міля":
                        return conversionMultiplier(basicValue, 0.0000062137);
                }

            case "Сантіметр":
                switch (targetUnit) {
                    case "Міліметр":
                        return conversionMultiplier(basicValue, 10);
                    case "Сантіметр":
                        return conversionMultiplier(basicValue, 1);
                    case "Метр":
                        return conversionMultiplier(basicValue, 0.01);
                    case "Кілометр":
                        return conversionMultiplier(basicValue, 0.00001);
                    case "Дюйм":
                        return conversionMultiplier(basicValue, 0.3937);
                    case "Фут":
                        return conversionMultiplier(basicValue, 0.03280);
                    case "Ярд":
                        return conversionMultiplier(basicValue, 0.01093);
                    case "Міля":
                        return conversionMultiplier(basicValue, 0.000006213);
                }

            case "Метр":
                switch (targetUnit) {
                    case "Міліметр":
                        return conversionMultiplier(basicValue, 1000);
                    case "Сантіметр":
                        return conversionMultiplier(basicValue, 100);
                    case "Метр":
                        return conversionMultiplier(basicValue, 1);
                    case "Кілометр":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Дюйм":
                        return conversionMultiplier(basicValue, 39.37007);
                    case "Фут":
                        return conversionMultiplier(basicValue, 3.2808);
                    case "Ярд":
                        return conversionMultiplier(basicValue, 1.09361);
                    case "Міля":
                        return conversionMultiplier(basicValue, 0.00062137);
                }

            case "Кілометр":
                switch (targetUnit) {
                    case "Міліметр":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Сантіметр":
                        return conversionMultiplier(basicValue, 100000.0);
                    case "Метр":
                        return conversionMultiplier(basicValue, 1000);
                    case "Кілометр":
                        return conversionMultiplier(basicValue, 1);
                    case "Дюйм":
                        return conversionMultiplier(basicValue, 39370.08);
                    case "Фут":
                        return conversionMultiplier(basicValue, 3280.84);
                    case "Ярд":
                        return conversionMultiplier(basicValue, 1093.6132);
                    case "Міля":
                        return conversionMultiplier(basicValue, 0.6214);
                }

            case "Дюйм":
                switch (targetUnit) {
                    case "Міліметр":
                        return conversionMultiplier(basicValue, 25.4);
                    case "Сантіметр":
                        return conversionMultiplier(basicValue, 2.54);
                    case "Метр":
                        return conversionMultiplier(basicValue, 0.0254);
                    case "Кілометр":
                        return conversionMultiplier(basicValue, 0.0000254);
                    case "Дюйм":
                        return conversionMultiplier(basicValue, 1);
                    case "Фут":
                        return conversionMultiplier(basicValue, 0.08333);
                    case "Ярд":
                        return conversionMultiplier(basicValue, 0.02777);
                    case "Міля":
                        return conversionMultiplier(basicValue, 0.00001578);
                }

            case "Фут":
                switch (targetUnit) {
                    case "Міліметр":
                        return conversionMultiplier(basicValue, 304.8);
                    case "Сантіметр":
                        return conversionMultiplier(basicValue, 30.48);
                    case "Метр":
                        return conversionMultiplier(basicValue, 0.3048);
                    case "Кілометр":
                        return conversionMultiplier(basicValue, 0.0003048);
                    case "Дюйм":
                        return conversionMultiplier(basicValue, 12);
                    case "Фут":
                        return conversionMultiplier(basicValue, 1);
                    case "Ярд":
                        return conversionMultiplier(basicValue, 0.33333);
                    case "Міля":
                        return conversionMultiplier(basicValue, 0.0001893936);
                }

            case "Ярд":
                switch (targetUnit) {
                    case "Міліметр":
                        return conversionMultiplier(basicValue, 914.4);
                    case "Сантіметр":
                        return conversionMultiplier(basicValue, 91.44);
                    case "Метр":
                        return conversionMultiplier(basicValue, 0.9144);
                    case "Кілометр":
                        return conversionMultiplier(basicValue, 0.0009144);
                    case "Дюйм":
                        return conversionMultiplier(basicValue, 36);
                    case "Фут":
                        return conversionMultiplier(basicValue, 3);
                    case "Ярд":
                        return conversionMultiplier(basicValue, 1);
                    case "Міля":
                        return conversionMultiplier(basicValue, 0.0005681);
                }

            case "Міля":
                switch (targetUnit) {
                    case "Міліметр":
                        return conversionMultiplier(basicValue, 1609347.21);
                    case "Сантіметр":
                        return conversionMultiplier(basicValue, 160934.72);
                    case "Метр":
                        return conversionMultiplier(basicValue, 1609.34);
                    case "Кілометр":
                        return conversionMultiplier(basicValue, 1.6093);
                    case "Дюйм":
                        return conversionMultiplier(basicValue, 63360.12);
                    case "Фут":
                        return conversionMultiplier(basicValue, 5280.010);
                    case "Ярд":
                        return conversionMultiplier(basicValue, 1760);
                    case "Міля":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Міліграм":
                switch (targetUnit) {
                    case "Грам":
                        return conversionMultiplier(basicValue, 0.001);

                    case "Кілограм":
                        return conversionMultiplier(basicValue, 0.000001);

                    case "Тонна":
                        return conversionMultiplier(basicValue, 0.000000001);

                    case "Гран":
                        return conversionMultiplier(basicValue, 0.0154);

                    case "Унція":
                        return conversionMultiplier(basicValue, 0.000035);

                    case "Фунт":
                        return conversionMultiplier(basicValue, 0.0000022);

                    case "Хандредвейт":
                        return conversionMultiplier(basicValue, 0.00000002);

                    case "Тонна(довга)":
                        return conversionMultiplier(basicValue, 0.000000001016);

                    case "Міліграм":
                        return conversionMultiplier(basicValue, 1);
                }

            case "Грам":
                switch (targetUnit) {
                    case "Міліграм":
                        return conversionMultiplier(basicValue, 1000.0);

                    case "Кілограм":
                        return conversionMultiplier(basicValue, 0.001);

                    case "Тонна":
                        return conversionMultiplier(basicValue, 0.000000001);

                    case "Гран":
                        return conversionMultiplier(basicValue, 15.43);

                    case "Унція":
                        return conversionMultiplier(basicValue, 0.03527);

                    case "Фунт":
                        return conversionMultiplier(basicValue, 0.002204);

                    case "Хандредвейт":
                        return conversionMultiplier(basicValue, 0.0000196);

                    case "Тонна(довга)":
                        return conversionMultiplier(basicValue, 0.0000009);

                    case "Грам":
                        return conversionMultiplier(basicValue, 1);
                }

            case "Кілограм":
                switch (targetUnit) {
                    case "Міліграм":
                        return conversionMultiplier(basicValue, 1000000.0);

                    case "Грам":
                        return conversionMultiplier(basicValue, 1000.0);

                    case "Тонна":
                        return conversionMultiplier(basicValue, 0.001);

                    case "Гран":
                        return conversionMultiplier(basicValue, 15432.35);

                    case "Унція":
                        return conversionMultiplier(basicValue, 35.27);

                    case "Фунт":
                        return conversionMultiplier(basicValue, 2.20);

                    case "Хандредвейт":
                        return conversionMultiplier(basicValue, 0.01968);

                    case "Тонна(довга)":
                        return conversionMultiplier(basicValue, 0.000984);

                    case "Кілограм":
                        return conversionMultiplier(basicValue, 1);
                }

            case "Тонна":
                switch (targetUnit) {
                    case "Міліграм":
                        return conversionMultiplier(basicValue, 1000000000.0);

                    case "Грам":
                        return conversionMultiplier(basicValue, 1000000.0);

                    case "Кілограм":
                        return conversionMultiplier(basicValue, 1000.0);

                    case "Гран":
                        return conversionMultiplier(basicValue, 15432358.35);

                    case "Унція":
                        return conversionMultiplier(basicValue, 35273.96);

                    case "Фунт":
                        return conversionMultiplier(basicValue, 2204.62);

                    case "Хандредвейт":
                        return conversionMultiplier(basicValue, 19.68);

                    case "Тонна(довга)":
                        return conversionMultiplier(basicValue, 0.9842);

                    case "Тонна":
                        return conversionMultiplier(basicValue, 1);
                }

            case "Гран":
                switch (targetUnit) {
                    case "Міліграм":
                        return conversionMultiplier(basicValue, 64.79);

                    case "Грам":
                        return conversionMultiplier(basicValue, 0.0647);

                    case "Кілограм":
                        return conversionMultiplier(basicValue, 0.000064);

                    case "Тонна":
                        return conversionMultiplier(basicValue, 0.000000065);

                    case "Унція":
                        return conversionMultiplier(basicValue, 0.00228);

                    case "Фунт":
                        return conversionMultiplier(basicValue, 0.000142857);

                    case "Хандредвейт":
                        return conversionMultiplier(basicValue, 0.000001429);

                    case "Тонна(довга)":
                        return conversionMultiplier(basicValue, 0.000000064);

                    case "Гран":
                        return conversionMultiplier(basicValue, 1);
                }

            case "Унція":
                switch (targetUnit) {
                    case "Міліграм":
                        return conversionMultiplier(basicValue, 28349.52);

                    case "Грам":
                        return conversionMultiplier(basicValue, 28.349);

                    case "Кілограм":
                        return conversionMultiplier(basicValue, 0.02834);

                    case "Тонна":
                        return conversionMultiplier(basicValue, 0.00002835);

                    case "Гран":
                        return conversionMultiplier(basicValue, 437.49);

                    case "Фунт":
                        return conversionMultiplier(basicValue, 0.0625);

                    case "Хандредвейт":
                        return conversionMultiplier(basicValue, 0.000558036);

                    case "Тонна(довга)":
                        return conversionMultiplier(basicValue, 0.0000279022);

                    case "Унція":
                        return conversionMultiplier(basicValue, 1);
                }

            case "Фунт":
                switch (targetUnit) {
                    case "Міліграм":
                        return conversionMultiplier(basicValue, 453592.37);

                    case "Грам":
                        return conversionMultiplier(basicValue, 453.59);

                    case "Кілограм":
                        return conversionMultiplier(basicValue, 0.4535);

                    case "Тонна":
                        return conversionMultiplier(basicValue, 0.0004535);

                    case "Гран":
                        return conversionMultiplier(basicValue, 6999.99);

                    case "Унція":
                        return conversionMultiplier(basicValue, 16);

                    case "Хандредвейт":
                        return conversionMultiplier(basicValue, 0.008928571);

                    case "Тонна(довга)":
                        return conversionMultiplier(basicValue, 0.000446429);

                    case "Фунт":
                        return conversionMultiplier(basicValue, 1);
                }

            case "Хандредвейт":
                switch (targetUnit) {
                    case "Міліграм":
                        return conversionMultiplier(basicValue, 50802345.44);

                    case "Грам":
                        return conversionMultiplier(basicValue, 50802.34);

                    case "Кілограм":
                        return conversionMultiplier(basicValue, 50.80);

                    case "Тонна":
                        return conversionMultiplier(basicValue, 0.05080);

                    case "Гран":
                        return conversionMultiplier(basicValue, 783999.999);

                    case "Унція":
                        return conversionMultiplier(basicValue, 1792);

                    case "Фунт":
                        return conversionMultiplier(basicValue, 112);

                    case "Тонна(довга)":
                        return conversionMultiplier(basicValue, 0.05);

                    case "Хандредвейт":
                        return conversionMultiplier(basicValue, 1);
                }

            case "Тонна(довга)":
                switch (targetUnit) {
                    case "Міліграм":
                        return conversionMultiplier(basicValue, 1016046908.8);

                    case "Грам":
                        return conversionMultiplier(basicValue, 1016046.90);

                    case "Кілограм":
                        return conversionMultiplier(basicValue, 1016.04);

                    case "Тонна":
                        return conversionMultiplier(basicValue, 1.016);

                    case "Гран":
                        return conversionMultiplier(basicValue, 15679999.99);

                    case "Унція":
                        return conversionMultiplier(basicValue, 35840.0);

                    case "Фунт":
                        return conversionMultiplier(basicValue, 2240.0);

                    case "Хандредвейт":
                        return conversionMultiplier(basicValue, 20.0);

                    case "Тонна(довга)":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Метрів/секунда":
                switch (targetUnit) {
                    case "Метрів/секунда":
                        return conversionMultiplier(basicValue, 1);
                    case "Метрів/година":
                        return conversionMultiplier(basicValue, 3600);
                    case "Кілометр/секунда":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Кілометр/година":
                        return conversionMultiplier(basicValue, 3.6);
                    case "Фут/секунда":
                        return conversionMultiplier(basicValue, 3.28);
                    case "Фут/година":
                        return conversionMultiplier(basicValue, 11811.02);
                    case "Міль/година":
                        return conversionMultiplier(basicValue, 2.23);
                    case "Вузол":
                        return conversionMultiplier(basicValue, 1.943);
                }

            case "Метрів/година":
                switch (targetUnit) {
                    case "Метрів/секунда":
                        return conversionMultiplier(basicValue, 0.00027);
                    case "Метрів/година":
                        return conversionMultiplier(basicValue, 1);
                    case "Кілометр/секунда":
                        return conversionMultiplier(basicValue, 0.0000002777777777);
                    case "Кілометр/година":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Фут/секунда":
                        return conversionMultiplier(basicValue, 0.0009);
                    case "Фут/година":
                        return conversionMultiplier(basicValue, 3.28);
                    case "Міль/година":
                        return conversionMultiplier(basicValue, 0.00062);
                    case "Вузол":
                        return conversionMultiplier(basicValue, 0.00053);
                }

            case "Кілометр/секунда":
                switch (targetUnit) {
                    case "Метрів/секунда":
                        return conversionMultiplier(basicValue, 1000);
                    case "Метрів/година":
                        return conversionMultiplier(basicValue, 3600000);
                    case "Кілометр/секунда":
                        return conversionMultiplier(basicValue, 1);
                    case "Кілометр/година":
                        return conversionMultiplier(basicValue, 3600);
                    case "Фут/секунда":
                        return conversionMultiplier(basicValue, 3280.83);
                    case "Фут/година":
                        return conversionMultiplier(basicValue, 11811023.6);
                    case "Міль/година":
                        return conversionMultiplier(basicValue, 2236.9);
                    case "Вузол":
                        return conversionMultiplier(basicValue, 1943.8);
                }

            case "Кілометр/година":
                switch (targetUnit) {
                    case "Метрів/секунда":
                        return conversionMultiplier(basicValue, 0.2777);
                    case "Метрів/година":
                        return conversionMultiplier(basicValue, 1000);
                    case "Кілометр/секунда":
                        return conversionMultiplier(basicValue, 0.00027);
                    case "Кілометр/година":
                        return conversionMultiplier(basicValue, 1);
                    case "Фут/секунда":
                        return conversionMultiplier(basicValue, 0.911);
                    case "Фут/година":
                        return conversionMultiplier(basicValue, 3280.8);
                    case "Міль/година":
                        return conversionMultiplier(basicValue, 0.621);
                    case "Вузол":
                        return conversionMultiplier(basicValue, 0.539);
                }

            case "Фут/секунда":
                switch (targetUnit) {
                    case "Метрів/секунда":
                        return conversionMultiplier(basicValue, 0.3048);
                    case "Метрів/година":
                        return conversionMultiplier(basicValue, 1097.28);
                    case "Кілометр/секунда":
                        return conversionMultiplier(basicValue, 0.0003048);
                    case "Кілометр/година":
                        return conversionMultiplier(basicValue, 1.09728);
                    case "Фут/секунда":
                        return conversionMultiplier(basicValue, 1);
                    case "Фут/година":
                        return conversionMultiplier(basicValue, 3600);
                    case "Міль/година":
                        return conversionMultiplier(basicValue, 0.681);
                    case "Вузол":
                        return conversionMultiplier(basicValue, 0.5924);
                }

            case "Фут/година":
                switch (targetUnit) {
                    case "Метрів/секунда":
                        return conversionMultiplier(basicValue, 0.000084);
                    case "Метрів/година":
                        return conversionMultiplier(basicValue, 0.3);
                    case "Кілометр/секунда":
                        return conversionMultiplier(basicValue, 0.00000008466666666);
                    case "Кілометр/година":
                        return conversionMultiplier(basicValue, 0.00030);
                    case "Фут/секунда":
                        return conversionMultiplier(basicValue, 0.00027);
                    case "Фут/година":
                        return conversionMultiplier(basicValue, 1);
                    case "Міль/година":
                        return conversionMultiplier(basicValue, 0.00018);
                    case "Вузол":
                        return conversionMultiplier(basicValue, 0.00016);
                }

            case "Міль/година":
                switch (targetUnit) {
                    case "Метрів/секунда":
                        return conversionMultiplier(basicValue, 0.44);
                    case "Метрів/година":
                        return conversionMultiplier(basicValue, 1609.3);
                    case "Кілометр/секунда":
                        return conversionMultiplier(basicValue, 0.00044);
                    case "Кілометр/година":
                        return conversionMultiplier(basicValue, 1.6);
                    case "Фут/секунда":
                        return conversionMultiplier(basicValue, 1.46);
                    case "Фут/година":
                        return conversionMultiplier(basicValue, 5280);
                    case "Міль/година":
                        return conversionMultiplier(basicValue, 1);
                    case "Вузол":
                        return conversionMultiplier(basicValue, 0.8689);
                }

            case "Вузол":
                switch (targetUnit) {
                    case "Метрів/секунда":
                        return conversionMultiplier(basicValue, 0.514);
                    case "Метрів/година":
                        return conversionMultiplier(basicValue, 1852);
                    case "Кілометр/секунда":
                        return conversionMultiplier(basicValue, 0.00051);
                    case "Кілометр/година":
                        return conversionMultiplier(basicValue, 1.852);
                    case "Фут/секунда":
                        return conversionMultiplier(basicValue, 1.687);
                    case "Фут/година":
                        return conversionMultiplier(basicValue, 6076.11);
                    case "Міль/година":
                        return conversionMultiplier(basicValue, 1.150);
                    case "Вузол":
                        return conversionMultiplier(basicValue, 1);
                }

            case "Цельсій":
                switch (targetUnit) {
                    case "Цельсій":
                        return temperatureConversion(basicValue*1);
                    case "Фаренгейт":
                        return temperatureConversion(basicValue * NineDivFive + 32);
                    case "Кельвін":
                        temperatureConversion(basicValue + 273.15);
                    case "Ранкін":
                        return temperatureConversion(basicValue * NineDivFive + 491.67);
                }

            case "Кельвін":
                switch (targetUnit) {
                    case "Цельсій":
                        return temperatureConversion(basicValue - 273.15);//here
                    case "Фаренгейт":
                        return temperatureConversion(((basicValue - 273.15) * NineDivFive + 32)); //here
                    case "Кельвін":
                        return temperatureConversion(basicValue*1);
                    case "Ранкін":
                        return temperatureConversion(basicValue*1.8);
                }

            case "Ранкін":
                switch (targetUnit) {
                    case "Цельсій":
                        return temperatureConversion(FiveDivNine * (basicValue - 491.67));//here
                    case "Фаренгейт":
                        return temperatureConversion(basicValue - 459.67);//here
                    case "Кельвін":
                        return temperatureConversion(basicValue*FiveDivNine);
                    case "Ранкін":
                        return temperatureConversion(basicValue*1);
                }

            case "Фаренгейт":
                switch (targetUnit) {
                    case "Цельсій":
                        return temperatureConversion(FiveDivNine * (basicValue - 32));
                    case "Фаренгейт":
                        return temperatureConversion(basicValue*1);
                    case "Кельвін":
                        temperatureConversion((basicValue - 32) * FiveDivNine + 273.15);
                    case "Ранкін":
                        temperatureConversion(basicValue + 459.67);
                }
            case "Секунди":
                switch (targetUnit) {
                    case "Секунди":
                        return conversionMultiplier(basicValue, 1);
                    case "Хвилини":
                        return conversionMultiplier(basicValue, 0.0166666667);
                    case "Година":
                        return conversionMultiplier(basicValue, 0.0002777778);
                    case "День":
                        return conversionMultiplier(basicValue, 0.0000115741);
                    case "Тиждень":
                        return conversionMultiplier(basicValue, 0.0000016534);
                    case "Місяць":
                        return conversionMultiplier(basicValue, 0.0000003805175038);
                    case "Рік":
                        return conversionMultiplier(basicValue, 0.00000003170979198);
                }

            case "Хвилини":
                switch (targetUnit) {
                    case "Секунди":
                        return conversionMultiplier(basicValue, 60);
                    case "Хвилини":
                        return conversionMultiplier(basicValue, 1);
                    case "Година":
                        return conversionMultiplier(basicValue, 0.0166666667);
                    case "День":
                        return conversionMultiplier(basicValue, 0.0006944444);
                    case "Тиждень":
                        return conversionMultiplier(basicValue, 0.0000992063);
                    case "Місяць":
                        return conversionMultiplier(basicValue, 0.0000228311);
                    case "Рік":
                        return conversionMultiplier(basicValue, 0.0000019026);
                }

            case "Година":
                switch (targetUnit) {
                    case "Секунди":
                        return conversionMultiplier(basicValue, 3600);
                    case "Хвилини":
                        return conversionMultiplier(basicValue, 60);
                    case "Година":
                        return conversionMultiplier(basicValue, 1);
                    case "День":
                        return conversionMultiplier(basicValue, 0.0416666667);
                    case "Тиждень":
                        return conversionMultiplier(basicValue, 0.005952381);
                    case "Місяць":
                        return conversionMultiplier(basicValue, 0.001369863);
                    case "Рік":
                        return conversionMultiplier(basicValue, 0.0001141553);
                }

            case "День":
                switch (targetUnit) {
                    case "Секунди":
                        return conversionMultiplier(basicValue, 604800);
                    case "Хвилини":
                        return conversionMultiplier(basicValue, 10080);
                    case "Година":
                        return conversionMultiplier(basicValue, 168);
                    case "День":
                        return conversionMultiplier(basicValue, 7);
                    case "Тиждень":
                        return conversionMultiplier(basicValue, 1);
                    case "Місяць":
                        return conversionMultiplier(basicValue, 0.23);
                    case "Рік":
                        return conversionMultiplier(basicValue, 0.19);
                }

            case "Тиждень":
                switch (targetUnit) {
                    case "Секунди":
                        return conversionMultiplier(basicValue, 604800);
                    case "Хвилини":
                        return conversionMultiplier(basicValue, 10080);
                    case "Година":
                        return conversionMultiplier(basicValue, 168);
                    case "День":
                        return conversionMultiplier(basicValue, 7);
                    case "Тиждень":
                        return conversionMultiplier(basicValue, 1);
                    case "Місяць":
                        return conversionMultiplier(basicValue, 0.2301369863);
                    case "Рік":
                        return conversionMultiplier(basicValue, 0.0191780822);
                }

            case "Місяць":
                switch (targetUnit) {
                    case "Секунди":
                        return conversionMultiplier(basicValue, 2628000);
                    case "Хвилини":
                        return conversionMultiplier(basicValue, 43800);
                    case "Година":
                        return conversionMultiplier(basicValue, 730);
                    case "День":
                        return conversionMultiplier(basicValue, 30.416666667);
                    case "Тиждень":
                        return conversionMultiplier(basicValue, 4.3452380952);
                    case "Місяць":
                        return conversionMultiplier(basicValue, 1);
                    case "Рік":
                        return conversionMultiplier(basicValue, 0.0833333333);
                }

            case "Рік":
                switch (targetUnit) {
                    case "Секунди":
                        return conversionMultiplier(basicValue, 31536000);
                    case "Хвилини":
                        return conversionMultiplier(basicValue, 525600);
                    case "Година":
                        return conversionMultiplier(basicValue, 8760);
                    case "День":
                        return conversionMultiplier(basicValue, 365);
                    case "Тиждень":
                        return conversionMultiplier(basicValue, 52.142857143);
                    case "Місяць":
                        return conversionMultiplier(basicValue, 12);
                    case "Рік":
                        return conversionMultiplier(basicValue, 1);
                }
            case "Міліметр кубічний":
                switch (targetUnit) {
                    case "Міліметр кубічний":
                        return conversionMultiplier(basicValue, 1);
                    case "Сантіметр кубічний":
                    case "Мілілітр":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Метр кубічний":
                        return conversionMultiplier(basicValue, 0.000000001);
                    case "Літр":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Унція рідка":
                        return conversionMultiplier(basicValue, 0.0000351951);
                    case "Джил":
                        return conversionMultiplier(basicValue, 0.000007039);
                    case "Пінта":
                        return conversionMultiplier(basicValue, 0.0000017598);
                    case "Кварт":
                        return conversionMultiplier(basicValue, 0.0000008798769931);
                    case "Галлон":
                        return conversionMultiplier(basicValue, 0.0000002199692482);
                    case "Баррель(UK)":
                        return conversionMultiplier(basicValue, 0.000000006110256897);
                }

            case "Сантіметр кубічний":
                switch (targetUnit) {
                    case "Міліметр кубічний":
                        return conversionMultiplier(basicValue, 1000);
                    case "Сантіметр кубічний":
                    case "Мілілітр":
                        return conversionMultiplier(basicValue, 1);
                    case "Метр кубічний":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Літр":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Унція рідка":
                        return conversionMultiplier(basicValue, 0.0351950797);
                    case "Джил":
                        return conversionMultiplier(basicValue, 0.0070390159);
                    case "Пінта":
                        return conversionMultiplier(basicValue, 0.001759754);
                    case "Кварт":
                        return conversionMultiplier(basicValue, 0.000879877);
                    case "Галлон":
                        return conversionMultiplier(basicValue, 0.0002199692);
                    case "Баррель(UK)":
                        return conversionMultiplier(basicValue, 0.0000002199692482);
                }

            case "Метр кубічний":
                switch (targetUnit) {
                    case "Міліметр кубічний":
                        return conversionMultiplier(basicValue, 1000000.0000);
                    case "Сантіметр кубічний":
                    case "Мілілітр":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Метр кубічний":
                        return conversionMultiplier(basicValue, 1);
                    case "Літр":
                        return conversionMultiplier(basicValue, 1000);
                    case "Унція рідка":
                        return conversionMultiplier(basicValue, 35195.079728);
                    case "Джил":
                        return conversionMultiplier(basicValue, 7039.0159456);
                    case "Пінта":
                        return conversionMultiplier(basicValue, 1759.7539864);
                    case "Кварт":
                        return conversionMultiplier(basicValue, 879.8769932);
                    case "Галлон":
                        return conversionMultiplier(basicValue, 219.9692483);
                    case "Баррель(UK)":
                        return conversionMultiplier(basicValue, 6.1102568972);
                }

            case "Мілілітр":
                switch (targetUnit) {
                    case "Міліметр кубічний":
                        return conversionMultiplier(basicValue, 1000);
                    case "Сантіметр кубічний":
                    case "Мілілітр":
                        return conversionMultiplier(basicValue, 1);
                    case "Метр кубічний":
                        return conversionMultiplier(basicValue, 0.000001);
                    case "Літр":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Унція рідка":
                        return conversionMultiplier(basicValue, 0.0351950797);
                    case "Джил":
                        return conversionMultiplier(basicValue, 0.0070390159);
                    case "Пінта":
                        return conversionMultiplier(basicValue, 0.001759754);
                    case "Кварт":
                        return conversionMultiplier(basicValue, 0.000879877);
                    case "Галлон":
                        return conversionMultiplier(basicValue, 0.0002199692);
                    case "Баррель(UK)":
                        return conversionMultiplier(basicValue, 0.0000061103);
                }

            case "Літр":
                switch (targetUnit) {
                    case "Міліметр кубічний":
                        return conversionMultiplier(basicValue, 1000000.0);
                    case "Сантіметр кубічний":
                    case "Мілілітр":
                        return conversionMultiplier(basicValue, 1000);
                    case "Метр кубічний":
                        return conversionMultiplier(basicValue, 0.001);
                    case "Літр":
                        return conversionMultiplier(basicValue, 1);
                    case "Унція рідка":
                        return conversionMultiplier(basicValue, 35.195079728);
                    case "Джил":
                        return conversionMultiplier(basicValue, 7.0390159456);
                    case "Пінта":
                        return conversionMultiplier(basicValue, 1.7597539864);
                    case "Кварт":
                        return conversionMultiplier(basicValue, 0.8798769932);
                    case "Галлон":
                        return conversionMultiplier(basicValue, 0.2199692483);
                    case "Баррель(UK)":
                        return conversionMultiplier(basicValue, 0.0061102569);
                }

            case "Джил":
                switch (targetUnit) {
                    case "Міліметр кубічний":
                        return conversionMultiplier(basicValue, 142065.3125);
                    case "Сантіметр кубічний":
                    case "Мілілітр":
                        return conversionMultiplier(basicValue, 142.0653125);
                    case "Метр кубічний":
                        return conversionMultiplier(basicValue, 0.0001420653);
                    case "Літр":
                        return conversionMultiplier(basicValue, 0.1420653125);
                    case "Унція рідка":
                        return conversionMultiplier(basicValue, 5);
                    case "Джил":
                        return conversionMultiplier(basicValue, 1);
                    case "Пінта":
                        return conversionMultiplier(basicValue, 0.25);
                    case "Кварт":
                        return conversionMultiplier(basicValue, 0.125);
                    case "Галлон":
                        return conversionMultiplier(basicValue, 0.03125);
                    case "Баррель(UK)":
                        return conversionMultiplier(basicValue, 0.0008680556);
                }

            case "Унція рідка":
                switch (targetUnit) {
                    case "Міліметр кубічний":
                        return conversionMultiplier(basicValue, 28413.0625);
                    case "Сантіметр кубічний":
                    case "Мілілітр":
                        return conversionMultiplier(basicValue, 28.4130625);
                    case "Метр кубічний":
                        return conversionMultiplier(basicValue, 0.0000284131);
                    case "Літр":
                        return conversionMultiplier(basicValue, 0.0284130625);
                    case "Унція рідка":
                        return conversionMultiplier(basicValue, 1);
                    case "Джил":
                        return conversionMultiplier(basicValue, 0.2);
                    case "Пінта":
                        return conversionMultiplier(basicValue, 0.05);
                    case "Кварт":
                        return conversionMultiplier(basicValue, 0.025);
                    case "Галлон":
                        return conversionMultiplier(basicValue, 0.00625);
                    case "Баррель(UK)":
                        return conversionMultiplier(basicValue, 0.0001736111);
                }

            case "Пінта":
                switch (targetUnit) {
                    case "Міліметр кубічний":
                        return conversionMultiplier(basicValue, 568261.25);
                    case "Сантіметр кубічний":
                    case "Мілілітр":
                        return conversionMultiplier(basicValue, 568.26125);
                    case "Метр кубічний":
                        return conversionMultiplier(basicValue, 0.0005682613);
                    case "Літр":
                        return conversionMultiplier(basicValue, 0.56826125);
                    case "Унція рідка":
                        return conversionMultiplier(basicValue, 20);
                    case "Джил":
                        return conversionMultiplier(basicValue, 4);
                    case "Пінта":
                        return conversionMultiplier(basicValue, 1);
                    case "Кварт":
                        return conversionMultiplier(basicValue, 0.5);
                    case "Галлон":
                        return conversionMultiplier(basicValue, 0.125);
                    case "Баррель(UK)":
                        return conversionMultiplier(basicValue, 0.0034722222);
                }

            case "Кварт":
                switch (targetUnit) {
                    case "Міліметр кубічний":
                        return conversionMultiplier(basicValue, 1136522.5);
                    case "Сантіметр кубічний":
                    case "Мілілітр":
                        return conversionMultiplier(basicValue, 1136.5225);
                    case "Метр кубічний":
                        return conversionMultiplier(basicValue, 0.0011365225);
                    case "Літр":
                        return conversionMultiplier(basicValue, 1.1365225);
                    case "Унція рідка":
                        return conversionMultiplier(basicValue, 40);
                    case "Джил":
                        return conversionMultiplier(basicValue, 8);
                    case "Пінта":
                        return conversionMultiplier(basicValue, 2);
                    case "Кварт":
                        return conversionMultiplier(basicValue, 1);
                    case "Галлон":
                        return conversionMultiplier(basicValue, 0.25);
                    case "Баррель(UK)":
                        return conversionMultiplier(basicValue, 0.0069444444);
                }

            case "Галлон":
                switch (targetUnit) {
                    case "Міліметр кубічний":
                        return conversionMultiplier(basicValue, 4546090);
                    case "Сантіметр кубічний":
                    case "Мілілітр":
                        return conversionMultiplier(basicValue, 4546.09);
                    case "Метр кубічний":
                        return conversionMultiplier(basicValue, 0.00454609);
                    case "Літр":
                        return conversionMultiplier(basicValue, 3.785);
                    case "Унція рідка":
                        return conversionMultiplier(basicValue, 160);
                    case "Джил":
                        return conversionMultiplier(basicValue, 32);
                    case "Пінта":
                        return conversionMultiplier(basicValue, 8);
                    case "Кварт":
                        return conversionMultiplier(basicValue, 4);
                    case "Галлон":
                        return conversionMultiplier(basicValue, 1);
                    case "Баррель(UK)":
                        return conversionMultiplier(basicValue, 0.0277777778);
                }

            case "Баррель(UK)":
                switch (targetUnit) {
                    case "Міліметр кубічний":
                        return conversionMultiplier(basicValue, 163659240);
                    case "Сантіметр кубічний":
                    case "Мілілітр":
                        return conversionMultiplier(basicValue, 163659.24);
                    case "Метр кубічний":
                        return conversionMultiplier(basicValue, 0.16365924);
                    case "Літр":
                        return conversionMultiplier(basicValue, 163.65924);
                    case "Унція рідка":
                        return conversionMultiplier(basicValue, 5760);
                    case "Джил":
                        return conversionMultiplier(basicValue, 1152);
                    case "Пінта":
                        return conversionMultiplier(basicValue, 288);
                    case "Кварт":
                        return conversionMultiplier(basicValue, 144);
                    case "Галлон":
                        return conversionMultiplier(basicValue, 36);
                    case "Баррель(UK)":
                        return conversionMultiplier(basicValue, 1);
                }
            default: return "NaN";
        }
    }
}





