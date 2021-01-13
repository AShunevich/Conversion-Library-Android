# Conversion-Library-Android
Simple Android conversion library.   
Aveliable localization: Ukrainian / English

# Impementation
Add it in your root build.gradle :  
```
allprojects {
	repositories {
	..
	maven { url 'https://jitpack.io' }
	}
}    
```  
and add this implementation :    
```
implementation 'com.github.AShunevich:Conversion-Library-Android:0.1.0'
```
# How to use
In you code use  : 
```
UnitConverter.ConvertValues (String unitConvertFrom, 
                      String unitConvertTo , Double valueToConvert, TextView resultValue)
```
For Ukrainian localisation use ```UnitConverter.ConvertValues_Ukr...```

Available units for conversion - ![List]("https://github.com/AShunevich/Conversion-Library-Android/blob/master/Units.txt")   
       
# License     
The MIT License (MIT)

Copyright (c) 2020 AShunevich

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
