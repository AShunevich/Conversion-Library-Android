# Conversion-Library-Android
Android conversion library - returns string value of converted units   

# Impementation
build.gradle (Project) :  
```
allprojects {
	repositories {
	..
	maven { url 'https://jitpack.io' }
	}
}    
```  
build.gradle (module)  :    
```
implementation 'com.github.AShunevich:Conversion-Library-Android:0.1.3'
```
# Example
```
//Recommend to use with Android Spinner or other containers that can hold a large amount of string values
String basicUnit = "Gram";   
String targetUnit= "Milligram"; 
double basicValue = 1.0;

String result = UnitConverter.ConvertValues(basicUnit,targetUnit,basicValue);	//result = "1000.00"
		
```  
For Ukrainian localisation use ```UnitConverter.ConvertValues_Ukr```   
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
