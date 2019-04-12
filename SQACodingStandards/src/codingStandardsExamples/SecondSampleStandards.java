package codingStandardsExamples;

import codingStandardsExamples.SampleStandards.CollegeStuff;

public class SecondSampleStandards implements CollegeStuff{
	String message;
	String secondMessage; //variables written in lowerCamelCase, one declaration per line

	@Override
	public void exams() {
		message = "good luck";
		System.out.println("Exams are starting soon..."+ message);
		
	}

	@Override
	public void fyp() {
		secondMessage = " and the documentation";
		System.out.println("Final year project is due soon.." + secondMessage);
		
	}
}
