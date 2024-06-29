package CalculationOfHarmonicNumbersWithArrays;

public class Main {
	public static void main(String[]args) {
		int[] list= {1,2,3,4,5};
		double sum=0;
		for (double i:list) {
            sum += (1/i);
        }
		System.out.println(list.length/sum);
		
		
	}
}
	



