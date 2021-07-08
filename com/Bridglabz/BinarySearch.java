package com.Bridglabz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		File file = new File("D:\\Bridgelab\\Binarysearch");

		Scanner sc = new Scanner(System.in);
		int i;

		System.out.println("Enter number of words  to search: ");
		int n = sc.nextInt();

		String[] words = new String[n];

		System.out.println("Enter the words");
		for (i = 0; i < words.length; i++) {
			System.out.print("WORD " + (i + 1) + ": ");
			words[i] = sc.next();
		}

		System.out.println("enter the word you want to search");
		String word = sc.next();
		Arrays.sort(words);
		int index = Arrays.binarySearch(words, word);

		System.out.println(word + "=" + index);
		System.out.println();

	}

	public static int Search(int a[], int begin, int end, int item) {
		int mid;

		if (end >= begin) {
			mid = (begin + end) / 2;
			if (a[mid] == item) {
				return mid + 1;
			} else {
			}

			if (a[mid] < item) {
				return Search(a, mid + 1, end, item);
			} else {
				return Search(a, mid + 1, end, item);
			}

		}
		return -1;

	}
}
