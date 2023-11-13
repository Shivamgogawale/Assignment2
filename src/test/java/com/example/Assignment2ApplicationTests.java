package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.request.Assignment2Request;
import com.example.service.Assignment2ServiceImpl;

@SpringBootTest
class Assignment2ApplicationTests {

	@Autowired
	Assignment2ServiceImpl assignment2ServiceImpl;

	@ParameterizedTest
	@ValueSource(ints = { 2, 3, 5, 7 })
	public void testPrimeNumber(int nummber) {
		assertTrue(assignment2ServiceImpl.isPrime(nummber));
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 8, 6, 4 })
	public void testNonPrimeNumber(int nummber) {
		assertFalse(assignment2ServiceImpl.isPrime(nummber));
	}

	@Test
	public void testPalindrome() {
		assertTrue(assignment2ServiceImpl.isPalindrome(121));
		assertTrue(assignment2ServiceImpl.isPalindrome(1221));
	}

	@Test
	public void testIsNotPalindrome() {
		assertFalse(assignment2ServiceImpl.isPalindrome(123));
		assertFalse(assignment2ServiceImpl.isPalindrome(12343));
	}

	@Test
	public void testFactorial() {
		assertEquals(assignment2ServiceImpl.getFactorial(5), 120);
		assertEquals(assignment2ServiceImpl.getFactorial(1), 1);
	}

	@Test
	public void testPalindromeString() {
		assertTrue(assignment2ServiceImpl.checkPalindrome("madam"));
		assertFalse(assignment2ServiceImpl.checkPalindrome("abc"));
	}

	@Test
	public void NthFibonacciTest() {
		assertEquals(assignment2ServiceImpl.getNthFiboNumber(5), 5);
		assertEquals(assignment2ServiceImpl.getNthFiboNumber(1), 1);

	}

	@Test
	public void testNthFibo() {
		int[] expectedResult = { 0, 1, 1, 2, 3, 5 };
		assertArrayEquals(assignment2ServiceImpl.getFiboSeriesUptoNthNumber(5), expectedResult);
	}

	@Test
	public void testSingledigit() {
		int[] expectedResult = { 0, 1 };
		assertArrayEquals(assignment2ServiceImpl.getFiboSeriesUptoNthNumber(1), expectedResult);
	}

	@Test
	public void confusedPappuTest() {
		assertEquals(assignment2ServiceImpl.findDiff(56), 3);
		assertEquals(assignment2ServiceImpl.findDiff(66), 33);
		assertEquals(assignment2ServiceImpl.findDiff(0), 0);
		assertEquals(assignment2ServiceImpl.findDiff(22), 0);
	}

	@Test
	public void isUniqueSubSetTest() {
		Assignment2Request numbers = new Assignment2Request();
		numbers.setNumbers(new int[] { 1, 2, 3 });
		List<List<Integer>> expectedResult = new ArrayList<>();
		expectedResult.add(new ArrayList<>());
		expectedResult.add(Arrays.asList(1));
		expectedResult.add(Arrays.asList(2));
		expectedResult.add(Arrays.asList(1, 2));
		expectedResult.add(Arrays.asList(3));
		expectedResult.add(Arrays.asList(1, 3));
		expectedResult.add(Arrays.asList(2, 3));
		expectedResult.add(Arrays.asList(1, 2, 3));
		assertEquals(assignment2ServiceImpl.Allsubsets(numbers), expectedResult);
	}

	@Test
	public void uniqueEvenSubSetCountTest() {
		int[] inputArray = { 4, 2, 1, 9, 2, 6, 5, 3 };
		Assignment2Request numbers = new Assignment2Request();
		numbers.setNumbers(inputArray);
		assertEquals(assignment2ServiceImpl.getEvenSubsetCount(numbers), 7);
	}

	@Test
	public void getMaximumRectangleAreaTest() {
		int[][] number = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		assertEquals(assignment2ServiceImpl.getMaxRectangleArea(number), 30);
	}
	
	@Test
	public void isimmediateSmallerElementTest()
	{
		int [] expectedResult= {2,1, -1, 3, -1};
		int [] inputArray= {4, 2, 1, 5, 3};
		Assignment2Request numbers = new Assignment2Request();
		numbers.setNumbers(inputArray);
		assertArrayEquals(assignment2ServiceImpl.getImmidiateSmallerElement(numbers), expectedResult);
	}
	
	@Test
	public void zigzagArrayTest()
	{
		int inputArray[]= {4, 3, 7, 8, 6, 2, 1};
		Assignment2Request numbers = new Assignment2Request();
		numbers.setNumbers(inputArray);
		int expectedResult[]= { 3 ,7 ,4, 8, 2 ,6, 1};
		assertArrayEquals(assignment2ServiceImpl.getZigZagArray(numbers), expectedResult);
	}
	
	@Test
	public void getThirdLargestElement()
	{
		int inputArray[]= {2,4,1,3,5};
		Assignment2Request numbers = new Assignment2Request();
		numbers.setNumbers(inputArray);
		assertEquals(assignment2ServiceImpl.getThirdLargestElement(numbers), 3);
	}
	
	@Test
	public void getSmallestandSecondSmallestNumber()
	{
		int inputArray[]= {5 ,2 ,4 ,3 ,5 ,6};
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		int expectedArray[]= {2,3};
		int[] actualArray = (assignment2ServiceImpl.getSmallestAndSecondSmallestElement(number)).stream().mapToInt(Integer::intValue).toArray();
		assertArrayEquals(actualArray, expectedArray);	
	}
	
	@Test
	public void isAnagramOfString()
	{
		String str1="bcadeh";
		String str2="hea";
		assertEquals(assignment2ServiceImpl.getCountForAnagram(str1, str2), 3);
	}

	@Test
	public void sieveOfErathneonsTest()
	{
		int [] expectedResult= {2 ,3 ,5 ,7};
		int[] actualArray = (assignment2ServiceImpl.sieveOfEratosthenes(10)).stream().mapToInt(Integer::intValue).toArray();
		assertArrayEquals(actualArray, expectedResult);
	}
	
	@Test
	public void checkSubsequence()
	{
		assertTrue(assignment2ServiceImpl.checkSubsequence("gksrek","geeksforgeeks"));
	}
	@Test
	public void isNotSubSequence()
	{
		assertFalse(assignment2ServiceImpl.checkSubsequence("AXY", "YADXCP"));
	}
	
	@Test
	public void checkFirstandLastOccuenence()
	{
		int[] inputArray = { 1, 3, 4, 3, 5 };
		int x=3;
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		HashMap<String, Integer> result = assignment2ServiceImpl.getFirstAndLastoccuerence(number, x);
		assertTrue(result.containsKey("First Occuernce of " + x));
		assertTrue(result.containsKey("Last Occuernce of " + x));
		int firstOccurrence = result.get("First Occuernce of " + x);
		int lastOccurrence = result.get("Last Occuernce of " + x);
		int expectedFirstOccurrence = 1;
		int expectedLastOccurrence = 3;
		assertEquals(expectedFirstOccurrence, firstOccurrence);
		assertEquals(expectedLastOccurrence, lastOccurrence);
	}
	
	@Test
	public void checkMergeStrings()
	{
		String str1="Hello";
		String str2="Bye";
		String expectedResult="HBeylelo";
		assertEquals(assignment2ServiceImpl.mergeTwoStrings(str1, str2), expectedResult);
	}
	

	@Test
	public void isGoodOrbadString()
	{
	      assertTrue(assignment2ServiceImpl.isGoodOrBadString("a?cbe?i?do?u"));
	      assertTrue(assignment2ServiceImpl.isGoodOrBadString("?"));	
	      assertFalse(assignment2ServiceImpl.isGoodOrBadString("aeiou?ae?i"));
	      assertFalse(assignment2ServiceImpl.isGoodOrBadString("a?e?i?o?u"));
	}
	
	@Test
	public void uniqueNumberOfOccurenceTest()
	{
		int inputArray[]= {1, 1, 2, 5, 5,5};
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		assertTrue(assignment2ServiceImpl.getUniqueNumberOfOccurence(number));
	}
	
	@Test
	public void notUniqueNumberOfOccurence()
	{
		int inputArray[]= {1,1,2,2};
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		assertFalse(assignment2ServiceImpl.getUniqueNumberOfOccurence(number));
	}
	@Test
	public void checkBuyandSell()
	{
		int inputArray[]= {100,180,260,310,40,535,695};
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		List <ArrayList<Integer>> expectedResult=new ArrayList<>();
		ArrayList<Integer> trade1=new ArrayList<>();
		trade1.add(0);
		trade1.add(3);
		expectedResult.add(trade1);
		ArrayList<Integer> trade2=new ArrayList<>();
		trade2.add(4);
		trade2.add(6);
		expectedResult.add(trade2);
		assertEquals(assignment2ServiceImpl.getStockBuyAndSell(number), expectedResult);		
	}
	
	@Test
	public void sellAndBuyTest()
	{
		int inputArray[]={3, 4, 1, 5};
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		assertEquals(assignment2ServiceImpl.maxProfit(number),5);
	}
	
	@Test
	public void minimumCharaterCount()
	{
		assertEquals(assignment2ServiceImpl.countOfMinChar("Shivam"), 5);
	}
	
	@Test
	public void missingArrayNumber()
	{
		int inputArray[]= {1,2,4,5};
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		assertEquals(assignment2ServiceImpl.getMissingnumber(number), 3);
	}
	
	@Test
	public void kthSmallestNumber()
	{
		int inputArray[]= {7 ,10 ,4 ,20 ,15};
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		assertEquals(assignment2ServiceImpl.getKthSmallestNumber(number, 3), 10);
	}
	
	@Test
	public void checkEquibilibriumPoint()
	{
		int inputArray[]= {1,3,5,2,2};
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		assertEquals(assignment2ServiceImpl.getEquilibriumPoint(number), 3);
	}
	
	@Test
	public void checkSecondLargestNumber()
	{
		int [] inputArray= {12, 35, 1, 10, 34, 1};
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		assertEquals(assignment2ServiceImpl.secondLargestElement(number), 34);
	}
	

	@Test
	public void countPairOfSum()
	{
		int inputArray[]={1, 5, 7, 1};
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		assertEquals(assignment2ServiceImpl.getSumPairs(number, 6),2);
	}
	
	@Test
	public void maximumProduct()
	{
		int inputArray[]= {6, -3, -10, 0, 2};
		Assignment2Request number = new Assignment2Request();
		number.setNumbers(inputArray);
		assertEquals(assignment2ServiceImpl.getMaxProduct(number),180 );
	}
}
