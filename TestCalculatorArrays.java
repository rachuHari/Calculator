package com.felight.testfiles;

import com.felight.javaprograms.CalculatorArrays;

public class TestCalculatorArrays {

	public static void main(String[] args) {
		
				//Displaying Random integer numbers
				int[] array=CalculatorArrays.printIntArray(new int[5]);
				System.out.println("Array of elements");
				CalculatorArrays.printArray(array);
				
				//Displaying Random characters
				char[] chararray=CalculatorArrays.printCharArray(new char[6]);
				System.out.println("Array of charcter array is");
				CalculatorArrays.printArrayChar(chararray);	
				
				//Sum of elements in an array
				System.out.println("Sum of all elements in array is "+CalculatorArrays.printSumOfArray(new int[]{1,2,3,5,6,7})+"\n");
				
				//Adding elements from x to y using arrays
				System.out.println("Sum of numbers between from and to is "+CalculatorArrays.addBetweenArray(new int[10],8,10)+"\n");
				
				//Number of vowels in an array
				System.out.println("Number of vowels are "+CalculatorArrays.printCountOfVowels(new char[]{'F','e','O','i','g','I','t','o'})+"\n");
				
				//Even numbers from x to y using arrays
				System.out.println("Even numbers");
				CalculatorArrays.evenNumbersArray(new int[10],1,10);
				
				//Reversing an array of elements
				int[] array1=CalculatorArrays.printReverseArray(array);
				int[] array2=CalculatorArrays.printReverseArray1(array);
				System.out.println("Reverse of an array");
				CalculatorArrays.printArray(array1);
				System.out.println("Reverse of an array");
				CalculatorArrays.printArray(array2);
				
				//Prime series from x to y using arrays
				System.out.println("Prime series");
				CalculatorArrays.primeSeriesArray(new int[100],1,100);
				
				//Fibonacci series using arrays
				CalculatorArrays.fibonacciSeriesArray(new int[10],20,50);
				
				//Maximum element from variable length argument
				CalculatorArrays.maxOfVariableArgument(new double[]{34.66,4,23,14,34.67});
				
				//Printing 2*2 matrix
				System.out.println("Displaying 2*2 matrix");
				CalculatorArrays.printMatrixArray(new int[][]{{1,3},{3,4}});
				
				//Printing random numbers using matrix arrays
				System.out.println("Displaying random numbers");
				int[][] matrix=CalculatorArrays.matrixIntArray(new int[2][2]);
				CalculatorArrays.printMatrixArray(matrix);
				
				//Calculating addition of 2 matrix
				int[][] matrix1=CalculatorArrays.matrixAddition(matrix,new int[][]{{1,3},{3,4}},new int[2][2]);
				CalculatorArrays.printMatrixArray(matrix1);
				
				//Calculating some of arrays in matrix
				System.out.println("Sum of array matrix is "+CalculatorArrays.matrixSum(matrix));
	}

}
