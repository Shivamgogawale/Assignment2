package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.request.Assignment2Request;

public interface Assignment2Service {

	boolean isPrime(int number);

	boolean isPalindrome(int number);

	int getFactorial(int number);

	int getNthFiboNumber(int number);

	boolean checkPalindrome(String str);

	int[] getFiboSeriesUptoNthNumber(int number);

	int findDiff(int number);

	List<List<Integer>> Allsubsets(Assignment2Request request);

	int getEvenSubsetCount(Assignment2Request request);

	int[] getImmidiateSmallerElement(Assignment2Request assignment2Request);

	int getMaxRectangleArea(int[][] request);

	int[] getZigZagArray(Assignment2Request assignment2Request);

	int getThirdLargestElement(Assignment2Request assignment2Request);

	List<Integer> getSmallestAndSecondSmallestElement(Assignment2Request assignment2Request);

	int getCountForAnagram(String str1, String str2);

	List<Integer> sieveOfEratosthenes(int number);

	boolean checkSubsequence(String str1, String str2);

	HashMap<String, Integer> getFirstAndLastoccuerence(Assignment2Request assignment2Request, int x);

	String mergeTwoStrings(String str1, String str2);

	boolean isGoodOrBadString(String str1);

	boolean getUniqueNumberOfOccurence(Assignment2Request assignment2Request);

	List<ArrayList<Integer>> getStockBuyAndSell(Assignment2Request assignment2Request);

	int maxProfit(Assignment2Request assignment2Request);

	int countOfMinChar(String str);

	int getMissingnumber(Assignment2Request assignment2Request);

	int getKthSmallestNumber(Assignment2Request assignment2Request, int k);

	int getEquilibriumPoint(Assignment2Request assignment2Request);

	int secondLargestElement(Assignment2Request assignment2Request);

	int getSumPairs(Assignment2Request assignment2Request, int number);

	int getMaxProduct(Assignment2Request assignment2Request);

}
