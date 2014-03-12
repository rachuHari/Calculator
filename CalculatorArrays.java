package com.felight.javaprograms;

public class CalculatorArrays {
	
	public static int[] printIntArray(int[] array){
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*100);
		}
		return array;
	}
	
	public static char[] printCharArray(char[] array){
		for(int i=0;i<array.length;i++){
				array[i]=(char)(Math.random()*100);
		}
		return array;
	}
	
	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println();
	}
	
	public static void printArrayChar(char[] array){
		for(int i=0;i<array.length;i++){
				System.out.println(array[i]);
		}
		System.out.println();
	}
	
	public static int printSumOfArray(int[] array){
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		return sum;
	}
	
	public static int printCountOfVowels(char[] ch){
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='A'||ch[i]=='a'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U'){
				count++;
			}
		}
		return count;
	}

	public static int addBetweenArray(int[] array,int from,int to){
		int sum=0;
		array[array.length-1]=to;
		for(int i=0;i<array.length;i++,from++){
			array[i]=from;
			if(array[i]<=array[array.length-1]){
				sum+=array[i];
			}
		}
		return sum;
	}
	
	public static void evenNumbersArray(int[] array,int from,int to){
		if(from<to){
			array[array.length-1]=to;
			for(int i=0;i<array.length;i++,from++){
				array[i]=from;
				if(array[i]<=array[array.length-1]){
					if(array[i]%2==0)
						System.out.println(array[i]);
				}
			}
			System.out.println();
		}
		else
			System.out.println("Not valid\n");
	}
	
	public static int[] printReverseArray(int[] array){
		int[] reversedarray=new int[array.length];
		int j=0;
		for(int i=array.length-1;i>=0;i--){
			reversedarray[j++]=array[i];
		}
		return reversedarray;
		
		// one more method
		/*for(int i=0,j=array.length-1;i<array.length;i++,j--){
				reversedarray[j]=array[i];
		}
		return reversedarray;*/
	}
	//another logic for reversing string
	public static int[] printReverseArray1(int[] array){
		int max=array.length-1;
		for(int i=0;i<array.length/2;i++){
			int temp=array[i];
			array[i]=array[max];
			array[max]=temp;
			max--;
		}
		return array;
	}
	
	public static void primeSeriesArray(int[] array,int from,int to){	
		boolean flag=true;
		int count=0;
		for(int i=from;i<array.length-1;i++)
		{
			array[i]=i;
			if(i<to){
					for(int j=2;j<i;j++){
						array[j]=j;
						if(array[i]%array[j]==0)
						{
							flag=false;
							break;
						}
						flag=true;	
					}
					if(flag && (i!=0 && i!=1))
					{
						System.out.println(array[i]);
						count++;
					}
				}
		}
		System.out.println("Prime numbers from "+from+" to "+to+" ,we have "+count+" numbers\n");
	}
	
	public static void fibonacciSeriesArray(int[] array,int maxLength,int min)
	{
		array[0]=0;
		array[1]=1;
		System.out.println("The fibonacci series");
		System.out.println(array[0]);
		System.out.println(array[1]);
		array[2]=array[0]+array[1];
		System.out.println(array[2]);
		for(int i=2;i<array.length-1;i++)
		{
				array[i+1]=array[i-1]+array[i];
				if(array[i+1]<min)
				{
					System.out.println(array[i+1]);
				}	
		}
		System.out.println();
	}
	
	public static void maxOfVariableArgument(double... num){
		double max=num[0];
		for(int i=0;i<num.length;i++){
			if(num[i]>max){
				max=num[i];
				System.out.println("Maximum of variable numbers is "+max+"\n");
			}
		}
	}
	
	public static void printMatrixArray(int[][] matrix){
		for(int row=0;row<matrix.length;row++){
			for(int col=0;col<matrix[row].length;col++){
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
		
	public static int[][] matrixIntArray(int[][] matrix){
		for(int row=0;row<matrix.length;row++){
			for(int col=0;col<matrix[row].length;col++){
				matrix[row][col]=(int)(Math.random()*100);
			}
		}
		return matrix;
	}
	
	public static int[][] matrixAddition(int[][] matrix1,int[][] matrix2,int[][] matrixresult){
		System.out.println("Elements of matrix1");
		for(int row=0;row<matrix1.length;row++){
			for(int col=0;col<matrix1[row].length;col++){
				System.out.print(matrix1[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("\nElements of matrix2");
		for(int row=0;row<matrix2.length;row++){
			for(int col=0;col<matrix2[row].length;col++){
				System.out.print(matrix2[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("\nAddition of matrix1 and matrix2 is");
		for(int row=0;row<matrixresult.length;row++){
			for(int col=0;col<matrixresult[row].length;col++){
				matrixresult[row][col]=matrix1[row][col]+matrix2[row][col];
			}
		}
		return matrixresult;
	}
	
	public static int matrixSum(int[][] matrix){
		int sum=0;
		for(int row=0;row<matrix.length;row++){
			for(int col=0;col<matrix[row].length;col++){
				sum+=matrix[row][col];
			}
		}
		return sum;
	}
	
}
