package basicJavaPack;

import java.util.Arrays;

public class W3Asgn {
	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int arrayLength = ages.length;
		int difference = Math.abs(ages[arrayLength - arrayLength] - ages[arrayLength - 1]);
		System.out.println("Difference of the first and last number in the array of ages is: " + difference);
		
		int[] newAge = new int[ages.length];
		System.arraycopy(ages, 0, newAge, 0, ages.length);
		
		arrayLength = newAge.length;
		newAge[arrayLength-1] = 100;
		difference = Math.abs(newAge[arrayLength - arrayLength] - newAge[arrayLength - 1]);
		System.out.println("Difference of the first and last number in the array of new ages is: " + difference);

		int x = 0;
		for (int i = 0; i < newAge.length; i++) {
			x += newAge[i];
		}
		double avg = x / arrayLength;
		System.out.println("The average of the new ages is: " + avg);
		/*
		 * 
		 */
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int num = 0;
		for (int i = 0; i < names.length; i++) {
			num += names[i].length();
		}
		avg = num / names.length;
		System.out.println("The average number of letter in the names is: " + avg);
		
		String namesTwo = "";
		for (int i = 0; i < names.length; i++) {
			namesTwo += names[i] + " ";
		}
		System.out.println(namesTwo);
		/*
		 * 
		 */
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println("Use array[arr.length] to find the last element in an array");
		//
		System.out.println("Use array[0] to find the first element in an array");
		//
		num = 0;
		for (int i=0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println("The sum of names and their lengths is: " + num);
		//
		System.out.println(multiString("Hello", 8));
		//
		String firstName = "Jake";
		String lastName = "Schroff";
		String wholeName = createFullName(firstName, lastName);
		System.out.println(wholeName);
		//
		System.out.println("The sum of all the original ages is over 100: " + sumOver100(ages));
		//
		double[] dubArr = {0.4, 0.5, 1.1, 18.8, 200.42};
		System.out.println("The average of my double array is: " + avgDubArr(dubArr));
		//
		double[] dubArr2 = {1.4, 0.2, 11.3, 22.2, 101.83};
		System.out.println("Is the first array greater than the second?: " + Arr1(dubArr, dubArr2));
		//
		int[] tempatures = {56, 65, 75, 72, 80, 82, 88};
		System.out.println("Will it be hot this week?: " + isItHot(tempatures));
		//This can help find out from weather predictions if it will be hot for the week. base line was 80 degrees for each day combined
		//for 7 days (full week)
	}
	public static String multiString(String string, int number) {
		String result = "";
		for(int i = 0; i < number; i++) {
			result += string;
		}
		return result; 
	}
	public static String createFullName(String x, String y) {
		String wholeName = x + " " + y;
		return wholeName;
	}
	public static Boolean sumOver100(int[] array) {
		return Arrays.stream(array).sum() > 100;
	}
	public static double avgDubArr(double[] array) {
		return Arrays.stream(array).average().orElse(Double.NaN);
	}
	public static boolean Arr1(double[] Arr1, double[] Arr2) {
		return avgDubArr(Arr1) > avgDubArr(Arr2);
	}
	public static boolean isItHot(int[] temps) {
		return Arrays.stream(temps).sum() > 560;
	}
}