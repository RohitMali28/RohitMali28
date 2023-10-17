package com.TestGit;

public class PrintingTable {
	public static void main(String[] args) {
		for (int i = 1; i <= 18; i++) { // for table from 2 to 20
		for (int j = 1; j <= 9; j++) {
		int tableValue = i * j;
		System.out.print(tableValue + "\t"); // Print Table for each value of i from 1 to 10
		}
		System.out.println();
		}
		}
}
