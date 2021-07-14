package com.ashunevich.conversionlibrary;

import org.junit.Assert;
import org.junit.Test;

import static com.ashunevich.conversionlibrary.UnitConverter.ConvertValues;
import static com.ashunevich.conversionlibrary.UnitConverter.temperatureConversion;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ConverterUnitTest {

    private static final double DEFAULT_VALUE = 1.0;
    @Test
    public void convertAndFormatUnit() {
        System.out.println (convertedValue());
        Assert.assertEquals ("0.01",convertedValue());
    }

    @Test
    public void convertAndFormatRandomUnit(){

        String[] area = {"Centimetre", "Millimetre", "Centimetre", "Metre","Kilometre", "Inch", "Foot", "Yard",
                "Mile"};
        int a = 0;
        int b = 9;

        int random_number1 = a + (int) (Math.random() * b);
        int random_number2 = a + (int) (Math.random() * b);
        String result = ConvertValues(area[random_number1],area[random_number2],DEFAULT_VALUE);
        System.out.println (result);
    }

    @Test
    public void converterTemperature(){
        String result = ConvertValues("Celsius","Fahrenheit",DEFAULT_VALUE);
        System.out.println (result);
        Assert.assertEquals("33.8",result);
    }


    @Test
    public void formatterTemperatureTest(){
        String expected = temperatureConversion(33.8);
        System.out.println (expected);
        Assert.assertEquals("33.8",expected);
    }

    String convertedValue(){
        return ConvertValues("Square millimeter","Square centimeter",DEFAULT_VALUE);
    }
}