package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you want?");
		int n = in.nextInt();
	
		boolean numbers[] = new boolean [n+1];
		for (int i = 0; i<numbers.length; i++) {
			numbers [i] = true;
		}

		for (int i = 2; i<numbers.length; i++) {
			if (numbers[i] == true) {
				for (int j=i+i; j<numbers.length; j+=i) {
					numbers [j] = false;
				}
			}
		}
		for (int i =2; i<numbers.length; i++) {
			if (numbers[i] == true) {
				System.out.println("Prime numbers: " + i);
			}

		}
	}

}
