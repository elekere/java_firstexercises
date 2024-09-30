public class UdacityConvert {


public static void main (String args []) {

printTemperature (36);

}

/**
 * This function Converts from Fahrenheit to Celsius degrees
 * @param Fahrenheit Temperature in degrees fahrenheit
 * @return Equivalent Temperature in degrees celsuis
 * 
 * */

public static double fahrenheitToCelsius (double f) {

return (f - 32) * 5/9;

}

/* This function prints Temperature in both Fahrenheit and Celsius Degrees
 * @param the parameter is f: representing temperature in fahrenheit degrees
 * 
 * */
public static void printTemperature (double f) {

System.out.println ("F is: " + f);
System.out.println ("C is: " + fahrenheitToCelsius(f));

}

/*This function prints Temperature in both Celsuis and Fahrenheit Degrees
 * @param The parameter is c: representing temperature in Celsuis Degrees
 * */

// public static void printTemperature 

}