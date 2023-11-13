package com.example.request;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Assignment2Request {

	@JsonProperty(value = "numbers")
	int[] numbers;

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Assignment2Request [numbers=");
		builder.append(Arrays.toString(numbers));
		builder.append("]");
		return builder.toString();
	}
	
}
