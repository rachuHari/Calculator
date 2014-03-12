package com.felight.testfiles;
import com.felight.javaprograms.CalculatorNumbers;

public class TestCalculator{
	public static void main(String[] arg){
		//Area of a circle
		System.out.println("Area of a circle is "+CalculatorNumbers.areaCircle(34.22)+"\n");
		
		//Area of a rectangle
		System.out.println("Area of a rectangle is "+CalculatorNumbers.areaRectangle(34,12)+"\n");
		
		//Adding two integer numbers
		System.out.println("Sum of two integer numbers is "+CalculatorNumbers.add(0,10)+"\n");
		
		//Adding two double numbers
		System.out.println("Sum of two double numbers is "+CalculatorNumbers.add(45.67,34.89)+"\n");
		
		//Adding two 3 integer numbers
		System.out.println("Sum of three integer numbers is "+CalculatorNumbers.add3Numbers(45,34,89)+"\n");
		
		//Adding between integer numbers
		System.out.println("Sum between integer numbers is "+CalculatorNumbers.addBetween(1,10)+"\n");

		//Convert Fahrenheit to Celcius
		System.out.println("Fahrenheit in celsius is " +CalculatorNumbers.fahrenheitToCelsius(100)+"Celsius\n");
		
		//Convert Celcius to Fahrenheit 
		System.out.println("Celsius in Fahrenheit is " +CalculatorNumbers.celsiusToFahrenheit(37.77777777777778)+" Fahrenheit\n");
		
		//Is the number even or not
		CalculatorNumbers.even(56);
		
		//Even numbers from x to y numbers
		System.out.println("Even numbers");
		CalculatorNumbers.evenNumbers(0,50);
		
		//Leap year or not
		boolean leap=CalculatorNumbers.isLeap(2057);
		if(leap)
			System.out.println("Given year is a leap year\n");
		else
			System.out.println("Given year is not a leap year\n");
		
		//A given number Palindrome or not
		CalculatorNumbers.palindrome(121);
		
		//Given number is prime or not
		CalculatorNumbers.isPrime(56);
		
		//Series of prime numbers from x to y
		System.out.println("Prime series");
		CalculatorNumbers.primeSeries(0,100); 
		
		//Given number is part of fibonacci or not
		int j=CalculatorNumbers.fibonacci(88);
		if(j==1)
			System.out.println("Given number is a part of fibonaccci series\n");
		else
			System.out.println("Given number is not a part of fibonacci series\n");
		
		//Fibonaci Series from x to y
		CalculatorNumbers.fibonacciSeries(20,100);
		

	}
}
